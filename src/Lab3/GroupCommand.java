package Lab3;

public class GroupCommand {
    private int uniqueNumber;
    private Command[] arr;
    private int size;

    public GroupCommand() {
        uniqueNumber = 1;
        arr = new Command[10];
        size = 0;
    }

    public GroupCommand(Command[] commands) {
        uniqueNumber = 1;
        arr = new Command[commands.length];
        size = 0;

        for (int i = 0; i < commands.length; i++) {
            if (commands[i] != null) {
                arr[size] = commands[i];
                size++;
            }
        }
    }

    public int getUniqueNumber() {
        return uniqueNumber;
    }

    public void setUniqueNumber(int uniqueNumber) {
        this.uniqueNumber = uniqueNumber;
    }

    public Command[] getArray() {
        return arr;
    }

    public void setArray(Command[] arr) {
        this.arr = arr;
        size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) size++;
        }
    }

    public Command getFromArray(int index) {
        if (index < 0 || index >= size) return null;
        return arr[index];
    }

    public void setToArray(int index, Command c) {
        if (index < 0 || index >= size) return;
        arr[index] = c;
    }

    public boolean add(Command c) {
        if (size == arr.length) return false;
        arr[size] = c;
        size++;
        return true;
    }


    public void deleteBySurname(String surname) {
        int pos = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] != null && arr[i].getSurname().equals(surname)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) return;

        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = null;
        size--;
    }

   
    public void sortBySurname() {
        for (int i = 0; i < size - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < size; j++) {
                if (arr[j].getSurname().compareTo(arr[minIndex].getSurname()) < 0) {
                    minIndex = j;
                }
            }

            Command tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }
    }

    public String toString() {
        String s = "GroupCommand: uniqueNumber=" + uniqueNumber + "\n";
        for (int i = 0; i < size; i++) {
            s = s + arr[i] + "\n";
        }
        return s;
    }
}


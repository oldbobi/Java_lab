public class lab2_1 {
    public static void main(String[] args) {

        int[] a = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4};

        System.out.println("Исходный массив:");
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();

        int countSingles = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) {
                    count++;
                }
            }
            if (count == 1) {
                countSingles++;
            }
        }

        int[] index = new int[countSingles];
        int b = 0;

        for (int i = 0; i < a.length; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == a[i]) {
                    count++;
                }
            }
            if (count == 1) {
                index[b] = i;
                b++;
            }
        }

        System.out.println("Индексы элементов, встречающихся один раз:");
        for (int value : index) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

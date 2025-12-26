public class lab2_2 {
    public static void main(String[] args) {

        int[] c = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}; 
        int n = c.length;
        int[] x = new int[n]; 
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (c[i] != 0) {
                x[k] = c[i] * 4;
                k++;
            }
        }

        for (int i = 0; i < k - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < k; j++) {
                if (x[j] < x[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = x[i];
            x[i] = x[minIndex];
            x[minIndex] = temp;
        }

        System.out.println("массив x:");
        for (int value: x) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

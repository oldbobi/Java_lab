public class lab2_3 {
    public static void main(String[] args) {

        int[][] a = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[] b = new int[a.length];

        int i = 0;
        for (int[] row : a) {
            int ok = 1;

            for (int j = 0; j < row.length - 1; j++) {
                if (row[j] > row[j + 1]) {
                    ok = 0;
                    break;
                }
            }

            b[i] = ok;
            i++;
        }

        System.out.println("Матрица A:");
        for (int[] row : a) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        System.out.println("Вектор B:");
        for (int value : b) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

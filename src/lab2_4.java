public class lab2_4 {
    public static void main(String[] args) {

        int[][] a = {
                {5, 2, -1, 7},
                {3, 4, 6, -2},
                {9, 1, 8, 3},
                {-5, 2, 4, 10}
        };

        int n = a.length;

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n - 1; i++) {
            int val = a[i][i + 1];

            if (val > 0 && val < min) {
                min = val;
            }
        }


        if (min != Integer.MAX_VALUE) {
            System.out.println("минимальный положительный элемент: " + min);
        } else {
            System.out.println("положительных элементов над диагональю нет");
        }
    }
}

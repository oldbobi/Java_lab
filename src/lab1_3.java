public class lab1_3 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = 0;
        double f = 0;

        if (x <= -2) {
            y = Math.pow(x, 5) - Math.tan(2 * x - 1);
            f = Math.exp(Math.sin(x));
        } 

        if (x > -2 && x <= 1) {
            y = 3 * x * (1 + Math.exp(x + 1));
            f = x * x;
        }
         
        if (x > 1) {
            y = Math.pow(Math.sin(x), 5);
            f = Math.sqrt(Math.cos(x));
        }

        System.out.println("Y = " + y);
        System.out.println("F = " + f);
    }
}

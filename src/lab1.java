public class lab1 {
    public static void main(String[] args) {
       
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double result;

        if (a * b > 20) {
            result = 1.0 / Math.tan(b);
        } else {
            result = a / 3.0;
        }
        System.out.println(result);
    }
}
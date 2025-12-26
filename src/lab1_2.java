public class lab1_2 {
    public static void main(String[] args) {

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);

        double max = Math.max(a, b);
        double min = Math.min(a, b);

        double d = (min - 2 * Math.sqrt(max)) / (1 + max / min);

        System.out.println(d);
    }
}

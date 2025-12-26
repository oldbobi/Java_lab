package Lab4_3;

public class Main {
    public static void main(String[] args) {

        Point3D p = new Point3D(1, 2, 3);
        System.out.println(p); 

        p.setLocation(5, 6);   
        System.out.println(p); 

        p.setLocation(7, 8, 9);
        p.scale(2);
        System.out.println(p);
    }
}


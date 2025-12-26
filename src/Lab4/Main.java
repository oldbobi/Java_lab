package Lab4;

public class Main {
    public static void main(String[] args) {

        Geometry g = new Geometry();

        g.add(new Rectangle(3, 4));
        g.add(new Triangle(10, 2));
        g.add(new Circle(5));
        g.add(new Rectangle(2, 2));

        System.out.println("Все фигуры:");
        g.printAll();

        System.out.println("Прямоугольников: " + g.countRectangles());
        System.out.println("Треугольников: " + g.countTriangles());
        System.out.println("Кругов: " + g.countCircles());

        System.out.println("Общая площадь: " + g.totalArea());

        Figure last = g.pop();
        System.out.println("Pop(): " + last);
        System.out.println("Общая площадь после pop: " + g.totalArea());
    }
}


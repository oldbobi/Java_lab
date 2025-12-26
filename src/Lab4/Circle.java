package Lab4;

public class Circle extends Figure {
    private double radius;

    public Circle() {
        super("Circle");
        radius = 0;
    }

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) this.radius = radius;
    }

    
    public double getArea() {
        return Math.PI * radius * radius;
    }

    
    public String toString() {
        return "Circle: radius=" + radius + ", area=" + getArea();
    }
}


package Lab4;

public class Triangle extends Figure {
    private double base;
    private double height;

    public Triangle() {
        super("Triangle");
        base = 0;
        height = 0;
    }

    public Triangle(double base, double height) {
        super("Triangle");
        setBase(base);
        setHeight(height);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base > 0) this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) this.height = height;
    }

   
    public double getArea() {
        return 0.5 * base * height;
    }

   
    public String toString() {
        return "Triangle: base=" + base + ", height=" + height + ", area=" + getArea();
    }
}


package Lab4;

public class Rectangle extends Figure {
    private double width;
    private double height;

    public Rectangle() {
        super("Rectangle");
        width = 0;
        height = 0;
    }

    public Rectangle(double width, double height) {
        super("Rectangle");
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width > 0) this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) this.height = height;
    }

    
    public double getArea() {
        return width * height;
    }


    public String toString() {
        return "Rectangle: width=" + width + ", height=" + height + ", area=" + getArea();
    }
}


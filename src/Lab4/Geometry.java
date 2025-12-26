package Lab4;

public class Geometry {
    private Figure[] figures;
    private int size;

    public Geometry() {
        figures = new Figure[10];
        size = 0;
    }

    public Geometry(Figure[] figures) {
        this.figures = new Figure[figures.length];
        size = 0;

        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null) {
                this.figures[size] = figures[i];
                size++;
            }
        }
    }

    public Figure[] getFigures() {
        return figures;
    }

    public void setFigures(Figure[] figures) {
        this.figures = figures;
        size = 0;
        for (int i = 0; i < figures.length; i++) {
            if (figures[i] != null) size++;
        }
    }

    public boolean add(Figure f) {
        if (f == null) return false;
        if (size == figures.length) return false;
        figures[size] = f;
        size++;
        return true;
    }

    public Figure pop() {
        if (size == 0) return null;
        Figure f = figures[size - 1];
        figures[size - 1] = null;
        size--;
        return f;
    }

    public double totalArea() {
        double sum = 0;
        for (int i = 0; i < size; i++) {
            sum += figures[i].getArea();
        }
        return sum;
    }

    public int countRectangles() {
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (figures[i] instanceof Rectangle) c++;
        }
        return c;
    }

    public int countTriangles() {
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (figures[i] instanceof Triangle) c++;
        }
        return c;
    }

    public int countCircles() {
        int c = 0;
        for (int i = 0; i < size; i++) {
            if (figures[i] instanceof Circle) c++;
        }
        return c;
    }

    public void printAll() {
        for (int i = 0; i < size; i++) {
            System.out.println(figures[i]);
        }
    }
}


package Lab4;

public abstract class Figure {
    private String name;

    public Figure() {
        this.name = "Figure";
    }

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) this.name = name;
    }

    public abstract double getArea();

    public String toString() {
        return "name=" + name + ", area=" + getArea();
    }
}


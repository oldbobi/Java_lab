package Lab4_3;

public class Point3D extends Point {
    private int z;

    public Point3D() {
        super(0, 0);
        z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public void setLocation(int x, int y, int z) {
        super.setLocation(x, y);
        this.z = z;
    }

    @Override
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        z = 0;
    }

    public int getZ() {
        return z;
    }

    public void scale(int k) {
        super.scale(k);
        z = z * k;
    }

    @Override
    public String toString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}


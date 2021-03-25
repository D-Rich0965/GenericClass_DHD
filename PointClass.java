
public class PointClass{
    private int x;
    private int y;
    private int z;

    public PointClass(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3d{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}
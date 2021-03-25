
public class Square{
    private int side;
    private int area;
    private int perimeter;

    public Square(int side){
        this.side = side;
        area = side * side;
        perimeter = 4 * side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Square{" + "side=" + side + ", area=" + area + ", perimeter=" + perimeter + '}';
    }
}


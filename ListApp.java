

public class ListApp {

    public static void main(String[] args){

        FirstList<String> stringFirstList = new FirstList<>(7);
        FirstList<Square> squareFirstList = new FirstList<>();
        FirstList<PointClass> point3dFirstList = new FirstList<>(4);

        stringFirstList.addItem("Nathan Johnson");
        stringFirstList.addItem("Dylan Diedrich");
        stringFirstList.addItem("JimBob");
        stringFirstList.addItem("Chris Evans");
        stringFirstList.addItem("Colin");
        stringFirstList.addItem("Chris");
        stringFirstList.addItem("Jonathan");

        squareFirstList.addItem(new Square(6));
        squareFirstList.addItem(new Square(14));
        squareFirstList.addItem(new Square(9));
        squareFirstList.addItem(new Square(27));
        squareFirstList.addItem(new Square(13));
        squareFirstList.addItem(new Square(45));
        squareFirstList.addItem(new Square(77));
        squareFirstList.addItem(new Square(15));
        squareFirstList.addItem(new Square(23));
        squareFirstList.addItem(new Square(6));
        

        point3dFirstList.addItem(new PointClass(5,3,9));
        point3dFirstList.addItem(new PointClass(4,6,8));
        point3dFirstList.addItem(new PointClass(1,5,3));
        point3dFirstList.addItem(new PointClass(6,0,4));

        System.out.println("print string list");
        for (int i = 0; i < stringFirstList.size(); i++) {
            System.out.println(stringFirstList.getItem(i));
        }

        System.out.println("\nprint square list");
        for (int i = 0; i < squareFirstList.size(); i++) {
            System.out.println(squareFirstList.getItem(i).toString());
        }

        System.out.println("\nprint 3d point list");
        for (int i = 0; i < point3dFirstList.size(); i++) {
            System.out.println(point3dFirstList.getItem(i).toString());
        }

    }
}
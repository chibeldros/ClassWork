import java.util.Scanner;

public class Parallelepiped extends Shape implements IShapeCalc{
    double width;
    double length;
    double height;
    @Override
    public void inputData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the width");
        width = in.nextDouble();
        System.out.println("Input the length");
        length = in.nextDouble();
        System.out.println("Input the height");
        height = in.nextDouble();
    }

    @Override
    public void resultVolume() {
        shapeVolume = (width * length * height);
    }

    @Override
    public void resultSquare() {
        shapeSquare = (2.0 * (width * length + width * height + length * height));
    }
}

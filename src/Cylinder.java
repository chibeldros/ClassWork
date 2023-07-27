import java.util.Scanner;

public class Cylinder extends Shape implements IShapeCalc{

    double radius;
    double height;

    @Override
    public void inputData() {
        System.out.println("Input the radius");
        Scanner in = new Scanner(System.in);
        radius = in.nextDouble();
        System.out.println("Input the height");
        height = in.nextDouble();

    }

    @Override
    public double resultVolume() {
        return (Math.PI * Math.pow(radius,2));
    }

    @Override
    public double resultSquare() {
        return (2.0 * Math.PI * radius * (radius + height));
    }
}

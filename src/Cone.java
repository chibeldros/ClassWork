import java.util.Scanner;

public class Cone extends Shape implements IShapeCalc{
    double radius;
    double height;
    @Override
    public void inputData() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input the radius");
        radius = in.nextDouble();
        System.out.println("Input the height");
        height = in.nextDouble();
    }

    @Override
    public void resultVolume() {
        shapeVolume = (Math.PI * Math.pow(radius, 2) * height / 3);
    }

    @Override
    public void resultSquare() {
        double edge = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        shapeSquare = (Math.PI * radius * edge + Math.PI * Math.pow(radius, 2));
    }
}

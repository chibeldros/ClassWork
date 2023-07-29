import java.util.Scanner;

public class Cube extends Shape implements IShapeCalc{

    double edge;
    @Override
    public void inputData() {
        System.out.println("Input the edge");
        Scanner in = new Scanner(System.in);
        edge = in.nextDouble();
    }

    @Override
    public double resultVolume() {
        return (Math.pow(edge, 3));
    }

    @Override
    public double resultSquare() {
        return (6.0 * Math.pow(edge, 2));
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ball extends Shape implements IShapeCalc {

    double radius;
    @Override
    public void inputData() throws InputMismatchException {
        System.out.println("Input the radius");
        Scanner in = new Scanner(System.in);
        radius = in.nextDouble();
    }

    @Override
    public double resultVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius,2);
    }

    @Override
    public double resultSquare() {
        return 4.0 * Math.PI * Math.pow(radius,2);
    }
}

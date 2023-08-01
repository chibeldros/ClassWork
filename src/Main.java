import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please enter which object shape will be calculated? Available objects:");
        for (ShapeTypes shapeType : ShapeTypes.values()) {
            System.out.println(shapeType);
        }
        Scanner inp = new Scanner(System.in);
        String typeShape = inp.nextLine();
        calcShape(takeShape(ShapeTypes.valueOf(typeShape)));
    }

    private static Shape takeShape(ShapeTypes value) {
        return switch (value){
            case Ball -> new Ball();
            case Cone -> new Cone();
            case Cube -> new Cube();
            case Cylinder -> new Cylinder();
            case Parallelepiped -> new Parallelepiped();
        };
    }
    private static void calcShape(Shape shape) {
        try {
            shape.inputData();
            shape.resultVolume();
            shape.resultSquare();
            shape.resultPrint();
        } catch (InputMismatchException e) {
            System.out.println("InputMismatchException: it was not a number that was entered");;
        }
    }

}
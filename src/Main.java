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
        switch (typeShape) {
            case "Ball" -> {
                Ball testBall = new Ball();
                try {
                    testBall.inputData();
                    System.out.println("The square surf of the " + typeShape + " is " + testBall.resultSquare());
                    System.out.println("The volume of the " + typeShape + " is " + testBall.resultVolume());
                } catch (InputMismatchException e){
                    System.out.println("Input error, not a number entered!");
                }
            }
            case "Cylinder" -> {
                Cylinder testCyl = new Cylinder();
                try {
                    testCyl.inputData();
                    System.out.println("The square surf of the " + typeShape + " is " + testCyl.resultSquare());
                    System.out.println("The volume of the " + typeShape + " is " + testCyl.resultVolume());
                } catch (InputMismatchException e){
                    System.out.println("Input error, not a number entered!");
                }
            }
            case "Cube" -> {
                Cube testCube = new Cube();
                try {
                    testCube.inputData();
                    System.out.println("The square surf of the " + typeShape + " is " + testCube.resultSquare());
                    System.out.println("The volume of the " + typeShape + " is " + testCube.resultVolume());
                } catch (InputMismatchException e){
                    System.out.println("Input error, not a number entered!");
                }
            }
            case "Parallelepiped" -> {
                Parallelepiped testParallelepiped = new Parallelepiped();
                try {
                    testParallelepiped.inputData();
                    System.out.println("The square surf of the " + typeShape + " is " + testParallelepiped.resultSquare());
                    System.out.println("The volume of the " + typeShape + " is " + testParallelepiped.resultVolume());
                } catch (InputMismatchException e){
                    System.out.println("Input error, not a number entered!");
                }
            }
            case "Cone" -> {
                Cone testCone = new Cone();
                try {
                    testCone.inputData();
                    System.out.println("The square surf of the " + typeShape + " is " + testCone.resultSquare());
                    System.out.println("The volume of the " + typeShape + " is " + testCone.resultVolume());
                } catch (InputMismatchException e){
                    System.out.println("Input error, not a number entered!");
                }
            }
            default -> System.out.println("The entered shape object is not supported.");
        }
        }
    }
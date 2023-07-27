import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.println("Input the shape type");
        Scanner inp = new Scanner(System.in);
        String typeShape = inp.nextLine();
            switch (typeShape){
                case "Cylinder":
                    Cylinder testCyl = new Cylinder();
                    testCyl.inputData();
                    System.out.println("The square surf of the " + typeShape + " is " + testCyl.resultSquare());
                    System.out.println("The volume of the " + typeShape + " is " + testCyl.resultVolume());;
            }
        }
    }
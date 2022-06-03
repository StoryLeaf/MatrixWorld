import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Step one done.");

        //Get user input for matrix func.

        System.out.print("\nRows: ");
        int ROWS = input.nextInt();
        System.out.print("Cols: ");
        int COLS = input.nextInt();
        TwoDimensionalMatrix matrix = new TwoDimensionalMatrix(ROWS, COLS);
        System.out.println("\nStep two Done.");
        matrix.OutputMatrix();
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class RationalClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Rational rational1;
        Rational rational2;
        String input1;
        String input2;
        try {
            while (true) {
                System.out.print("Enter first rational: ");
                input1 = scanner.nextLine();
                rational1 = Rational.parseRational(input1);

                System.out.print("Enter second rational: ");
                input2 = scanner.nextLine();
                rational2 = Rational.parseRational(input2);

                System.out.println("Result of adding: " + rational1.add(rational2));
                System.out.println("Result of subtract: " + rational1.subtract(rational2));

                System.out.println("Result of multiply: " + rational1.multiply(rational2));
                System.out.println("Result of divide: " + rational1.divide(rational2));

                System.out.print("Result of comparison: ");
                if (rational1.compareTo(rational2) == 1) {
                    System.out.println("true");
                } else if (rational1.compareTo(rational2) == -1) {
                    System.out.println("false");
                } else {
                    System.out.println("equal");
                }
            }
        } catch (InputMismatchException e) {
            System.exit(0);
        }
    }
}
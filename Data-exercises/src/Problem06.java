import java.util.Scanner;

public class Problem06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pound = scanner.nextDouble();

        System.out.print("Enter height in inches: ");
        double inch = scanner.nextDouble();

        double kg = pound / 2.20462;
        double meter = inch * 0.0254;

        double result = kg / (meter * meter);

        System.out.println("Body Mass Index is " + result);
    }
}
import java.util.Scanner;

public class Problem09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 1st integer: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter 2nd integer: ");
        double num2 = scanner.nextDouble();

        System.out.printf("Sum of two integers: %.0f%n", sum(num1, num2));
        System.out.printf("Difference of two integers: %.0f%n", difference(num1, num2));
        System.out.printf("Product of two integers: %.0f%n", product(num1, num2));
        System.out.printf("Average of two integers: %.0f%n", average(num1, num2));
        System.out.printf("Distance of two integers: %.0f%n", distance(num1, num2));
        System.out.printf("Max of two integers: %.0f%n", max(num1, num2));
        System.out.printf("Min of two integers: %.0f%n", min(num1, num2));
    }

    public static double sum(double num1, double num2) {
        return num1 + num2;
    }

    public static double difference(double num1, double num2) {
        return num1 - num2;
    }

    public static double product(double num1, double num2) {
        return num1 * num2;
    }

    public static double average(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static double distance(double num1, double num2) {
        return Math.abs(num1 - num2);
    }

    public static double max(double num1, double num2) {
        return Math.max(num1, num2);
    }

    public static double min(double num1, double num2) {
        return Math.min(num1, num2);
    }
}
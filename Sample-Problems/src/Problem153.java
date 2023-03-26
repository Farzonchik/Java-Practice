import java.util.Scanner;

public class Problem153 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Input second number: ");
        double num2 = scanner.nextDouble();

        System.out.println(between(num1, num2));
    }

    static boolean between(double num, double num2) {
        return num <= 1 && num > 0 && num2 <= 1 && num2 > 0;
    }
}
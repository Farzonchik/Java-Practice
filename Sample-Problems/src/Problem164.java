import java.util.Scanner;

public class Problem164 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the dividend: ");
        double dividend = scanner.nextDouble();

        System.out.print("Input the dividend: ");
        double divider = scanner.nextDouble();

        System.out.printf("Result: %.1f", subtraction(dividend,divider));
    }

    static double subtraction(double dividend, double divider) {
        double sum = dividend / divider;
        double result = 0;

        for (int i = 0; i < sum; i++) {
            dividend -= divider;
            if (dividend == sum){
                result = dividend;
            }
        }

        return result;
    }
}
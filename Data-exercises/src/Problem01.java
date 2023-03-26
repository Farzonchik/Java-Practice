import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a degree in Fahrenheit: ");
        double degree = scanner.nextInt();
        double Fahrenheit = (degree - 32) * 5 / 9;

        System.out.printf("%.1f degree Fahrenheit is equal to %.1f in Celsius%n", degree, Fahrenheit);
    }
}
import java.util.Scanner;

public class Problem03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000: ");
        int num = scanner.nextInt();

        System.out.println("The sum of all digits in " + num + " is " + sumOfDigits(num));
    }

    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum;
    }
}

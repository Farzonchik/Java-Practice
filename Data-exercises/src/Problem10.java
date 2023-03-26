import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        while (num != 0) {
            int digit = num % 10;
            System.out.print(digit + " ");
            num /= 10;
        }
        System.out.println();
    }
}
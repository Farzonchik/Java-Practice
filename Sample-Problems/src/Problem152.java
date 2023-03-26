import java.util.Scanner;

public class Problem152 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Input third number: ");
        int num3 = scanner.nextInt();
        System.out.print("Input third number: ");
        int num4 = scanner.nextInt();

        if (num1 == num2 && num1 == num3 && num1 == num4){
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }
    }
}
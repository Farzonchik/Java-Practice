import java.util.Scanner;

public class Problem52 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number : ");
        int num1 = scanner.nextInt();

        System.out.print("Input the second number : ");
        int num2 = scanner.nextInt();

        System.out.print("Input the third number : ");
        int num3 = scanner.nextInt();

        System.out.println("The result is: " + result(num1,num2,num3));
    }

    public static boolean result(int num1, int num2, int num3) {
        return num1 + num2 == num3;
    }
}
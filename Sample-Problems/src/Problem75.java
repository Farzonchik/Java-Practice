import java.util.Scanner;

public class Problem75 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("List of numbers in array: ");
        final int NUM = scanner.nextInt();

        System.out.println(array(NUM));
    }

    public static boolean array(int num) {
        int[] list = new int[num];

        System.out.print("Test Data: array = ");
        for (int i = 0; i < num; i++) {
            list[i] = scanner.nextInt();
        }

        return list[0] == list[num - 1];
    }
}
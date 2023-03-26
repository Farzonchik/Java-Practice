import java.util.Scanner;

public class Problem74 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Number of Array list: ");
        final int NUM = scanner.nextInt();

        System.out.println(list(NUM));
    }

    public static boolean list(int num) {

        int[] list = new int[num];
        System.out.print("Test Data: array = ");
        for (int i = 0; i < num; i++) {
            list[i] = scanner.nextInt();
        }

        return list[0] == 10 || list[num - 1] == 10;
    }
}

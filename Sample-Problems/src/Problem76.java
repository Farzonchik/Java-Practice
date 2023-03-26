import java.util.Scanner;

public class Problem76 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("List of numbers in array: ");
        final int NUM = scanner.nextInt();

        System.out.println(list(NUM));
    }

    public static boolean list(int num) {
        int[] list1 = new int[num];
        int[] list2 = new int[num];

        System.out.print("array1 = ");
        for (int i = 0; i < num; i++) {
            list1[i] = scanner.nextInt();
        }

        System.out.print("array2 = ");
        for (int i = 0; i < num; i++) {
            list2[i] = scanner.nextInt();
        }

        return list1[0] == list2[0] || list1[num - 1] == list2[num - 1];
    }
}

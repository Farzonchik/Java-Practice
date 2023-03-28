import java.util.Scanner;

public class URI2157 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();

        for (int i = 0; i < cases; i++) {
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();

            int[] list = new int[secondNum - firstNum + 1];
            list[0] = firstNum;
            for (int j = 1; j < list.length; j++) {
                list[j] = ++firstNum;
            }

            StringBuilder reversed = new StringBuilder();
            for (int j : list) {
                reversed.append(j);
            }

            System.out.print(reversed);
            reversed.reverse();
            System.out.println(reversed);
        }
    }
}
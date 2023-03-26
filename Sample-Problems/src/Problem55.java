import java.util.Scanner;

public class Problem55 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int seconds = scanner.nextInt();

        int minutes = 0;
        int hours = 0;

        for (int i = 1; i <= seconds; i++) {
            if (i % 60 == 0) {
                minutes++;
            }
        }

        for (int i = 1; i <= minutes; i++) {
            if (i % 60 == 0){
                hours++;
            }
        }

        int minute = minutes - (hours * 60);
        int second = seconds - ((hours * 60 * 60) + (minute * 60));

        System.out.println(hours + ":" + minute + ":" + second);
    }
}

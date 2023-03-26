import java.util.Scanner;

public class Problem04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of minutes: ");
        int minutes = scanner.nextInt();

        result(minutes);
    }

    public static void result(int minute) {
        double years = Math.round(minute / (60 * 24 * 365));
        double days = Math.round((minute - (years * 365 * 24 * 60))) / (24 * 60);
        System.out.println(years + " years and " + days + " days");
    }
}
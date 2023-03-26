import java.util.Scanner;

public class Problem02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for inch: ");
        double inch = scanner.nextInt();

        double meter = inch * 0.0254;

        System.out.printf("%.1f inch is %.1f meters%n", inch, meter);
    }
}

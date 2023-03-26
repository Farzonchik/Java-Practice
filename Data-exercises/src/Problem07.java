import java.util.Scanner;

public class Problem07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a distance in meters: ");
        double distance = scanner.nextDouble();

        System.out.print("Enter hour: ");
        double hour = scanner.nextDouble();
        System.out.print("Enter minutes: ");
        double minute = scanner.nextDouble();
        System.out.print("Enter second: ");
        double second = scanner.nextDouble();

        double mile = distance / 1609;
        double km = distance / 1000;
        double hours = hour + ((minute / 60) + (second / 3600));

        double meterSecond = distance / (second + ((hours * 3600) + (minute * 60)));
        double kmH = km / hours;
        double mlH = mile / hours;

        System.out.printf("Your speed in meters/second is %.8f%n", meterSecond);
        System.out.printf("Your speed in km/h is %.8f%n", kmH);
        System.out.printf("Your speed in miles/h is %.8f%n", mlH);
    }
}
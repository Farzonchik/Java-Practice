import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of animal: ");
        String name = scanner.nextLine();
        System.out.print("Enter the sound of animal: ");
        String sound = scanner.nextLine();
        System.out.print("Enter the age of animal: ");
        int age = scanner.nextInt();

        Animal animal = new Cat(name, sound, age);

        System.out.println(animal);
    }
}
import java.util.Scanner;

public class StringMainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String name = scanner.next();

        StringClass stringClass = new StringClass(name.toCharArray());
        System.out.println("String java standard class output: " + name);

        System.out.println("My own String class output: " + stringClass);

        try {
            String substring = stringClass.substring(0, name.length() / 2).toString();
            System.out.println("Substring of the given string input: " + substring);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        System.out.print("Enter another string to compare: ");
        String name2 = scanner.next();
        StringClass stringClass1 = new StringClass(name2.toCharArray());

        if (stringClass.equals(stringClass1)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        System.out.println("Lowercase mode of Java String class: " + name.toLowerCase());
        System.out.println("Lowercase mode of my own String class: " + stringClass.toLowerCase());

        System.out.println("Checking valueOf() from my own String class: " + stringClass.valueOf(1));
    }
}
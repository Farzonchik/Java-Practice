import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Field field = new Field();
        field.construct();

        Turtle turtle1 = new Turtle(field, 0, 0, 1, 0);
        Turtle turtle2 = new Turtle(field, field.getWIDTH() - 1, field.getHEIGHT() - 1, -1, 0);
        Turtle turtle3 = new Turtle(field, field.getWIDTH() / 2, field.getHEIGHT() / 2, -1, 0);

        Turtle[] turtles = new Turtle[]{turtle1, turtle2, turtle3};
        Turtle turtle = turtle1;


        while (scanner.hasNextLine()) {
            String[] input = scanner.nextLine().split(" ");
            String command = input[0].trim();

            switch (command) {
                case "select":
                    try {
                        int selection = Integer.parseInt(input[1]);
                        if (selection < 0 || selection > turtles.length) {
                            throw new IllegalArgumentException("There is no turtle with " + selection + " number.");
                        }
                        turtle = turtles[selection - 1];
                    } catch (IllegalArgumentException e) {
                        System.err.println(e.getMessage());
                    }
                    break;

                case "display":
                    field.display(turtles);
                    break;

                case "move":
                    try {
                        int step = Integer.parseInt(input[1]);
                        if (step < 0) {
                            throw new IllegalArgumentException("Move cannot be negative. Try again.");
                        }
                        turtle.move(step);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case "turn-right":
                    turtle.turnRight();
                    break;
                case "turn-left":
                    turtle.turnLeft();
                    break;
                case "pen-down":
                    turtle.penDown();
                    break;
                case "pen-up":
                    turtle.penUp();
                    break;

                case "exit":
                    System.exit(0);
            }
        }
    }
}
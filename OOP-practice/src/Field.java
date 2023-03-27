public class Field {
    final char DOT = '.';
    final char TURTLE = 'T';
    final char STAR = '*';

    private final int WIDTH = 20;
    private final int HEIGHT = 20;

    private char[][] field;

    public void construct() {
        field = new char[HEIGHT][WIDTH];

        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                field[i][j] = DOT;
            }
        }
    }

    public boolean areCoordinateInside(int x, int y) {
        return x >= 0 && x < WIDTH &&
                y >= 0 && y < HEIGHT;
    }

    public void mark(int x, int y) {
        if (areCoordinateInside(x, y)) {
            field[y][x] = STAR;
        }
    }

    public void display(Turtle[] turtles) {
        for (int i = 0; i < HEIGHT; i++) {
            columnLoop:
            for (int j = 0; j < WIDTH; j++) {
                for (Turtle turtle : turtles) {
                    if (j == turtle.getX() && i == turtle.getY()) {
                        System.out.print(TURTLE);
                        continue columnLoop;
                    }
                }
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    public int getWIDTH() {
        return WIDTH;
    }

    public int getHEIGHT() {
        return HEIGHT;
    }
}
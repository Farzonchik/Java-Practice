public class Turtle {
    private int x, y;
    private int dx, dy;
    boolean penDown;
    Field field;

    public Turtle(Field newField, int x, int y, int dx, int dy) {
        this.x = x;
        this.y = y;

        this.dx = dx;
        this.dy = dy;

        penDown = false;
        field = newField;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void penUp() {
        penDown = true;
    }

    public void penDown() {
        penDown = false;
    }

    public void turnRight() {
        int temp = dx;
        dx = -dy;
        dy = temp;
    }

    public void turnLeft() {
        int temp = dx;
        dx = dy;
        dy = -temp;
    }

    public void move(int steps) {
        for (int i = 0; i < steps; i++) {
            int nextX = x + dx;
            int nextY = y + dy;

            if (!field.areCoordinateInside(nextX, nextY)) {
                break;
            }

            if (penDown) {
                field.mark(x, y);
            }

            x = nextX;
            y = nextY;
        }
    }
}
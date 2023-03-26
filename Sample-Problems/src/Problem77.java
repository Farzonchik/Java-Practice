public class Problem77 {
    public static void main(String[] args) {
        int[] array1 = {50, -20, 0};
        int[] array2 = {5, -50, 10};

        System.out.print("Array1: [");
        for (int i = 0; i < array1.length; i++) {
            if (i == 2) {
                System.out.print(array1[i]);
            } else {
                System.out.print(array1[i] + ", ");
            }
        }

        System.out.println("]");

        System.out.print("Array2: [");
        for (int i = 0; i < array2.length; i++) {
            if (i == 2) {
                System.out.print(array2[i]);
            } else {
                System.out.print(array2[i] + ", ");
            }
        }
        System.out.println("]");

        System.out.println("New Array: [" + array1[0] + ", " + array2[array2.length - 1] + "]");
    }
}

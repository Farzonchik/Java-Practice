public class Problem162 {
    public static void main(String[] args) {
        int[] num = {1, 4, 17, 7, 25, 3, 100};
        double sum = 0;

        System.out.print("[");
        for (int i = 0; i < num.length; i++) {
            sum += num[i];

            if (i == num.length - 1) {
                System.out.print(num[i]);
            } else {
                System.out.print(num[i] + ", ");
            }
        }
        System.out.println("]");

        double average = Math.round(sum / num.length);
        System.out.printf("The average of the said array is: %.1f%n", average);

        for (int i = 0; i < num.length; i++) {
            if (num[i] > average){
                System.out.println(num[i]);
            }
        }
    }
}

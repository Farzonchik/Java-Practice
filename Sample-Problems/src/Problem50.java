public class Problem50 {
    public static void main(String[] args) {
        final int NUM = 100;
        System.out.println("Divided by 3: ");

        for (int i = 1; i <= NUM; i++) {
            if (i % 3 == 0) {
                System.out.print(i + ", ");
            }
            if (i % 25 == 0){
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Divided by 5: ");
        for (int i = 1; i <= NUM; i++) {
            if (i % 5 == 0) {
                System.out.print(i + ", ");
            }
            if (i % 25 == 0){
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Divided by 3 & 5: ");
        for (int i = 1; i <= NUM; i++) {
            if (i % 3 == 0 && i % 5 ==0) {
                System.out.print(i + ", ");
            }
        }
    }
}

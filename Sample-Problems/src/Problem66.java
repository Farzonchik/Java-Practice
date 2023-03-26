public class Problem66 {
    public static void main(String[] args) {
        final int NUM = 1000;

        primeNumber(NUM);
    }

    public static void primeNumber(int finalNum) {
        int sum = 0;
        int sumOfPrimeNum = 0;

        for (int i = 1; i <= finalNum; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    sum++;
                }
            }

            if (sum == 2) {
                sumOfPrimeNum++;
            }
            sum -= sum;
        }

        System.out.println(sumOfPrimeNum);
    }
}

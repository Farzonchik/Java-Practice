public class GCD {
    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        if (b == 0) {
            return a;
        }

        if (a < 0) {
            a = -a;
        }
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }

        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
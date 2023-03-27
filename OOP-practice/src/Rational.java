public class Rational {
    private final int numerator;
    private final int denominator;

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator can't be equal to zero.");
        }
        int gcd = GCD.gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational add(Rational rational) {
        int newNumerator = (this.numerator * rational.denominator) + (rational.numerator * this.denominator);
        int newDenominator = this.denominator * rational.denominator;

        return new Rational(newNumerator, newDenominator);
    }

    public Rational subtract(Rational rational) {
        int newNumerator = (this.numerator * rational.denominator) - (rational.numerator * this.denominator);
        int newDenominator = this.denominator * rational.denominator;

        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiply(Rational rational) {
        int newNumerator = this.numerator * rational.numerator;
        int newDenominator = this.denominator * rational.denominator;

        return new Rational(newNumerator, newDenominator);
    }

    public Rational divide(Rational rational) {
        int newNumerator = this.numerator * rational.denominator;
        int newDenominator = this.denominator * rational.numerator;

        return new Rational(newNumerator, newDenominator);
    }

    public int compareTo(Rational rational) {
        int compare;
        int newNumerator = this.numerator * rational.denominator;
        int otherNumerator = this.denominator * rational.numerator;

        compare = Integer.compare(newNumerator, otherNumerator);

        return compare;
    }

    public static Rational parseRational(String string) {
        int index = string.indexOf('/');

        if (index == -1) {
            throw new IllegalArgumentException("Error: Can't parse '" + string + "' as input.");
        }

        String numerator = string.substring(0, index);
        String denominator = string.substring(index + 1);

        if (numerator.equals("") || denominator.equals("")) {
            throw new IllegalArgumentException("Error: Can't parse '" + string + "' as input.\"");
        }

        int numeratorInt = Integer.parseInt(numerator);
        int denominatorInt = Integer.parseInt(denominator);

        return new Rational(numeratorInt, denominatorInt);
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }
}
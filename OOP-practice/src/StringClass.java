public class StringClass {
    private final char[] character;

    public StringClass(char[] character) {
        this.character = new char[character.length];
        System.arraycopy(character, 0, this.character, 0, character.length);
    }

    public int length() {
        return character.length;
    }

    public char charAt(int index) {
        return character[index];
    }

    public StringClass substring(int begin, int end) {
        if (begin < 0 || end > character.length) {
            throw new IllegalArgumentException("Wrong input for begin and end. Please try again.");
        }

        char[] newChar = new char[end - begin];
        System.arraycopy(character, begin, newChar, 0, newChar.length);
        return new StringClass(newChar);
    }

    public StringClass toLowerCase() {
        char[] lowerChars = new char[character.length];

        for (int i = 0; i < character.length; i++) {
            if (character[i] >= 'A' && character[i] <= 'Z') {
                lowerChars[i] = (char) (character[i] + ('a' - 'A'));
            } else {
                lowerChars[i] = character[i];
            }
        }

        return new StringClass(lowerChars);
    }

    public boolean equals(StringClass s) {
        if (s == null || s.length() != this.length()) {
            return false;
        }

        for (int i = 0; i < this.length(); i++) {
            if (this.charAt(i) != s.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public StringClass valueOf(int index) {
        if (index == 0) {
            return new StringClass(new char[]{'0'});
        }

        boolean isNegative = false;
        if (index < 0) {
            isNegative = true;
            index = -index;
        }

        int digitCount = (int) Math.floor(Math.log10(index) + 1);
        char[] valueChars = new char[digitCount + (isNegative ? 1 : 0)];

        if (isNegative) {
            valueChars[0] = '-';
        }

        for (int i = digitCount - 1; i >= 0; i--) {
            valueChars[isNegative ? i + 1 : i] = (char) ('0' + index % 10);

            index /= 10;
        }

        return new StringClass(valueChars);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : character) {
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
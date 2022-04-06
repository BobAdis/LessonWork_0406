package main.tasks;

public class Power {

    public static void main(String[] args) {

    }

    /**
     * Hatványozást végez: a base értékét az exponent kitevőre emeli.
     */
    public static int power(int base, int exponent) {
        int result = 1;

        for (int i = 0; i < exponent; i++) {
            result *= base;
        }
        return result;
    }

}

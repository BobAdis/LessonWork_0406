package main.tasks;

public class GreatestCommonDivisor {

    public static void main(String[] args) {

    }

    /**
     * Megtalálja két nemnegatív egész szám legnagyobb közös osztóját.
     */
    public static int findGCD(int number1, int number2) {
        int smaller = (number1 < number2 ? number1 : number2);
        int bigger = (number1 > number2 ? number1 : number2);

        while (smaller != bigger) {
            int sub = bigger - smaller;

            bigger = (smaller > sub ? smaller : sub);
            smaller = (smaller < sub ? smaller : sub);
        }
        return smaller;
    }
}

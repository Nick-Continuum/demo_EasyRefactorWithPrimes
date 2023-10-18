package be.multimedi.primes.test;

import be.multimedi.primes.domain.PrimeFactorial;

public class PrimeFactorialTest {
    private static PrimeFactorial v1 = new PrimeFactorial(8);
    private static PrimeFactorial v2 = new PrimeFactorial(15);
    private static PrimeFactorial v3 = new PrimeFactorial(153);
    private static PrimeFactorial v4 = new PrimeFactorial(12523);

    public static void run() {
        calculatesFactorialCorrectly();
    }

    private static void calculatesFactorialCorrectly() {
        System.out.println("Prime factorial class correctly broke down the number in factorial prime numbers");

        System.out.println("is " + (v1.represent().equals("8 = 2 * 2 * 2")));
        System.out.println("is " + (v2.represent().equals("15 = 3 * 5")));
        System.out.println("is " + (v3.represent().equals("153 = 3 * 3 * 17")));
        System.out.println("is " + (v4.represent().equals("12523 = 7 * 1789")));

        System.out.println(" ");
    }
}

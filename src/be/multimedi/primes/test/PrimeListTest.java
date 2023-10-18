package be.multimedi.primes.test;

import be.multimedi.primes.domain.PrimesList;

public class PrimeListTest {
    private static PrimesList v1 = new PrimesList(8);
    private static PrimesList v2 = new PrimesList(11);
    private static PrimesList v3 = new PrimesList(32);
    private static PrimesList v4 = new PrimesList(156);

    public static void run() {
        createsPrimeListCorrectly();
    }

    private static void createsPrimeListCorrectly() {
        System.out.println("Prime List class created the correct prime list with the given limit");

        System.out.println("is " + (v1.getPrimes().length == 4));
        System.out.println("is " + (v2.getPrimes().length == 5));
        System.out.println("is " + (v3.getPrimes().length == 11));
        System.out.println("is " + (v4.getPrimes().length == 36));

        System.out.println(" ");
    }
}

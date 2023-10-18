package be.multimedi.primes.test;

import be.multimedi.primes.domain.Prime;

public class PrimeTest {
    private static Prime v1= new Prime(2);
    private static Prime v2= new Prime(8);
    private static Prime v3= new Prime(33);
    private static Prime v4 = new Prime(v3);
    public static void run() {
        primeClassConstructsOnlyWithPrimeValues();
    }

    public static void primeClassConstructsOnlyWithPrimeValues() {
        System.out.println("Prime Class constructs with the next Prime number it can find");

        System.out.println("is " + (v1.getValue() == 2));
        System.out.println("is " + (v2.getValue() == 11));
        System.out.println("is " + (v3.getValue() == 37));
        System.out.println("is " + (v4.getValue() == 41));

        System.out.println(" ");
    }
}

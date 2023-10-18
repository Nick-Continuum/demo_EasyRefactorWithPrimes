package be.multimedi.primes.domain;

import java.util.Arrays;

public class PrimesList {
    private final Prime[] primes;
    private final int limit;

    public PrimesList(int limit) {
        this.limit = limit;
        this.primes = calculatePrimeNumbers();
    }

    public Prime[] getPrimes() {
        return primes;
    }

    public int[] getPrimesValues() {
        int[] result = new int[primes.length];
        for (int i = 0; i < primes.length; i++) {
            result[i] = primes[i].getValue();
        }

        return result;
    }

    public int getLimit() {
        return limit;
    }

    private Prime[] calculatePrimeNumbers() {
        Prime[] result = new Prime[] {};

        Prime nextPrime = new Prime(2);
        while (nextPrime.getValue() <= limit) {
            result = Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = nextPrime;
            nextPrime = new Prime(nextPrime);
        }

        return result;
    }

}

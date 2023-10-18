package be.multimedi.primes.domain;

import java.util.Objects;

public class Prime {
    private final int primeNumber;

    public Prime(int potentialPrimeNumber) {
        potentialPrimeNumber = validatePotentialPrime(potentialPrimeNumber);
        this.primeNumber = calculateNextPrime(potentialPrimeNumber);
    }

    public Prime(Prime knownPrime) {
        this(knownPrime.getValue() + 1);
    }

    public int getValue() {
        return primeNumber;
    }

    private int validatePotentialPrime(int number) {
        if (number == 1 || number == 0) throw new RuntimeException("Invalid potential prime number. Must be different from 1 and 0");
        return Math.abs(number);
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if ( number % i == 0 ) {
                return false;
            }
        }
        return true;
    }

    private int calculateNextPrime(int number) {
        int result = number;
        while (!isPrime(result)) {
            result++;
        }
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Prime prime = (Prime) o;
        return primeNumber == prime.primeNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(primeNumber);
    }

    @Override
    public String toString() {
        return String.valueOf(primeNumber);
    }
}

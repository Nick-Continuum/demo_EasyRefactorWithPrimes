package be.multimedi.primes.domain;

import java.util.ArrayList;
import java.util.List;

public class PrimesList {
    private final List<Prime> primes;
    private final int limit;

    public PrimesList(int limit) {
        this.limit = limit;
        primes = calculatePrimeNumbers();
    }

    public List<Prime> getPrimes() {
        return new ArrayList<>(primes);
    }

    public int getLimit() {
        return limit;
    }

    private List<Prime> calculatePrimeNumbers() {
        List<Prime> result = new ArrayList<>();

        Prime nextPrime = new Prime(2);
        while (nextPrime.getValue() <= limit) {
            result.add(nextPrime);
            nextPrime = new Prime(nextPrime);
        }

        return result;
    }

}

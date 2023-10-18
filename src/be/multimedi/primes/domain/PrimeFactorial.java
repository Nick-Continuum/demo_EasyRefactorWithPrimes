package be.multimedi.primes.domain;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorial {
    private final int numberToProcess;
    private final PrimesList primes;
    private final List<Prime> primeFactors;
    public PrimeFactorial(int numberToSplit) {
        this.numberToProcess = numberToSplit;
        primes = new PrimesList(numberToSplit);
        primeFactors = calculatePrimeFactors();
    }

    public List<Prime> getPrimeFactors() {
        return new ArrayList<>(primeFactors);
    }

    public int getNumberToProcess() {
        return numberToProcess;
    }

    public PrimesList getPrimes() {
        return primes;
    }

    private List<Prime> calculatePrimeFactors() {
        List<Prime> tempPrimeFactors = new ArrayList<>();
        int reducableNumber = numberToProcess;

        while (reducableNumber > 1) {
            tempPrimeFactors.add(calculateNextPrimeFactor(reducableNumber));
            reducableNumber /= tempPrimeFactors.getLast().getValue();
        }

        return tempPrimeFactors;
    }

    private Prime calculateNextPrimeFactor(int dividableNumber) {
        for (Prime prime: primes.getPrimes()) {
            if (dividableNumber % prime.getValue() == 0) {
                return prime;
            }
        }
        return new Prime(dividableNumber);
    }

    public String represent() {
        StringBuilder representation = new StringBuilder(numberToProcess + " = ");
        for (int i = 0; i < primeFactors.size(); i++) {
            representation.append(primeFactors.get(i));
            if (i < primeFactors.size() - 1) {
                representation.append(" * ");
            }
        }
        return representation.toString();
    }
}

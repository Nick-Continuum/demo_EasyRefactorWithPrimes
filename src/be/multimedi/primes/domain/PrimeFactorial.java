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
        return primeFactors;
    }

    public int getNumberToProcess() {
        return numberToProcess;
    }

    public PrimesList getPrimes() {
        return primes;
    }

    private List<Prime> calculatePrimeFactors() {
        int reducableNumber = numberToProcess;

        List<Prime> tempPrimeFactors = new ArrayList<>();
        while (reducableNumber > 1) {
            for (Prime prime: primes.getPrimes()) {
                if (reducableNumber % prime.getValue() == 0) {
                    tempPrimeFactors.add(prime);
                    reducableNumber /= prime.getValue();
                    break;
                }
            }
        }

        return tempPrimeFactors;
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

package be.multimedi.primes.domain;

import java.util.Arrays;

public class PrimeFactorial {
    private final int numberToProcess;
    private final PrimesList primes;
    private final Prime[] primeFactors;
    public PrimeFactorial(int numberToSplit) {
        this.numberToProcess = numberToSplit;
        primes = new PrimesList(numberToSplit);
        primeFactors = calculatePrimeFactors(numberToSplit);
    }

    public Prime[] getPrimeFactors() {
        return primeFactors;
    }

    public int getNumberToProcess() {
        return numberToProcess;
    }

    public PrimesList getPrimes() {
        return primes;
    }

    public Prime[] calculatePrimeFactors(int numberWithinRange) {
        if (numberWithinRange > numberToProcess) throw new IllegalArgumentException("number must be smaller than the initial number to process");

        Prime[] tempPrimeFactors = new Prime[] {};
        while (numberWithinRange > 1) {
            for (int i = 0; i < primes.getPrimes().length; i++) {
                if (numberWithinRange % primes.getPrimes()[i].getValue() == 0) {
                    tempPrimeFactors = Arrays.copyOf(tempPrimeFactors, tempPrimeFactors.length + 1);
                    tempPrimeFactors[tempPrimeFactors.length - 1] = primes.getPrimes()[i];
                    numberWithinRange /= primes.getPrimes()[i].getValue();
                    break;
                }
            }
        }

        return tempPrimeFactors;
    }

    public String represent() {
        StringBuilder representation = new StringBuilder(numberToProcess + " = ");
        for (int i = 0; i < primeFactors.length; i++) {
            representation.append(primeFactors[i]);
            if (i < primeFactors.length - 1) {
                representation.append(" * ");
            }
        }
        return representation.toString();
    }
}

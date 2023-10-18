package be.multimedi.primes;

import be.multimedi.primes.domain.PrimeFactorial;
import be.multimedi.primes.test.PrimeTest;
import be.multimedi.primes.test.PrimeFactorialTest;
import be.multimedi.primes.test.PrimeListTest;

import java.util.Scanner;

public class CleanMain {
    public static void main(String[] args) {
        runTests();
        runProgram();
    }

    public static void runTests() {
        System.out.println("\n=== Running Tests ===\n");

        PrimeTest.run();
        PrimeListTest.run();
        PrimeFactorialTest.run();

        System.out.println("=== Tests Completed ===\n");
    }

    public static void runProgram() {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number to dissect: ");
            int numberToDissect = keyboard.nextInt();

            PrimeFactorial factorial = new PrimeFactorial(numberToDissect);
            System.out.println(factorial.represent());
        }


    }
}

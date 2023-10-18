package be.multimedi.primes;

import java.util.Arrays;
import java.util.Scanner;

public class EverythingInMain {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = keyboard.nextInt();

        int[] ps = new int[] {};
        for (int i = 2; i <= x; i++) {
            boolean check = true;
            for (int j = 2; j < i; j++) {
                if ( i % j == 0 ) {
                    check = false;
                    break;
                }
            }
            if (check) {
                ps = Arrays.copyOf(ps, ps.length + 1);
                ps[ps.length - 1] = i;
            }
        }

        int[] ds = new int[] {};
        int result = x;
        while (result > 1) {
            for (int i = 0; i < ps.length; i++) {
                if (result % ps[i] == 0) {
                    ds = Arrays.copyOf(ds, ds.length + 1);
                    ds[ds.length - 1] = ps[i];
                    result /= ps[i];
                    break;
                }
            }
        }

        System.out.print(x + " = ");
        for (int i = 0; i < ds.length; i++) {
            System.out.print(ds[i]);
            if (i < ds.length - 1) {
                System.out.print(" * ");
            }
        }
    }
}

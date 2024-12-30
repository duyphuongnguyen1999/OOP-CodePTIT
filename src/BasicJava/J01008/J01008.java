package J01008;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;


public class J01008 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();
            List<LinkedHashMap<Long, Long>> result = new ArrayList<>();
            while(T-- > 0) {
                long n = in.nextLong();
                LinkedHashMap<Long, Long> factorization = primeFactorization(n);
                result.add(factorization);
            }
            printResult(result);
        }
    }

    private static LinkedHashMap<Long, Long> primeFactorization(long n) {
        LinkedHashMap <Long, Long> factors = new LinkedHashMap<>();
        long count;
        for(long i = 2; i <= Math.sqrt(n); i++) {
            count = 0;
            while(n % i == 0) {
                count++;
                n/=i;
            }
            if (count > 0) {
                factors.put(i, count);
            }
        }

        if (n > 2) {
            factors.put(n, (long) 1);
        }

        return factors;
    }

    private static void printResult(List<LinkedHashMap<Long, Long>> result) {
        int test = 1;
        for (LinkedHashMap<Long, Long> factorization : result) {
            System.out.print("Test " + test++ + ": ");
            for (long prime : factorization.keySet()) {
                System.out.print(prime + "(" + factorization.get(prime) + ") ");
            }
            System.out.println();
        }
    }
}

package BasicJava.J01008;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class J01008 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();
            List<HashMap<Integer, Integer>> result = new ArrayList<>();
            while(T-- > 0) {
                int n = in.nextInt();
                HashMap<Integer, Integer> subResult = primeFactorization(n);
                result.add(subResult);
            }
            printResult(result);
        }
    }
        
    private static boolean isPrime(int n) {
        if (n <= 1) return false; 
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static HashMap<Integer, Integer> primeFactorization(int n) {
        HashMap <Integer, Integer> result = new HashMap<>(); 
        for(int i = 2; i <= n; i++) {
            if(!isPrime(i)) {
                continue;
            }
            int count = 0;
            while(n % i == 0) {
                count++;
                n /= i;
            }
            if(count > 0) {
                result.put(i, count);
            }
        }
        return result;
    }

    private static void printResult(List<HashMap<Integer, Integer>> result) {
        int test = 1;
        for (HashMap<Integer, Integer> sub_result : result) {
            System.out.print("Test " + test++ + ": ");
            for (int key : sub_result.keySet()) {
                System.out.print(key + "(" + sub_result.get(key) + ") ");
            }
            System.out.println();
        }
    }
}

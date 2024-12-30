package J01007;

import java.util.*;

public class J01007 {
    public static void main(String[] args) {
        List<Long> input = new ArrayList<>(); 
        try(Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();
            while(T-- > 0) {
                input.add(in.nextLong());
            }
            for (long number : input) {
                if (isFibonacci(number)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }

    private static boolean isFibonacci(long x) {
        if (x < 1)  {
            return false;
        }
        return isPerfectSquare(5 * x * x + 4) || isPerfectSquare(5 * x * x - 4);
    }

    private static boolean isPerfectSquare(long x) {
        if (x < 0) return false;
        
        long left = 0; 
        long right = x;
        while(left <= right) {
            long mid = left + (right - left)/2;
            long square = mid * mid;

            if (square == x) return true;
            if (square < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return false; 
    }
}

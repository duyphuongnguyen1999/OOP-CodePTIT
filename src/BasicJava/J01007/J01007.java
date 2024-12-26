package BasicJava.J01007;

import static java.lang.StrictMath.sqrt;
import java.util.Scanner;

public class J01007 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();
            if (T > 100) {
                T = in.nextInt();
            }
            while(T-- > 0) {
                long n = in.nextLong();
                if(isFibonacci(n)) {
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
        long square = (long) sqrt(x);
        return x == square * square; 
    }
}

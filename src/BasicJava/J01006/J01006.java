package BasicJava.J01006;

import java.util.Scanner;

public class J01006 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int numTests = in.nextInt();
            while(numTests-- > 0) {
                int n = in.nextInt();
                if(n > 92) {
                    n = in.nextInt();
                }
                System.out.println(fibonacy(n));
            }
        }   
    }
    private static long fibonacy(int n) {
        if (n == 1 || n == 2) {
            return 1; // F1 = 1, F2 = 1
        }
        long a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            long next = a + b;
            a = b;
            b = next;
        }
        return b;
    }
}

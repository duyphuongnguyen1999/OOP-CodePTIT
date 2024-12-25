package BasicJava.J01004;

import static java.lang.StrictMath.sqrt;
import java.util.Scanner;

public class J01004 {
    private static boolean isPrime(int value) {
        if (value <= 1){
            return false;
        }
        if (value == 2){
            return true;
        }
        if (value % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= sqrt(value); i += 2) {
            if (value % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();
            while(T-- != 0) {
                if(isPrime(in.nextInt())) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}

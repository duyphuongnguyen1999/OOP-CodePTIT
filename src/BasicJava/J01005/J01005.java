package BasicJava.J01005;

import static java.lang.StrictMath.sqrt;
import java.util.Scanner;

public class J01005 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int numsTest = in.nextInt();
            while (numsTest-- > 0) {
                int N = in.nextInt();
                int H = in.nextInt();
                double area = 0.5*H;
                double subArea = area/N;
                for (int i = 0; i < N-1; i++) {
                    System.out.printf("%.6f ", sqrt(2*H*subArea));
                    subArea += area/N;
                }
                System.out.println();
            } 
        }
    }
}

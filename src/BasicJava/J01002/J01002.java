import java.util.Scanner;

public class J01002 {
    public static void main(String[] arg) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            while (n > 10) {
                n = in.nextInt();
            }
            while (n-- > 0) {
                long N = in.nextInt();
                System.out.println((N + 1) * N / 2);
            }
        }
    }
}

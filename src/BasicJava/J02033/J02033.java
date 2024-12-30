package J02033;

import java.util.*;

public class J02033 {
    public static void main(String[] args) {
        try(Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int k = in.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            Arrays.sort(a);
            for(int i = 0; i < n && k > 0; i++) {
                if(a[i] < 0) {
                    a[i] = -a[i];
                    k--;
                }
            }

            if (k % 2 != 0) {
                Arrays.sort(a);
                a[0] = -a[0];
            }
            long sum = 0;
            for(int i = 0; i < n; i++) {
                sum += a[i];
            }
            System.out.println(sum);
        }
    }
}

package J01007;

import java.util.*;

public class J01007_2 {
    public static void main(String[] args) {
        HashSet<Long> fibonacciSet = new HashSet<>();
        ArrayList<Long> inputs = new ArrayList<>();

        try (Scanner in = new Scanner(System.in)) {
            int T = in.nextInt();
            while(T-- > 0) {
                inputs.add(in.nextLong());
            }
        }
        long maxInput = Collections.max(inputs);
        
        // Create fibonacciSet
        Long prev  = (long) 0;
        fibonacciSet.add(prev);
        Long curr = (long) 1;
        fibonacciSet.add(curr);
        Long tmp;
        while (prev + curr <= maxInput) {
            tmp = curr;
            curr = prev + curr;
            prev = tmp;
            fibonacciSet.add(curr);
        }

        for(Long number : inputs) {
            System.out.println(fibonacciSet.contains(number) ? "YES" : "NO");
        }
    } 
}

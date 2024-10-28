import java.util.Scanner;

public class J01002 {
    public static void main(String arg[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-- > 0) {
            int N = in.nextInt();
            System.out.println((N+1)*N/2);
        }
    }
}

package BasicJava.J01003;

import java.util.Scanner;

public class J01003 {
    public static void main(String[] arg) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();

            if(a != 0) {
                double res = -b/a;
                System.out.printf("%.2f", res);
            } else {
                if (b==0){
                    System.out.println("VSN");
                } else {
                    System.out.println("VN");
                }
            }
        }
    }
}

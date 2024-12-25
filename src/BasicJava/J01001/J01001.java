import java.util.Scanner;

public class J01001 {
    public static int calculatePerimeter(int a, int b) {
        return 2*(a+b);
    }

    public static int calculateArea(int a, int b) {
        return a*b;
    }
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();
            if (!(a > 0 && b >0)) {
                System.out.println(0);
            }
            else
                System.out.println(calculatePerimeter(a, b) + " " + calculateArea(a, b));
        }
    }
}

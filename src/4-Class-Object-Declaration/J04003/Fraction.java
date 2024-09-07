import java.util.*;

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd (b, a % b);
    }

    @Override
    public String toString() {
        return  this.numerator/gcd(this.numerator, this.denominator) + "/" + 
                this.denominator/gcd(this.numerator, this.denominator);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numerator = in.nextInt();
        int denominator = in.nextInt();

        Fraction fr = new Fraction(numerator, denominator);

        System.out.println(fr);
    }
}

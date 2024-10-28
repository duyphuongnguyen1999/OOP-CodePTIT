import java.math.*;
import java.util.*;

public class Fraction {
    private BigInteger numerator;
    private BigInteger denominator;

    public Fraction(BigInteger numerator, BigInteger denominator) {
        if (numerator.compareTo(BigInteger.ZERO) >= 0 && denominator.compareTo(BigInteger.ZERO) > 0) {
            this.numerator = numerator.divide(numerator.gcd(denominator));
            this.denominator = denominator.divide(denominator.gcd(numerator));
        }
    }

    public BigInteger getNumerator() {return this.numerator;}
    public void  setNumerator(BigInteger numerator) {
        this.numerator = numerator;
    }

    public BigInteger getDenominator() {return this.denominator;}
    public void setDenominator(BigInteger denominator) {
        this.denominator = denominator;
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            BigInteger numerator = in.nextBigInteger();
            BigInteger denominator = in.nextBigInteger();

            Fraction fr = new Fraction(numerator, denominator);

            System.out.println(fr.getNumerator() + "/" + fr.getDenominator());
        }
    }
}

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int numberOfTestCase = input.nextInt();
            while (numberOfTestCase-- > 0) {
                Point pointA = new Point(input.nextDouble(), input.nextDouble()); 
                Point pointB = new Point(input.nextDouble(), input.nextDouble()); 
                System.out.printf("%.4f\n", Point.distance(pointA, pointB));
            }
        }
    }
}

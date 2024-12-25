import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            // Input rectange attributes
            double width = in.nextDouble();
            double height = in.nextDouble();
            String inputColor = in.next();

            // String manipulation
            String colorLowerCase = inputColor.toLowerCase();
            String color = colorLowerCase.substring(0, 1).toUpperCase() + colorLowerCase.substring(1);
            

            if (isInteger(width) && width > 0 && isInteger(height) && height > 0) {
                Rectange rec = new Rectange(width, height, color);
                System.out.println((int) rec.findPerimeter() + " " + (int) rec.findArea() + " " + rec.getColor());
            } else {
                System.out.println("INVALID");
            }
        }
    }

    private static boolean isInteger(double value) {
        return value == (int) value;
    }
}

public class Point {
    double x, y;
    
    // Constructor
    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }

    // Methods
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance (Point point2) {
        double dx = this.getX() - point2.getX();
        double dy = this.getY() - point2.getY();
        double distance = Math.sqrt(dx*dx + dy*dy);
        return distance;
    }

    public static double distance(Point point1, Point point2) {
        double dx = point1.getX() - point2.getX();
        double dy = point1.getY() - point2.getY();
        double distance = Math.sqrt(dx*dx + dy*dy);
        return distance;
    }

    @Override
    public String toString() {
        return String.format("(%.4f, %.4f)", x, y);
    }


}

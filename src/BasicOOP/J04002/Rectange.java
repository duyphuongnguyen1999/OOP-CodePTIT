public class Rectange {
    double width, height;
    String color;

    // Constructors
    public Rectange() {
        this.width = 1;
        this.height = 1;
        this.color = null;
    }

    public Rectange(double width, double height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    // Getter and Setter
    public double getWidth() { return this.width; }
    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() { return this.height; }
    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() { return this.color; }
    public void setColor(String color) {
        this.color = color;
    }

    // Method
    public double findArea() {
        return width*height;
    }

    public double findPerimeter() {
        return 2*(width + height);
    }
}

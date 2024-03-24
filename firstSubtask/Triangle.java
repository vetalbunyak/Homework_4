package firstSubtask;

public class Triangle implements Area {
    private double side; // side of a triangle
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }


    @Override
    public double area() {
        return (side * height) / 2;
    }
}

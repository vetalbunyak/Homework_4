package firstSubtask;

public class Сircle implements Area {
    private final double Pi = Math.PI;
    private double radius;

    public Сircle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Pi * Math.pow(radius, 2);
    }
}

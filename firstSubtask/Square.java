package firstSubtask;

public class Square implements Area {
    private double side; // side of a square

    public Square(double side) {
        this.side = side;
    }


    @Override
    public double area() {
        return Math.pow(side, 2);
    }
}

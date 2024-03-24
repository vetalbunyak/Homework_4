package firstSubtask;

public class Main {
    public static void main(String[] args) {
        firstSubtask.Area[] areas =
                {
                        new Triangle(12.4, 2),
                        new Square(4),
                        new Сircle(5.34)
                };
        double totalArea = 0;
        for (firstSubtask.Area i : areas )
        {
            totalArea += i.area();
        }
        System.out.println("The total area of all figures is " + totalArea);


    }
}

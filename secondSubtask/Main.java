package secondSubtask;

public class Main {
    public static void main(String[] args) {
        Participant[] participants =
                {
                        new Cat("Marsik", 400, 2),
                        new Robot("Bender", 700, 4),
                        new Human("Vitaliy", 1000, 1)
                };
        Obstacle [] obstacles =
                {
                        new Track(500),
                        new Wall(3)
                };
        for (Participant p : participants){
            for (Obstacle o : obstacles)
            {
                if (!o.overcome(p)){
                    break;
                }
            }
        }
    }
}

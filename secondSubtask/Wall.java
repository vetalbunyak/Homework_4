package secondSubtask;

public class Wall implements Obstacle{
    private final int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.jump(height))
        {
            System.out.println(participant.toString() + "jumped over the wall");
            return true;
        }
        else {
            System.out.println(participant.toString() + "did not jump over the wall");
            return false;
        }
    }
}

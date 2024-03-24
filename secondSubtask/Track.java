package secondSubtask;

public class Track implements Obstacle{
    private final int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    public boolean overcome(Participant participant) {
        if (participant.run(length))
        {
            System.out.println(participant.toString() + "Ran the treadmill");
            return true;
        }
        else {
            System.out.println(participant.toString() + "did not run the treadmill");
            return false;
        }
    }
}

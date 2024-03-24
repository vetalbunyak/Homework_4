package secondSubtask;

class Human implements Participant {
    private String name;
    private int maxDistanceRun;
    private int maxDistanceJump;

    public Human(String name, int maxDistanceRun, int maxDistanceJump) {
        this.name = name;
        this.maxDistanceRun = maxDistanceRun;
        this.maxDistanceJump = maxDistanceJump;
    }

    @Override
    public boolean run(int distance) {
        if (distance <= maxDistanceRun) {
            System.out.println(name + " run " + distance + "m");
            return true;
        } else {
            System.out.println(name + " did not run " + distance + "m");
            return false;
        }

    }

    @Override
    public boolean jump(int height) {
        if (height <= maxDistanceJump) {
            System.out.println(name + " jumped " + height + "m");
            return true;
        } else {
            System.out.println(name + " did not jump " + height + "m");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}

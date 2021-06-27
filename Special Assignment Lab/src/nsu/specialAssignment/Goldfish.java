package nsu.specialAssignment;

public class Goldfish extends Fish implements Swimmer {
    public Goldfish() {
        super();
    }

    public Goldfish(Boolean vertabrates, String edible) {
        super(vertabrates, edible);
    }

    @Override
    public boolean howToSwim() {
        System.out.println("Golfish is swimming");
        return true;
    }
}

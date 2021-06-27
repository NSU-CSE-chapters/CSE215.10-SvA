package nsu.specialAssignment;

public class Comet extends Fish implements Swimmer{


    public Comet() {
        super();
    }

    public Comet(Boolean vertabrates, String edible) {
        super(vertabrates, edible);
    }

    @Override
    public boolean howToSwim() {
        System.out.println("Camet  is  not swimming");
        return false;
    }
}

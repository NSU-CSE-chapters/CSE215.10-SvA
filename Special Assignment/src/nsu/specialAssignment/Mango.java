package nsu.specialAssignment;

public class Mango extends Fruit {
    // data fields
    private int propagation;

    // no arg constructor with  set summer season
    public Mango() {
        this.setSeason(1);
    }

    // parameterized constructor
    public Mango(String color, boolean seed, int season, int propagation) {
        super(color, seed, 1);
        this.propagation = propagation;
    }


    // get propagation
    public String getPropagation() {
        switch (propagation) {
            case 1:
                return "grafting";
            case 2:
                return "budding";
            default:
                return "nothing";
        }
    }

    public void setPropagation(int propagation) {
        this.propagation = propagation;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + " " + "Mango{" +
                "propagation=" + getPropagation() +
                '}';
    }
}

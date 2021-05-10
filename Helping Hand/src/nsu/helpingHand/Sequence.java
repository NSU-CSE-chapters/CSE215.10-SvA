package nsu.helpingHand;

public abstract class Sequence {
    private  double number;

    public Sequence() {
        this.number = 0.0;

    }

    public Sequence(double number) {
        this.number = number;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public  abstract int Term(int n);
    public  abstract void tostring(int n);


}

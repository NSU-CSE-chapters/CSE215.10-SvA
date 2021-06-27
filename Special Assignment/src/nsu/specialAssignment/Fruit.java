package nsu.specialAssignment;

public class Fruit {
    // data fields
    private String color;
    private boolean seed;
    private int season;

    // constants
    public final int SUMMER = 1;
    public final int WINTER = 2;
    public final int AUTUMN = 3;

    // no- arg constructor
    public Fruit() {
        this.color = "green";
        this.seed = false;
        this.season = 0;
    }

    // parameterized constructor
    public Fruit(String color, boolean seed, int season) {
        this.color = color;
        this.seed = seed;
        this.season = season;
    }


    // getter and setter method

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isSeed() {
        return seed;
    }

    public void setSeed(boolean seed) {
        this.seed = seed;
    }

    // get season from switch constants
    public String getSeason() {
        switch (season) {
            case 1:
                return "SUMMER";
            case 2:
                return "WINTER";
            case 3:
                return "AUTUMN";
            default:
                return "no season";
        }
    }

    public void setSeason(int season) {
        this.season = season;
    }

    // to string methods
    @Override
    public String toString() {
        return "Fruit{" +
                "color='" + color + '\'' +
                ", seed=" + seed +
                ", season=" + getSeason() +

                '}';
    }
}

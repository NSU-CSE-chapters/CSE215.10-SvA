package nsu.helpingHand;

public class Aeroplane {
    private String model;
    private int capacity;
    private String  pilot;

    public Aeroplane() {
        this.model = "Boeing";
        this.capacity = 60;
    }

    public Aeroplane(String model, int capacity, String pilot) {
        this.model = model;
        this.capacity = capacity;
        this.pilot = pilot
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getPilot() {
        return pilot;
    }

    public void setPilot(String pilot) {
        this.pilot = pilot;
    }


}

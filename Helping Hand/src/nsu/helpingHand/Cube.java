package nsu.helpingHand;

public class Cube {
    private double side;

    public Cube() {
        this.side = 1.0;
    }

    public Cube(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public  double printVolume(){
        return this.side*this.side*this.side;
    }

    public  String display(){
        return "value of the side ="+this.side+" \nvolume of the cube = "+printVolume();
    }
}

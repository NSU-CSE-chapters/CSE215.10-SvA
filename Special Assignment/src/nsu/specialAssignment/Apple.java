package nsu.specialAssignment;

public class Apple extends Fruit{

    // data fields
    private int varieties;


    // no arg constructor
    public  Apple(){
        setSeason(2);
    }
     // parameterized constructor
    public Apple(String color, boolean seed, int season, int varieties) {
        super(color, seed, 2);
        this.varieties = varieties;
    }

    // get varieties
    public String getVarieties() {
        switch (varieties){
            case 1: return "Cider";
            case 2: return "Cooking";
            case 3: return "Dessert";
            default: return "no variety declare";
        }
    }

    public void setVarieties(int varieties) {
        this.varieties = varieties;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString()+" "+"Apple{" +
                "varieties=" + getVarieties() +
                '}';
    }
}

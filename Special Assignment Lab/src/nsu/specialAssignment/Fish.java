package nsu.specialAssignment;

public class Fish implements Swimmer{
    private boolean vertabrates ;
    private String edible;

    public  Fish(Boolean vertabrates, String edible) {
        this.vertabrates = vertabrates;
        this.edible = edible;
    }

    public Fish() {
        super();
    }

    public boolean isVertabrates() {
        return vertabrates;
    }

    public void setVertabrates(boolean vertabrates) {
        this.vertabrates = vertabrates;
    }

    public String getEdible() {
        return edible;
    }

        public void setEdible(String edible) {
        this.edible = edible;
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof Fish) {
            if(this.vertabrates == ((Fish)o).vertabrates && this.edible == ((Fish)o).edible)
                return true;
            else
                return false;
        }
        else
            return false;
    }

    @Override
    public boolean howToSwim() {
        return false;
    }
}
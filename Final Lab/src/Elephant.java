public class Elephant extends Animal implements Feed {

    public Elephant() {
        super();
    }

    public Elephant(String color, int size, String species) throws UnresolvedInputException {
        super(color, size, species);
    }


    //overriden equals method
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Elephant) {
            return this.getSpecies() == ((Elephant) obj).getSpecies();
        } else return false;
    }

    @Override
    public void food() {
        System.out.println("A Elephant eats roots");

    }

    @Override
    public void HowToFeed() {
        System.out.println("Elephant uses trunks to feed");

    }

    @Override
    public String toString() {
        return "Elephant {" +
                "color= '" +
                getColor() + "' , size= '" +
                getSize() + "' , species= '" +
                getSpecies() + "'+" +
                ", food = A Elephant eats roots" +
                ", HowToFeed = Elephant uses trunks to feed" +
                " }";
    }
}

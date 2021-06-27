public class Giraffe extends Animal implements Feed {


    public Giraffe() {
        super();
    }

    // parameterized constructor
    public Giraffe(String color, int size, String species) throws UnresolvedInputException {
        super(color, size, species);
    }



    // overriden equals method
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Giraffe) {
            return this.getSpecies() == ((Giraffe) obj).getSpecies();
        } else return false;
    }

    @Override
    public void food() {
        System.out.println("A Giraffe eats branches");

    }

    @Override
    public void HowToFeed() {
        System.out.println("Giraffe uses long neck to feed");

    }


    // toString method
    @Override
    public String toString() {
        return "Giraffe {" +
                "color= '" + getColor() + "' , size= '" + getSize() + "' , species= '" + getSpecies() +
                ", food = A Giraffe eats branches" +
                ", HowToFeed = Giraffe uses long neck to feed" +
                "'}";
    }
}

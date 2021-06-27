import java.nio.channels.UnresolvedAddressException;

public abstract class Animal {
    private String color;
    private int size;
    private String species;


    public Animal() {
        super();
    }

    public Animal(String color, int size, String species) throws UnresolvedInputException {
        super();
        this.color = color;
        setSize(size);
        this.species = species;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) throws UnresolvedInputException {
        if (size > 0) {
            this.size = size;
        } else throw new UnresolvedInputException("size can not be negetive or 0");

    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public abstract void food();



}

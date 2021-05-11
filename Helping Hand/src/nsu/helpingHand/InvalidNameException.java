package nsu.helpingHand;

public class InvalidNameException extends Exception{
    public InvalidNameException(String name) {
        super("invalid name "+name);

    }
}

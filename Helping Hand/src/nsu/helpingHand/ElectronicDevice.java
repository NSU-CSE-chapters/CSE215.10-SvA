package nsu.helpingHand;

public class ElectronicDevice extends Product {
    private String  model;
    private String warranty;

    public ElectronicDevice(String name, double price, String model, String warranty) {
        super(name, price);
        this.model = model;
        this.warranty = warranty;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public  void changePrice(double percentage){
        this.price = Math.abs(percentage/100)-price;
    }

    @Override
    public String toString() {
        return "ElectronicDevice{" +
                "model='" + model + '\'' +
                ", warranty='" + warranty + '\'' +
                '}';
    }
}

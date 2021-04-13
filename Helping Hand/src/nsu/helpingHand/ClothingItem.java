package nsu.helpingHand;

public class ClothingItem extends Product {
    private  String fabric;

    public ClothingItem(String name, double price, String fabric) {
        super(name, price);
        this.fabric = fabric;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public  void changePrice(double percentage){
        this.price = Math.abs(percentage/100)-price;
    }

    @Override
    public String toString() {
        return "ClothingItem{" +
                "fabric='" + fabric + '\'' +
                '}';
    }

}

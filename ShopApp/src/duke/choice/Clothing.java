package duke.choice;

public class Clothing {
    public final static double MIN_PRICE = 10.0;
    public final static double TAX_RATE = 0.2;

    private String description;
    private double price;
    private String size;

    public Clothing(String _desc, double _price, String _size){
        setDescription(_desc);
        setPrice(_price);
        setSize(_size);
    }

    public void printInfo(){
        System.out.println("   " + this.description + " " + this.price + " " + this.size);
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice(){
        return this.price + (this.price * TAX_RATE);
    }

    private void setPrice(double newPrice) {
        this.price = (newPrice > MIN_PRICE) ? newPrice : MIN_PRICE;
    }

    public String getSize() {
        return this.size;
    }

    private void setSize(String size) {
        this.size = size;
    }
}

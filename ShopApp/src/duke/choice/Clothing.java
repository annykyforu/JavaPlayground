package duke.choice;

public class Clothing {
    private final double MIN_PRICE = 10.0;
    private final double TAX_RATE = 0.2;
    private String description;
    private double price;
    private String size;

    public Clothing(String desc, double p, String s){
        setDescription(desc);
        setPrice(p);
        setSize(s);
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

    public void setPrice(double newPrice) {
        this.price = (newPrice > MIN_PRICE) ? newPrice : MIN_PRICE;
    }

    public String getSize() {
        return this.size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}

package duke.choice;

public class Clothing implements Comparable<Clothing>{
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

    @Override
    public String toString(){
        return "   " + this.description + " " + this.price + " " + this.size;
    }

    @Override
    public int compareTo(Clothing o) {
        return this.description.compareTo(o.getDescription());
    }
}

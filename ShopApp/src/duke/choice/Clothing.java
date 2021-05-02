package duke.choice;

public class Clothing {
    private String description;
    private double price;
    private String size;

    public Clothing(String desc, double p, String s){
        this.description = desc;
        this.price = p;
        this.size = s;
    }

    public void printInfo(){
        System.out.println(this.description + " " + this.price + " " + this.size);
    }

    public double getPrice(){
        return this.price;
    }
    public String getSize() {
        return this.size;
    }


}

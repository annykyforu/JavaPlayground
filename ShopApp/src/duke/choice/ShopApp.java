package duke.choice;

public class ShopApp {

    static String roundOffTo2DecPlaces(double val){
        return String.format("%.2f", val);
    }

    public static void main(String[] args) {
        double tax = 0.2;
        double total;

        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer("Pinky");
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "S");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        item1.printInfo();
        item2.printInfo();

        total = (item1.getPrice() + item2.getPrice()*2);
        total *= (1 + tax);
        System.out.println("Total for 3 items: " + roundOffTo2DecPlaces(total));
    }
}

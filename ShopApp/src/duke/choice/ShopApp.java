package duke.choice;

public class ShopApp {

    static String roundOffTo2DecPlaces(double val){
        return String.format("%.2f", val);
    }

    public static void main(String[] args) {
        double total = 0.0;

        System.out.println("*** Welcome to Duke Choice Shop! ***");
        Customer c1 = new Customer("Pinky", "S");
        Customer c2 = new Customer("Marvin", 5);

        Customer[] customers = {c1, c2};

        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2, item3, item4};
        c1.addItems(items);

        System.out.println("------");
        System.out.println("Customer: " + c1.getName() + ", size: " + c1.getCustomerSize());
        c1.printItemsInfo();
        System.out.println("Total cost: " + roundOffTo2DecPlaces(c1.getTotalClothingCost()));

        System.out.println("------");

        System.out.println("Customer: " + c2.getName() + ", size: " + c2.getCustomerSize());
        c2.printItemsInfo();
        System.out.println("Total cost: " + roundOffTo2DecPlaces(c2.getTotalClothingCost()));

    }
}

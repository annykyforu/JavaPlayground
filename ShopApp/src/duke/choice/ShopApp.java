package duke.choice;

public class ShopApp {

    static String roundOffTo2DecPlaces(double val){
        return String.format("%.2f", val);
    }

    public static void main(String[] args) {
        double tax = 0.2;
        double total = 0.0;

        System.out.println("Welcome to Duke Choice Shop!");

        Customer c1 = new Customer("Pinky", "S");
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");
        Clothing item3 = new Clothing("Green Scarf", 5, "S");
        Clothing item4 = new Clothing("Blue T-Shirt", 10.5, "S");

//        total = (item1.getPrice() + item2.getPrice()*2);
//        total *= (1 + tax);
//        System.out.println("Total for 3 items: " + roundOffTo2DecPlaces(total));

        /* --- Arrays, Conditions, and Loops --- */
        int measurement = 3;
        switch (measurement){
            case 1: case 2: case 3:
                c1.setSize("S");
                break;
            case 4: case 5: case 6:
                c1.setSize("M");
                break;
            case 7: case 8: case 9:
                c1.setSize("L");
                break;
            default:
                c1.setSize("X");
                break;
        }

        Clothing[] items = {item1, item2, item3, item4};
        int totalItems = 0;
        for(Clothing item : items){
            if(c1.getSize().equals(item.getSize())){
                item.printInfo();
                total += item.getPrice();
                totalItems++;
            }
            if(total > 15) {break;}
        }
        System.out.println("Total for " + totalItems + " items: " + roundOffTo2DecPlaces(total));

    }
}

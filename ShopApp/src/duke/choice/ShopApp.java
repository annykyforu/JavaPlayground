package duke.choice;

import io.helidon.webserver.Routing;
import io.helidon.webserver.ServerConfiguration;
import io.helidon.webserver.WebServer;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collections;

public class ShopApp {

    static String roundOffTo2DecPlaces(double val){
        return String.format("%.2f", val);
    }

    public static void main(String[] args) {
        System.out.println("*** Welcome to Duke Choice Shop! ***");
        Customer c1 = new Customer("Pinky", 3);
        Customer c2 = new Customer("Marvin", "M");

        Customer[] customers = {c1, c2};

        System.out.println("Minimum price is: " + Clothing.MIN_PRICE);
        Clothing item1 = new Clothing("Blue Jacket", 20.9, "M");
        Clothing item2 = new Clothing("Orange T-Shirt", 10.5, "S");

        Clothing[] items = {item1, item2,
                new Clothing("Green Scarf", 5, "S"),
                new Clothing("Blue T-Shirt", 10.5, "S")
        };
        c1.addItems(items);

        System.out.println("------");
        System.out.println("Customer: " + c1.getName() + ", size: " + c1.getCustomerSize());
        c1.printItemsInfo();
        System.out.println("Total cost: " + roundOffTo2DecPlaces(c1.getTotalClothingCost()));
        c1.calcAveragePrice();

        System.out.println("------");
        System.out.println("Customer: " + c2.getName() + ", size: " + c2.getCustomerSize());
        c2.printItemsInfo();
        System.out.println("Total cost: " + roundOffTo2DecPlaces(c2.getTotalClothingCost()));
        c2.calcAveragePrice();

        System.out.println("------");
        System.out.println("after applying Sort");
        Collections.sort(c1.getItems());
        c1.printItemsInfo();

        try {
            ItemList list = new ItemList(items);
            Routing routing = Routing.builder()
                                .get("/items", list).build();
            ServerConfiguration config = ServerConfiguration.builder()
                                .bindAddress(InetAddress.getLocalHost())
                                .port(9999).build();
            WebServer webServer = WebServer.create(config, routing);
            webServer.start();
        } catch (UnknownHostException hostException) {
            hostException.printStackTrace();
        }
    }
}

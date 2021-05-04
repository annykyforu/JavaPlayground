package duke.choice;

import java.util.Vector;

public class Customer {
    private String name;
    private String size;
    private Vector<Clothing> items;

    public Customer(String _name, String _size){
        this.name = _name;
        this.size = _size;
        this.items = new Vector<>();
    }

    public Customer(String _name, int _measurement){
        this.name = _name;
        setSize(_measurement);
        this.items = new Vector<>();
    }

    public String getName(){
        return this.name;
    }

    public String getCustomerSize() {
        return this.size;
    }

    public void setSize(String newSize){
        this.size = newSize;
    }

    public void setSize(int measurement){
        switch (measurement){
            case 1: case 2: case 3:
                setSize("S");
                break;
            case 4: case 5: case 6:
                setSize("M");
                break;
            case 7: case 8: case 9:
                setSize("L");
                break;
            default:
                setSize("XL");
                break;
        }
    }

    public void addItems(Clothing[] newItems){
        if(newItems != null) {
            double total = 0.0;
            for (Clothing item : newItems) {
                if (getCustomerSize().equals(item.getSize())) {
                    this.items.add(item);
                    total += item.getPrice();
                }
//                if (total > 15) { break; }
            }
        }
    }

    public Vector<Clothing> getItems(){
        return items;
    }

    public void printItemsInfo(){
        if(items == null){
            System.out.println("   Customer basket is empty.");
        } else {
            for (Clothing item : getItems()) {
                item.printInfo();
            }
        }
    }

    public double getTotalClothingCost(){
        double total = 0.0;
        if(items != null){
            for (Clothing item : getItems()) {
                    total += item.getPrice();
            }
        }
        return total;
    }
}

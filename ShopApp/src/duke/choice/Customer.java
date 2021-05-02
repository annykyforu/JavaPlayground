package duke.choice;

public class Customer {
    private String name;
    private String size;

    public Customer(String _name, String _size){
        this.name = _name;
        this.size = _size;
    }

    public void printName(){
        System.out.println(this.name);
    }
    public String getSize() {
        return this.size;
    }
    public void setSize(String newSize){
        this.size = newSize;
    }
}

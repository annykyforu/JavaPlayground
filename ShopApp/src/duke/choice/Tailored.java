package duke.choice;

public class Tailored extends Clothing{
    private double fee;

    public Tailored(String _desc, double _price, String _size) {
        super(_desc, _price, _size);
    }

    @Override
    public double getPrice(){
        return super.getPrice() + fee;
    }
}

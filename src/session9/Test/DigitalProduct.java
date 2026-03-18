package session9.Test;

public class DigitalProduct extends Product{
    private double size;

    public DigitalProduct(String id, String name, double price, double size) {
        super(id, name, price);
        this.size = size;
    }

    public DigitalProduct(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void disPlayInfo() {
        System.out.println("Id: "+ getId()
        +" name: "+ getName()
                +" price: "+ getPrice()
                + " size "+ getSize()
        );
    }
}

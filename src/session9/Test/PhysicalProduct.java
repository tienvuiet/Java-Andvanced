package session9.Test;

public class PhysicalProduct extends Product{
    private double weight;

    public PhysicalProduct(String id, String name, double price, double weight) {
        super(id, name, price);
        this.weight = weight;
    }

    public PhysicalProduct(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public void disPlayInfo() {
        System.out.println("Id: "+ getId()
                           +" name: "+ getName()
                 +" price: " + getPrice()
                +" weight: "+ getWeight()
        );
    }
}

package model;

public class Produkte {

    private String name;
    private int price;
    private double sku;
    private int anzProdukte;

    public Produkte(String name, int price, double sku, int anzProdukte) {
        this.name = name;
        this.price = price;
        this.sku = sku;
        this.anzProdukte = anzProdukte;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSku() {
        return sku;
    }

    public void setSku(double sku) {
        this.sku = sku;
    }

    public int getAnzProdukte() {
        return anzProdukte;
    }

    public void setAnzProdukte(int anzProdukte) {
        this.anzProdukte = anzProdukte;
    }

    @Override
    public String toString() {
        return "Produkte{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", sku=" + sku +
                ", anzProdukte=" + anzProdukte +
                '}';
    }
}

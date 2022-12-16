package org.example;

public class BottleProduct extends Product {
    private Integer volume;

    public BottleProduct(String name, Integer price, Integer volume) {
        super(name, price);
        this.volume = volume;
    }

    public Integer getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return "BottleProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", volume=" + volume +
                '}';
    }
}

package org.example;

public class Food extends Product {
    private Integer weight;

    public Food(String name, Integer price, Integer weight) {
        super(name, price);
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                '}';
    }
}

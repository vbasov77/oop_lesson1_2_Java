//Создайте несколько классов товаров. Они все наследуют от родительского класса Product.
//  Товары обладают дополнительными характеристиками, которые отображаются в toString ().
//Загрузите в автомат много разнообразных товаров.


package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Product chocolate = new Food("Шоколад", 100, 80);
        Product chips = new Food("Чипсы", 120, 40);
        Product waffles = new Food("Вафли", 50, 50);

        Product cola = new BottleProduct("Кола", 80, 250);
        Product water = new BottleProduct("Вода", 60, 500);
        Product beer = new BottleProduct("пиво heineken", 150, 500);

        List <Product> vending = new ArrayList<>();
        vending.add(chocolate);
        vending.add(chips);
        vending.add(waffles);
        vending.add(cola);
        vending.add(water);
        vending.add(beer);

        System.out.println(vending);

    }
}
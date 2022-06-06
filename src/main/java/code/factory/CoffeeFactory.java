package code.factory;

import code.factory.enums.CoffeeType;
import code.factory.type_cofee.Americano;
import code.factory.type_cofee.Espresso;

public class CoffeeFactory {

    public Coffee createCoffee (CoffeeType type) {

        return switch (type) {
            case AMERICANO -> new Americano();
            case ESPRESSO -> new Espresso();
            default -> throw new RuntimeException("Такого сорта кофе нет");
        };
    }

}

package code.factory;

import code.factory.enums.CoffeeType;

public class CreateCoffee {

    private final CoffeeFactory coffeeFactory;

    public CreateCoffee(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = coffeeFactory.createCoffee(type);
        coffee.makeCoffee();

        System.out.println("Ваш кофе " + type + " готов!");
        return coffee;
    }


}

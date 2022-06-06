package code;

import code.adapter.Computer;
import code.adapter.MemoryCard;
import code.adapter.MemoryCardAdapter;
import code.adapter.USB;
import code.factory.CoffeeFactory;
import code.factory.CreateCoffee;
import code.factory.enums.CoffeeType;
import code.proxy.DBConnectImpl;
import code.proxy.DBConnectProxy;
import code.singleton.LoggerSingleton;

public class App {
    private static final LoggerSingleton logger = LoggerSingleton.getInstance();

    public static void main(String[] args) {
        singleton();
        factory();
        adapter();
        proxy();
    }

    public static void singleton() {
        System.out.println("Singleton");
        logger.info(String.class);
        logger.info("Имя класса: ", String.class);
        System.out.println("");
    }

    public static void factory() {
        System.out.println("Factory");
        CoffeeFactory coffeeFactory = new CoffeeFactory();
        CreateCoffee createCoffee = new CreateCoffee(coffeeFactory);
        createCoffee.orderCoffee(CoffeeType.AMERICANO);
        System.out.println("");
    }


    public static void adapter() {
        System.out.println("Adapter");

        USB usb = new USB();
        Computer computer = new Computer();
        computer.connect(usb);

        MemoryCard memoryCard = new MemoryCard();
        MemoryCardAdapter memoryCardAdapter = new MemoryCardAdapter(memoryCard);
        Computer computer1 = new Computer();
        computer1.connect(memoryCardAdapter);
        System.out.println("");

    }

    public static void proxy() {
        System.out.println("Proxy");

        DBConnectImpl dbConnect = new DBConnectImpl();
        DBConnectProxy dbConnectProxy = new DBConnectProxy(dbConnect);
        System.out.println(dbConnectProxy.getConnectDB("example"));
        System.out.println(dbConnectProxy.getConnectDB("example1"));
        System.out.println(dbConnectProxy.getConnectDB("example"));

    }


}

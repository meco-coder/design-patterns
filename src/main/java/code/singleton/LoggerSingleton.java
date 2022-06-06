package code.singleton;

public class LoggerSingleton {
    private static LoggerSingleton INSTANCE;

    private LoggerSingleton() {
    }

    public static synchronized LoggerSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LoggerSingleton();
        }
        return INSTANCE;
    }

    public void info(Object object) {

        System.out.println(object.getClass().getName());

    }

    public void info( String msg, Object object) {

        System.out.println(msg + " " + object.getClass().getName());

    }
}

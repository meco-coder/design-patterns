package code.proxy;

public class DBConnectImpl implements DBConnect {
    @Override
    public String getConnectDB(String nameDB) {

        System.out.println("not from cache");

        return "connected to localhost:port/" + nameDB;
    }
}

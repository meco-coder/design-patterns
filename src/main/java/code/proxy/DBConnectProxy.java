package code.proxy;

import java.util.HashMap;
import java.util.Map;

public class DBConnectProxy implements DBConnect {

    private final DBConnectImpl dbConnect;

    private final Map<String, String> cache;

    public DBConnectProxy(DBConnectImpl dbConnect) {
        this.dbConnect = dbConnect;
        cache = new HashMap<>();
    }


    @Override
    public String getConnectDB(String nameDB) {
        if (!cache.containsKey(nameDB)) {
            cache.put(nameDB, dbConnect.getConnectDB(nameDB));
        } else  {
            System.out.println("connect from cache");
        }
        return cache.get(nameDB);
    }
}

package helpers;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * Created by andrea on 04/06/14.
 */
public class stackOverflow {
    static MongoClient client;

    static {
        try {
            client = new MongoClient("localhost", 31000);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public static DB getDatabase() {
        return client.getDB("so-demo");
    }

    public static DBCollection getUsers(){
        return getDatabase().getCollection("users");
    }
}
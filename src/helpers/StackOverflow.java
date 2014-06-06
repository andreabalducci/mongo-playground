package helpers;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

import java.net.UnknownHostException;

/**
 * Created by andrea on 04/06/14.
 */
public class StackOverflow {
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

    public static DBCollection getUsers() {
        return getDatabase().getCollection("users");
    }

    public static DBCollection getPosts() {
        return getDatabase().getCollection("posts");
    }

    public static DBCollection getComments() {
        return getDatabase().getCollection("comments");
    }

    public static DBCollection getBadges() {
        return getDatabase().getCollection("badges");
    }

    public static DBCollection getVotes() {
        return getDatabase().getCollection("votes");
    }
    public static DBCollection getPostHistory() {
        return getDatabase().getCollection("postHistory");
    }
}

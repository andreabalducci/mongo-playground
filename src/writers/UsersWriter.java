package writers;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import model.User;
import org.bson.BSONObject;

import java.util.Map;
import java.util.Set;

/**
 * Created by andrea on 04/06/14.
 */
public class UsersWriter {
    private DBCollection collection;

    public UsersWriter(DBCollection collection) {
        this.collection = collection;
    }

    public void Drop(){
        collection.drop();
    }

    public void Insert(User user){
        collection.insert(Map(user));
    }


    private DBObject Map(User user){
        DBObject mapped = new BasicDBObject("_id", user.getId())
                .append("name", user.getDisplayName())
                .append("age", user.getAge())
                .append("reputation", user.getReputation())
                .append("aboutme", user.getAboutMe())
                .append("location", user.getLocation())
                .append("website", user.getWebsiteUrl())
                ;
        return mapped;
    }
}

package writers;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import model.User;

/**
 * Created by andrea on 04/06/14.
 */
public class UsersWriter {
    private DBCollection collection;
    private boolean allowNulls;

    public UsersWriter(DBCollection collection) {
        this(collection, true);
    }

    public UsersWriter(DBCollection collection, boolean allowNulls) {

        this.collection = collection;
        this.allowNulls = allowNulls;
    }

    public void Drop() {
        collection.drop();
    }

    public void Insert(User user) {
        collection.insert(Map(user));
    }


    private DBObject Map(User user) {
        BasicDBObject mapped = new BasicDBObject("_id", user.getId())
                .append("name", user.getDisplayName())
                .append("reputation", user.getReputation())
                .append("aboutme", user.getAboutMe())
                .append("location", user.getLocation());

        if (this.allowNulls || user.getAge() > 0) {
            mapped.append("age", user.getAge());
        }

        if (this.allowNulls || user.getWebsiteUrl() != null) {
            mapped.append("website", user.getWebsiteUrl());
        }


        return mapped;
    }
}

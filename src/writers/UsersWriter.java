package writers;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import model.User;

/**
 * Created by andrea on 04/06/14.
 */
public class UsersWriter extends BaseWriter {

    public UsersWriter(DBCollection collection) {
        this(collection, true);
    }

    public UsersWriter(DBCollection collection, boolean allowNulls) {
        super(collection, allowNulls);
    }

    public void Insert(User user) {
        getCollection().insert(Map(user));
    }

    private DBObject Map(User user) {
        BasicDBObject mapped = new BasicDBObject("_id", user.getId())
                .append("name", user.getDisplayName())
                .append("reputation", user.getReputation())
                .append("aboutme", user.getAboutMe())
                .append("location", user.getLocation());

        if (this.isAllowNulls() || user.getAge() > 0) {
            mapped.append("age", user.getAge());
        }

        if (this.isAllowNulls() || user.getWebsiteUrl() != null) {
            mapped.append("website", user.getWebsiteUrl());
        }

        return mapped;
    }
}

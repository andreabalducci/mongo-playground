package writers;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import model.Badge;

/**
 * Created by andrea on 06/06/14.
 */
public class BadgesWriter  extends BaseWriter {
    public BadgesWriter(DBCollection collection) {
        this(collection, true);
    }

    public BadgesWriter(DBCollection collection, boolean allowNulls) {
        super(collection, allowNulls);
    }

    public void Insert(Badge badge) {
        getCollection().insert(Map(badge));
    }

    private DBObject Map(Badge badge) {
        BasicDBObject mapped = new BasicDBObject("_id", badge.getId())
            .append("date", badge.getDate())
            .append("name", badge.getName())
            .append("userId", badge.getUserId())
        ;

        return mapped;
    }
}

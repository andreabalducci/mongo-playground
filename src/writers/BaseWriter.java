package writers;

import com.mongodb.DBCollection;

/**
 * Created by andrea on 05/06/14.
 */
public class BaseWriter {
    private DBCollection collection;

    public DBCollection getCollection() {
        return collection;
    }

    public boolean isAllowNulls() {
        return allowNulls;
    }

    private boolean allowNulls;

    public BaseWriter(DBCollection collection, boolean allowNulls) {
        this.collection = collection;
        this.allowNulls = allowNulls;
    }

    public void Drop() {
        collection.drop();
    }
}

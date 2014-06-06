package writers;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import model.PostHistory;

/**
 * Created by andrea on 06/06/14.
 */
public class PostHistoryWriter extends BaseWriter {
    public PostHistoryWriter(DBCollection collection) {
        this(collection, true);
    }

    public PostHistoryWriter(DBCollection collection, boolean allowNulls) {
        super(collection, allowNulls);
    }

    public void Insert(PostHistory postHistory) {
        getCollection().insert(Map(postHistory));
    }

    private DBObject Map(PostHistory postHistory) {
        BasicDBObject mapped = new BasicDBObject("_id", postHistory.getId())
                .append("createdAt", postHistory.getCreationDate())
                .append("typeId", postHistory.getPostHistoryTypeId())
                .append("revisionId", postHistory.getRevisionGUID())
                .append("postId", postHistory.getPostId())
                .append("text", postHistory.getText())
                .append("userId", postHistory.getUserId())
                ;

        return mapped;
    }
}

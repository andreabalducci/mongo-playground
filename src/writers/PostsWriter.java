package writers;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import model.Post;

/**
 * Created by andrea on 05/06/14.
 */
public class PostsWriter extends BaseWriter {

    public PostsWriter(DBCollection collection) {
        this(collection, true);
    }

    public PostsWriter(DBCollection collection, boolean allowNulls) {
        super(collection, allowNulls);
    }

    public void Insert(Post post) {
        getCollection().insert(Map(post));
    }

    private DBObject Map(Post post) {
        BasicDBObject mapped = new BasicDBObject("_id", post.getId())
            .append("body", post.getBody())
            .append("answerId", post.getAcceptedAnswerId())
            .append("lastEditorId", post.getLastEditorUserId())
            .append("ownerId", post.getOwnerUserId())
            .append("postType", post.getPostTypeId())
            .append("score", post.getScore())
            .append("views", post.getViewCount())
        ;

        return mapped;
    }
}

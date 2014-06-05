package writers;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import model.Comment;

/**
 * Created by andrea on 05/06/14.
 */
public class CommentsWriter extends BaseWriter {
    public CommentsWriter(DBCollection collection) {
        this(collection, true);
    }

    public CommentsWriter(DBCollection collection, boolean allowNulls) {
        super(collection, allowNulls);
    }

    public void Insert(Comment comment) {
        getCollection().insert(Map(comment));
    }

    private DBObject Map(Comment comment) {
        BasicDBObject mapped = new BasicDBObject("_id", comment.getId())
            .append("createdAt", comment.getCreationDate())
            .append("score", comment.getScore())
            .append("postId", comment.getPostId())
            .append("text", comment.getText())
            .append("userId", comment.getUserId())
        ;

        return mapped;
    }
}

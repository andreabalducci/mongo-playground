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
            .append("title", post.getTitle())
            .append("body", post.getBody())
            .append("answerId", post.getAcceptedAnswerId())
            .append("lastEditorId", post.getLastEditorUserId())
            .append("ownerId", post.getOwnerUserId())
            .append("postType", post.getPostTypeId())
            .append("score", post.getScore())
            .append("views", post.getViewCount())
            .append("favs", post.getFavoriteCount())
            .append("comments", post.getCommentCount())
            .append("answers", post.getAnswerCount())
            .append("tags", post.getTags())
            .append("createdAt", post.getCreationDate())
            .append("updatedAt", post.getLastEditDate())
        ;

        return mapped;
    }
}

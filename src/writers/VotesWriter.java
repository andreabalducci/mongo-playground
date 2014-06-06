package writers;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import model.Vote;

/**
 * Created by andrea on 06/06/14.
 */
public class VotesWriter extends BaseWriter {
    public VotesWriter(DBCollection collection) {
        this(collection, true);
    }

    public VotesWriter(DBCollection collection, boolean allowNulls) {
        super(collection, allowNulls);
    }

    public void Insert(Vote vote) {
        getCollection().insert(Map(vote));
    }

    private DBObject Map(Vote vote) {
        BasicDBObject mapped = new BasicDBObject("_id", vote.getId())
                .append("postId", vote.getPostId())
                .append("typeId", vote.getVoteTypeId())
                .append("createdAt", vote.getCreationDate())
                ;

        return mapped;
    }
}
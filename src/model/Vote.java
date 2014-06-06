package model;

import java.util.Date;

/**
 * Created by andrea on 06/06/14.
 */
public class Vote {
    private final int id;
    private final int postId;
    private final int voteTypeId;
    private final Date creationDate;

    public Vote(int id, int postId, int voteTypeId, Date creationDate) {
        this.id = id;
        this.postId = postId;
        this.voteTypeId = voteTypeId;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public int getPostId() {
        return postId;
    }

    public int getVoteTypeId() {
        return voteTypeId;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}

package model;

import java.util.Date;

/**
 * Created by andrea on 06/06/14.
 */
public class Vote {
    public static final int TYPE_FAVORITE = 5;


    private final int id;
    private final int postId;
    private final int voteTypeId;
    private final Date creationDate;
    private final int userId;

    public Vote(int id, int postId, int voteTypeId, Date creationDate, int userId) {
        this.id = id;
        this.postId = postId;
        this.voteTypeId = voteTypeId;
        this.creationDate = creationDate;
        this.userId = userId;
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

    public int getUserId() {
        return userId;
    }
}

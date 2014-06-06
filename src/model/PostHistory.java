package model;

import java.util.Date;

/**
 * Created by andrea on 06/06/14.
 */
public class PostHistory {
    private final int id;
    private final int postHistoryTypeId;
    private final int postId;
    private final int userId;
    private final String text;
    private final String revisionGUID;
    private final Date creationDate;

    public PostHistory(int id, int postHistoryTypeId, int postId, int userId, String text, String revisionGUID, Date creationDate) {

        this.id = id;
        this.postHistoryTypeId = postHistoryTypeId;
        this.postId = postId;
        this.userId = userId;
        this.text = text;
        this.revisionGUID = revisionGUID;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public int getPostHistoryTypeId() {
        return postHistoryTypeId;
    }

    public int getPostId() {
        return postId;
    }

    public int getUserId() {
        return userId;
    }

    public String getText() {
        return text;
    }

    public String getRevisionGUID() {
        return revisionGUID;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}

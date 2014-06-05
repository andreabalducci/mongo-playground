package model;

import java.util.Date;
import java.util.Set;

/**
 * Created by andrea on 05/06/14.
 */
public class Post {
    private final int id;

    private final String title;
    private final String body;
    private final int postTypeId;
    private final int score;
    private final int viewCount;
    private final int ownerUserId;
    private final int lastEditorUserId;
    private final int answerCount;
    private final int commentCount;
    private final int favoriteCount;
    private final int acceptedAnswerId;

    private final String[] tags;
    private final Date creationDate;
    private final Date lastEditDate;

    public Post(int id,
                String title,
                String body,
                int postTypeId,
                int acceptedAnswerId,
                int score,
                int viewCount,
                int ownerUserId,
                int lastEditorUserId,
                int answerCount,
                int commentCount,
                int favoriteCount,
                String[] tags,
                Date creationDate,
                Date lastEditDate
    ) {
        this.id = id;
        this.title = title;
        this.body = body;
        this.postTypeId = postTypeId;
        this.acceptedAnswerId = acceptedAnswerId;
        this.score = score;
        this.viewCount = viewCount;
        this.ownerUserId = ownerUserId;
        this.lastEditorUserId = lastEditorUserId;
        this.answerCount = answerCount;
        this.commentCount = commentCount;
        this.favoriteCount = favoriteCount;
        this.tags = tags;
        this.creationDate = creationDate;
        this.lastEditDate = lastEditDate;
    }

    public String getBody() {
        return body;
    }

    public int getId() {
        return id;
    }

    public int getPostTypeId() {
        return postTypeId;
    }

    public int getScore() {
        return score;
    }

    public int getViewCount() {
        return viewCount;
    }

    public int getAcceptedAnswerId() {
        return acceptedAnswerId;
    }

    public int getLastEditorUserId() {
        return lastEditorUserId;
    }

    public int getOwnerUserId() {
        return ownerUserId;
    }

    public String getTitle() {
        return title;
    }

    public int getFavoriteCount() {
        return favoriteCount;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public int getAnswerCount() {
        return answerCount;
    }

    public String[] getTags() {
        return tags;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public Date getLastEditDate() {
        return lastEditDate;
    }
}

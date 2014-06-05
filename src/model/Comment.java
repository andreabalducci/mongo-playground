package model;

import java.util.Date;

/**
 * Created by andrea on 05/06/14.
 */
public class Comment {
    private final int id;
    private final int postId;
    private final int score;
    private final String text;
    private final Date creationDate;
    private final int userId;

    public Comment(int id, int postId, int score, String text, Date creationDate, int userId) {

        this.id = id;
        this.postId = postId;
        this.score = score;
        this.text = text;
        this.creationDate = creationDate;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public int getPostId() {
        return postId;
    }

    public int getScore() {
        return score;
    }

    public String getText() {
        return text;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public int getUserId() {
        return userId;
    }
}

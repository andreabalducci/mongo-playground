package model;

/**
 * Created by andrea on 05/06/14.
 */
public class Post {
    private final int id;
    private final String body;
    private final int postTypeId;
    private final int score;
    private final int viewCount;
    private final int ownerUserId;
    private final int lastEditorUserId;
    private final int acceptedAnswerId;

    public Post(int id,
                String body,
                int postTypeId,
                int acceptedAnswerId,
                int score,
                int viewCount,
                int ownerUserId,
                int lastEditorUserId
    ) {
        this.id = id;
        this.body = body;
        this.postTypeId = postTypeId;
        this.acceptedAnswerId = acceptedAnswerId;
        this.score = score;
        this.viewCount = viewCount;
        this.ownerUserId = ownerUserId;
        this.lastEditorUserId = lastEditorUserId;
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

}

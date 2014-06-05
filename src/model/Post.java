package model;

/**
 * Created by andrea on 05/06/14.
 */
public class Post {
    private final int id;
    private final String body;

    public Post(int id, String body) {

        this.id = id;
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public int getId() {
        return id;
    }
}

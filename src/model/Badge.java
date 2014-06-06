package model;

import java.util.Date;

/**
 * Created by andrea on 06/06/14.
 */
public class Badge {
    private final int id;
    private final int userId;
    private final String name;
    private final Date date;

    public Badge(int id, int userId, String name, Date date) {

        this.id = id;
        this.userId = userId;
        this.name = name;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }
}

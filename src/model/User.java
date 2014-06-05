package model;

import com.mongodb.DBObject;

import java.util.Date;

/**
 * Created by andrea on 04/06/14.
 */
public class User {
    private int Id;
    private String DisplayName;
    private String WebsiteUrl;
    private String Location;
    private String AboutMe;
    private int Reputation;
    private int Age;
    private final Date createdAt;
    private final Date lastSeenAt;

    public User(
        int id,
        String displayName,
        String websiteUrl,
        String location,
        String aboutMe,
        int reputation,
        int age,
        Date createdAt,
        Date lastSeenAt
    ) {
        Id = id;
        DisplayName = displayName;
        WebsiteUrl = websiteUrl;
        Location = location;
        AboutMe = aboutMe;
        Reputation = reputation;
        Age = age;
        this.createdAt = createdAt;
        this.lastSeenAt = lastSeenAt;
    }

    public int getId() {
        return Id;
    }

    public String getDisplayName() {
        return DisplayName;
    }

    public String getWebsiteUrl() {
        return WebsiteUrl;
    }

    public String getLocation() {
        return Location;
    }

    public String getAboutMe() {
        return AboutMe;
    }

    public int getReputation() {
        return Reputation;
    }

    public int getAge() {
        return Age;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getLastSeenAt() {
        return lastSeenAt;
    }
}

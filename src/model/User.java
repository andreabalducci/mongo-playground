package model;

/**
 * Created by andrea on 04/06/14.
 */
public class User {
    private int Id;
    private String DisplayName;
    private String WebsiteUrl;
    private String Location;
    private String AboutMe;

    public User(int id, String displayName, String websiteUrl, String location, String aboutMe) {
        Id = id;
        DisplayName = displayName;
        WebsiteUrl = websiteUrl;
        Location = location;
        AboutMe = aboutMe;
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
}

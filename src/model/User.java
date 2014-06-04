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
    private int Reputation;
    private int Age;

    public User(int id, String displayName, String websiteUrl, String location, String aboutMe, int reputation, int age) {
        Id = id;
        DisplayName = displayName;
        WebsiteUrl = websiteUrl;
        Location = location;
        AboutMe = aboutMe;
        Reputation = reputation;
        Age = age;
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
}

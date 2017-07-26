/**
 * Created by rasalp on 7/26/2017.
 */
public class User {
    private int uid;
    private String name;
    private int age;
    private int rating;

    public int getUid() {
        return uid;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRating() {
        return rating;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
    public User(int uid, String name, int age, int rating) {
        this.uid = uid;
        this.name = name;
        this.age = age;
        this.rating = rating;
    }
}

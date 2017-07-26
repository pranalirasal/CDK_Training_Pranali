/**
 * Created by rasalp on 7/26/2017.
 */
public class Cinema {
    public static void main(String[] args) {
        User user = new User(456, "XYZ", 9, 2);
        User user1 = new User(345, "ABC", 19, 4);
        User user2 = new User (234, "GHI", -90, 5);
        MovieService movieService = new MovieService();
        //InvalidPriceException: cannot be less than 2000
        try {
            movieService.buy(user, 1000.00);
        }catch (InvalidPriceException e) {
            e.printStackTrace();
        }
        catch (InvalidAgeException e) {
            e.printStackTrace();
        }
        //LowerUserRatingException: User rating too low.
        try {
            movieService.watch(user);
        }catch (LowUserRatingException e) {
            e.printStackTrace();
        }
        //InvalidPriceException: Price cannot be negative
        try {
            movieService.buy(user1, -200);
        }catch (InvalidPriceException e) {
            e.printStackTrace();
        }catch (InvalidAgeException e) {
            e.printStackTrace();
        }
        //InvalidAgeException: Age cannot be less than 20
        try {
            movieService.buy(user1, 3000.00);
        }catch (InvalidPriceException e) {
            e.printStackTrace();
        }catch (InvalidAgeException e) {
            e.printStackTrace();
        }
        //InvalidAgeException: Age cannot be less than 10
        try {
            movieService.buy(user, 3000.00);
        }catch (InvalidPriceException e) {
            e.printStackTrace();
        }catch (InvalidAgeException e) {
            e.printStackTrace();
        }
        //InvalidAgeException: Age cannot be negative
        try {
            movieService.buy(user2, 3000.00);
        }catch (InvalidPriceException e) {
            e.printStackTrace();
        }catch (InvalidAgeException e) {
            e.printStackTrace();
        }
    }
}


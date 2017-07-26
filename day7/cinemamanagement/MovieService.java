/**
 * Created by rasalp on 7/26/2017.
 */
public class MovieService {
    public void watch (User user) throws LowUserRatingException{
        if (user.getRating() < 3) {
            throw new LowUserRatingException ("User rating too low.");
        }
    }
    public void buy (User user, double price) throws InvalidPriceException, InvalidAgeException, AgeOutOfRangeException{
        if (price <= 0) {
            throw new InvalidPriceException("Invalid price. Price cannot be equal to or less than zero.");
        }
        else if (price < 2000) {
            throw new InvalidPriceException("Price cannot be less than 2000");
        }
        else if (user.getAge() <= 0 || user.getAge() >= 130) {
            throw new AgeOutOfRangeException ("Enter valid age. Age cannot be negative and greater than 130");
        }
        else if (user.getAge() < 10) {
            throw new InvalidAgeException("You are underage. You should be at least 10 years older.");
        }
        else if (user.getAge() < 20) {
            throw new InvalidAgeException("You are underage. You should be at least 10 years older to watch this movie.");
        }
    }
}

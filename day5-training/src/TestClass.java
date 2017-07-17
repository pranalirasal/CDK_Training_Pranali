import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rasalp on 7/17/2017.
 */
public class TestClass {
    @Test
    public void checkPrime(){
        List<Integer> output = Arrays.asList(2, 3, 5, 7, 11, 13, 17, 19);
        Assert.assertEquals("Prime Numbers not detected correctly",  output, PrimeNumberFinder.primeNumberFinder(20));
    }
    @Test
    public void isTwoPrime() {
        List<Integer> output1 = Arrays.asList(2);
        Assert.assertEquals("2 is a prime number. Expected output should be 2.",  output1, PrimeNumberFinder.primeNumberFinder(2));
    }
}

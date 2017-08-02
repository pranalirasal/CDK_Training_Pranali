import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * Created by rasalp on 7/28/2017.
 */
public class LambdaForArrayDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(23, 34, 5, 65, 32, 7, 23, 89, 21, 454, 67, 32);

        ArrayManipulation<Integer> consumer = (Integer i) -> {
            System.out.printf("Integer i: %s%n", i);
        };

        numbers.forEach(consumer);
        //numbers divisible by 5
        System.out.println("Numbers divisible by 5: ");
        numbers.forEach((Integer i) -> {
            if (i % 5 == 0)
                System.out.printf("%s%n", i);
        });

        //twice the original number
        System.out.println("Twice the original number: ");
        numbers.forEach((Integer i) -> {
            System.out.println(2 * i);
        });

        //numbers divisible by 2
        System.out.println("Numbers divisible by 2: ");
        numbers.forEach((Integer i) -> {
            if(i % 2 == 0)
                System.out.println(i);
        });
    }
}

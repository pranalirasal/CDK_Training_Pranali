import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 * Created by rasalp on 7/17/2017.
 */
public class PrimeNumberFinder {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        primeNumberFinder(n);
    }

    public static List<Integer> primeNumberFinder(int n) {
        List<Integer> primeNumbers = new ArrayList();
        boolean [] numbers = new boolean[n + 1];
        Arrays.fill(numbers,true);

        for (int i = 2; i * i <= n; i++) {
            if (numbers[i]) {
                for (int j = i * 2; j <= n; j += i) {
                    numbers[j] = false;
                }
            }
        }
        for (int i = 2; i <= n; i++){
            if (numbers[i])
                primeNumbers.add(i);
        }
        return primeNumbers;
    }
}

import org.junit.Test;

/**
 * Created by rasalp on 7/31/2017.
 */
public class ConcurrentFileReader {

    public static void main(String[] args) {
        FileReader1 fileReader1 = new FileReader1();
        FileReader2 fileReader2 = new FileReader2();

        Thread fileThread1 = new Thread(fileReader1);
        Thread fileThread2 = new Thread(fileReader2);

        fileThread1.start();
        fileThread2.start();
    }

}

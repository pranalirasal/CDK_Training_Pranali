import java.io.*;

/**
 * Created by rasalp on 7/31/2017.
 */
public class FileReader1 implements Runnable{
    @Override
    public void run() {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(
                    "C:\\Users\\rasalp\\IdeaProjects\\day5-training\\concurrentfilereading\\src\\input1.txt")));
            String line = br.readLine();
            System.out.println(line);
            while ((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }

    }
}

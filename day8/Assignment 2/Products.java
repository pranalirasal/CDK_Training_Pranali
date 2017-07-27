import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

class Products {
	public static void main(String[] args) {
		
		Set<String> carNames = new HashSet<> ();
		carNames.add ("BMW");
		carNames.add ("Audi");
		carNames.add ("Indigo");
		carNames.add ("Jaguar");
		carNames.add ("Lamborghini");
		carNames.add ("Tesla");
		carNames.add ("Swift Desire");
		carNames.add ("Land Rover");
		
		File file = null;
		BufferedWriter br = null;
		try {
			file = new File ("C:/Assignments/day8/Assignment 2/cars.txt");
			br = new BufferedWriter (new OutputStreamWriter (new FileOutputStream (file)));
			
			Iterator<String> itr = carNames.iterator();
			
			while (itr.hasNext()) {
				String car = itr.next();
				br.write (car);
				br.write ("\n");
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (br != null) 
					br.close();
				if (file != null)
					file.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Done!");
	}
}
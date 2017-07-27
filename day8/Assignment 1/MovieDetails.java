import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

class MovieDetails {
	public static void main(String[] args) {
		InputStream is = null;
		
		try {
			is = new FileInputStream("C:/Assignments/day8/Assignment 1/movieDetail.txt");
			int b = is.read();
			
			while ( b != -1) {
				System.out.print((char)b);
				b = is.read();
			}
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (is != null) 
					is.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
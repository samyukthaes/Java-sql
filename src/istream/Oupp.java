package istream;
import java.io.File;
import java.io.FileOutputStream;


public class Oupp {
	public static void main(String[] args) {
		File file= new File("file.txt");
		try {
			FileOutputStream output=new FileOutputStream("D://file.txt");
			output.write(70);
			output.close();
			System.out.println("Success");
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	

}

package istream;
import java.io.File;
import java.io.FileInputStream;

public class inpp {
	public static void main(String[] args) {
	File file = new File("file.txt");
	
	try {
		FileInputStream input=new FileInputStream(file);
		int character;
		input.read();
		input.close();
		
	
		System.out.println("Success");
	}
		
	catch(Exception e) {
		e.printStackTrace();
	}
 			
		}
	}

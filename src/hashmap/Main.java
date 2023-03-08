package hashmap;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		HashMap<Integer,employee> employe=new HashMap<>();
		employee sam=new employee(433,"soan",22,"tech");
		
		employe.put(1,sam);
		int h=employe.hashCode();
		System.out.println(h);
		}
		
}
		
		
		
	



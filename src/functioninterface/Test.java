package functioninterface;
import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args)
	{
		List < product > productsList = new ArrayList <product>();
        productsList.add(new product( "HP Laptop", 1,25000 ));
        productsList.add(new product( "Dell Laptop",2, 30000 ));
        productsList.add(new product( "Lenevo Laptop",3, 28000 ));
        productsList.add(new product("Sony Laptop", 4,28000 ));
        productsList.add(new product( "Apple Laptop",5, 90000 ));
		List < Integer > filteredProducts = productsList.stream().filter(p->p.productprice>25000).map(p->p.productprice).collect(Collectors.toList());
	        
	        
	        System.out.println(filteredProducts);
	    }
	}


package questionno1;

import java.util.Comparator;

public class NameProduct implements Comparator{

	public int compare(Object o1,Object o2){  
		Product p1=(Product)o1;
		Product p2=(Product)o2;
		
		return p1.name.compareTo(p2.name);
		
	}
}
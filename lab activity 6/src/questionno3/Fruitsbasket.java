package questionno3;
 
import java.util.ArrayList;
import java.util.Collections;

public class Fruitsbasket {

public static void main(String[] args) {
		
		
		ArrayList<String> Fruitbasket1=new ArrayList<>();
		Fruitbasket1.add("Apple");
		Fruitbasket1.add("Mongo");
		Fruitbasket1.add("Watermelon");
		Fruitbasket1.add("Dragon fruit");
		
		System.out.println("This is Fruitbasket1: "+Fruitbasket1);
	
		
		
		ArrayList<String> Fruitbasket2=new ArrayList<>();
		Fruitbasket2.add("Papaya");
		Fruitbasket2.add("Pineapple");
		Fruitbasket2.add("Watermelon");
		
		System.out.println("This is Fruitbasket2: "+Fruitbasket2);
		
	
		Collections.sort(Fruitbasket1);			
		System.out.println("After sorting in ascending order:"+Fruitbasket1);
		
			Collections.sort(Fruitbasket2,Collections.reverseOrder()); 
			System.out.println("After sorting in descending order:"+Fruitbasket2);
	

		
		
		Fruitbasket2.addAll(Fruitbasket1);
System.out.println("after adding the elemets from Fruitbasket1 to Fruitbasket2 "+Fruitbasket2);
	

		
System.out.println("Pineapple is in the list or not: "+Fruitbasket2.contains("Pineapple"));

		
				Fruitbasket1.clear();	
System.out.println("List is empty or not:"+Fruitbasket1.isEmpty());

System.out.println("Before removing the element from the specific position "+Fruitbasket2);

			Fruitbasket2.remove(0);     
System.out.println("After removing the element from the specific position "+Fruitbasket2);

	}

}







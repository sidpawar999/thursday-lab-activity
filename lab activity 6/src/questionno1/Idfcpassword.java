package questionno1;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Idfcpassword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your password: ");		
		String password=sc.next();
		String regex="[A-Za-z#@*]{8}";		
		Pattern p=Pattern.compile(regex);		
		Matcher m=p.matcher(password);		
		boolean matchFound=m.find();	
		if(matchFound)
		{
			System.out.println("Password is valid");
		}
		else {
			System.out.println("Please try again");
		}
	}
}
		

	


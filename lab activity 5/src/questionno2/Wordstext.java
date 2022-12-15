package questionno2; 

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wordstext {
	
	public String findLongestWords() throws FileNotFoundException
	{
		String longest_word=" ";
		String current_word;
		Scanner sc=new Scanner(new File("D:\\s.txt"));
		
		while(sc.hasNext())
		{
			current_word=sc.next();
			if(current_word.length() > longest_word.length())
			{
				longest_word = current_word;
			}
		}
		System.out.println("\n"+longest_word+"\n");
		return longest_word;
		
		
	}

	public static void main(String[] args) throws FileNotFoundException {
		new Wordstext().findLongestWords();

	}

}

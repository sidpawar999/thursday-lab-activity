package questionno3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

 public class Numberofilecount {
	

	public static void main(String[] args) {
		try
		{
		 int lines=0,chars=0,words=0;
		int code=0;
		FileInputStream fin=new FileInputStream("D:\\g.txt");
		
		
		
			while(fin.available()!=0)
			                 {
				                     code=fin.read();
				if(code!=10)
					chars++;
				if(code==32)
					words++;
				if(code==13)
				{
					lines++;
					words++;
				}
					
			 }
			System.out.println("no of character="+chars);
			System.out.println("no of words="+(words+1));
			System.out.println("no. of lines="+(lines+1));
			
			fin.close();
		}
		
		
		
		catch(FileNotFoundException e)
		{
			System.out.println("Cannot find the specified file.............");
		}
		catch(IOException i)
		{
			System.out.println("cannot read file..............");
		}
		

	}

}



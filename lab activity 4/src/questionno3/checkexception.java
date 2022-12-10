package questionno3;



public class checkexception {
	public checkexception(String string) {
	
	}
	//Code to create a userdefined exception to check whether the given name exists or not in an array.  

	public static void main(String args[]){
		try{
		throw new UserException("Siddhesh");
		}
		catch(UserException e){
		System.out.println(e) ;
		}
		}
		}
		class UserException extends Exception{
		String name;
		UserException(String string) {
			name=string;
		}
		public String toString(){
		return ("array = "+name) ;
		}
		

		}


public class NullPointerExceptionDemonstration{

	//method generates nullpointerexception
	public static void generateException(){
		String word=null;
		System.out.println(word.length());
	}

	//method handles  nullpointerexception
	public static void handleException(){
		String word=null;
		try{
			System.out.println(word.length());
		}
		catch(NullPointerException e){
			System.out.println("Exception handled in method "+e);
		}
	}

	public static void main(String[]args){
		//Using try catch block and calling method
		try{
			generateException();
		}
	
		//catching exception
		catch(Exception e){
			System.out.println("Exception handled in main ");
		}

		handleException();
	}
}
		
		
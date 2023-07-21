package classForExceptn;

public class FirstSession {
	public static void main(String[] args) {
	
		String []a= {"gana","karthik","kumar"};
	try {
		System.out.println(a[0].charAt(5));
	}

	catch(ArrayIndexOutOfBoundsException ae) {
		
		System.out.println("ae handled");
	}
    catch(IndexOutOfBoundsException ae) {
		
		System.out.println("index handled");	
	}
   catch(RuntimeException ae) {
		System.out.println("runs handled");	
	}
	
   catch(Exception e) {
			System.out.println("exception handled");
		}
	}
}

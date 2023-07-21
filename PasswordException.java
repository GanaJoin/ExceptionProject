package classForExceptn;

public class PasswordException extends Exception {
       
	    public PasswordException(String v) {
		super(v);
	    }public void printStackTrace() {
	    	System.out.println("checked");
	    }
	    
}

package classForExceptn;

public class Pwd {

	public void checkPwd(String a) throws PasswordException {
		//a="ganapathy";
		try {
		if(a.length()>8) {
			System.out.println("login successfull");
		}
		else   {
			throw new PasswordException("invalid");
			//System.out.println("invalid");
		}
		}
		catch (Exception e ) {
			e.printStackTrace();
           //System.out.println(e+" :after throw handled by catch");
		}
	}

}


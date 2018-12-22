package software;
import java.util.ArrayList;
import java.util.Scanner;
public class user_operation {
	public post p=new post();
	user_form x=new user_form();
	form c=new form();

	void write_post() {


	}
	//__________________________________________________________________________
	boolean searchinpost() {


	}
	void choose_categry() {
		int choose;
		 Scanner input = new Scanner(System.in);
		 choose=input.nextInt();

	}
	//_________________________________________________________________________

	void signin() {
		user_form x=new user_form();
		x.login_form();
	}
	//__________________________________________________________________
	void signup() {

		user_form x=new user_form();
		x.signup_form();

	}
	//------------------------------------------------------

	 int exit() {
			return 0;
		 }
}

package software;
import java.util.ArrayList;
import java.util.Scanner;
public class user_operation {
	public post p=new post();
	user_form x=new user_form();
	form c=new form();

	void write_post() {

String text;
		
		category c=new category();
		c.display_all_category();
		choose_categry();
		System.out.println("enter your post");
		Scanner input = new Scanner(System.in);
		 
		
		p.save_post.add(input.next());
	}
	//__________________________________________________________________________
	boolean searchinpost() {
x.description();
		category c=new category();
		c.display_all_category();
		choose_categry();
		
		p.display_all_post();
		for(int i=0;i<p.save_post.size();i++) {
		if(p.save_post.contains(x.lost_thing_name))
				{
			     System.out.println("found");
			     
				}
		else
			System.out.println("not found");
		
		}
		
		
		return false;




	}
//________________________________________________________________
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

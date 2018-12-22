package software;
import java.util.Scanner;


public class user_form {

 public
 String n,e,g,p;
 int x,ID,DOF;
 String lost_thing_name;



 void login_form() {
try {
	 Scanner input = new Scanner(System.in);
	 user_database ob = new user_database();



	 System.out.println("enter your name");
     n =input.nextLine();
	  ob.set_name(n);
	  System.out.println("enter your pass");
		p=input.nextLine();
		 ob.set_pass(p);}

     catch(Exception ex )
 {  verifyinformation x=new verifyinformation();
      x.verify();
 }
 }
//----------------------------------------------------------------------------------------
 void signup_form() {


	 try {
	 Scanner input = new Scanner(System.in);
	 Scanner intg = new Scanner(System.in);

	 user_database ob = new user_database();

	 System.out.println("enter your name");
      n =input.nextLine();
	  ob.set_name(n);
	 System.out.println("enter your email");
	 e =input.nextLine();
	  ob.set_email(e);
	 System.out.println("enter your phone_num");
	  x=intg.nextInt();
	  ob.set_phone_num(x);

	 System.out.println("enter your pass");
	p=input.nextLine();
	 ob.set_pass(p);

	 System.out.println( "enter your date_of_birth");
	 DOF=intg.nextInt();
	 ob.set_date_of_birth(DOF);

	 System.out.println("enter your gendr");
	  g=input.nextLine();
	  ob. set_gendr(g);
	 System.out.println("enter your user_id");
	 ID=intg.nextInt();
	 ob.set_user_id(ID);}
	 catch(Exception ex )
     {  verifyinformation x=new verifyinformation();
          x.verify();
     }
 }

 //----------------------------------------------------------------------------------

void description() {


form x=new form();
	 Scanner input = new Scanner(System.in);
	 Scanner put = new Scanner(System.in);
	 System.out.println("enter your lost thing");
	 lost_thing_name=input.nextLine();
	 System.out.println("enter your color of lost thing");
	 x.color=input.nextLine();
	 System.out.println("enter your place of lost thing");
     x.place=input.nextLine();
	 System.out.println("enter the date");
	 x.date=put.nextInt();


}

}

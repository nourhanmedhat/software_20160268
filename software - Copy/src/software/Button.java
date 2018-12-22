package software;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList; 
import java.util.List;
import java.util.Scanner;

class Button { 
	 public
	 String buttonName;
	 int buttonID;
	 
	public void click ()
	{
		System.out.println("1-sign up");
		System.out.println("2- sign in");
		System.out.println("3- add item");
		System.out.println("4-search");
		System.out.println("5-exit");
		
		
	}
	 
	
	 
	 
public static void main(String[] args) {
		
		 
		 
		 Button b=new Button();
       
		user_operation f=new user_operation();
		 int choose;
		 
		
		 Scanner input = new Scanner(System.in);
		 
		while(true) {
			b.click();
			 System.out.println("enter your choose");
			choose=input.nextInt();
		 switch(choose) {
		 case 1:
			 f.signup();
			 break;
		 case 2:
		 f.signin();
		 break;
		 
		 case 3:
			 f.write_post();
			 break;
		 case 4:
			 f.searchinpost();
			 break;
		 case 5:
			 return;
		 
		 }
		}
		 
		 
			

		 
		 
	 } 
		 
		 
		}
	 
	 
	 

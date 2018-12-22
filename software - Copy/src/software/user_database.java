package software;

import java.util.ArrayList;


public class user_database {
	
void set_name(String n) {
	name.add(n);
}
ArrayList<String> get_name() {
	 
	 return name;
 }


void set_email(String e) {
	email.add(e);
}
ArrayList<String> get_email() {
	 
	 return email;
 }
void set_phone_num(	Integer x) {
	phone_num.add(x);
}
ArrayList<Integer> get_phone_num() {
	 
	 return phone_num;
 }
void set_pass(String p) {
	pass.add(p);
}
ArrayList<String> get_pass() {
	 
	 return pass;
 }
void set_date_of_birth(Integer DOF) {
	date_of_birth.add(DOF);
}
ArrayList<Integer> get_date_of_birth() {
	 
	 return date_of_birth;
 }
void set_gendr(String g) {
	gendr.add(g);
}
ArrayList<String> get_gendr() {
	 
	 return gendr;
 }
void set_user_id(Integer ID) {
	user_id.add(ID);
}
ArrayList<Integer> get_user_id() {
	 
	 return user_id;
 }
	private ArrayList<String> name=new ArrayList<String>();
	private ArrayList<String> email=new ArrayList<String>();
	private ArrayList<Integer> phone_num=new ArrayList<Integer>();
	private ArrayList<String> pass=new ArrayList<String>();
	private ArrayList<Integer> date_of_birth=new ArrayList<Integer>();
	private ArrayList<String> gendr=new ArrayList<String>();
	private ArrayList<Integer> user_id=new ArrayList<Integer>();
	
}

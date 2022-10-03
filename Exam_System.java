//Surekha Bhoi
//java programming
//Task 4 - Online Examination System

import java.util.HashMap;
import java.util.Scanner;
public class Exam_System{
Scanner input=new Scanner(System.in);
HashMap<String,Integer> data=new HashMap<String,Integer>();
	
	public void login() {
		data.put("Surekha",1234); //username and password
		data.put("Swati",2345);
		data.put("Nilam", 1811);
		data.put("Shivani",1608);
		data.put("Priti",1611);
		System.out.println("\n\n-------------------------WELCOME TO EXAM PORTAL----------------------------------");
		String userid;
		int pwd;
		System.out.println("Login to continue...");
		System.out.print("Enter user id : ");
		userid=input.next();
		System.out.print("Enter password : ");
		pwd=input.nextInt();
		if(data.containsKey(userid) && data.get(userid)==pwd) {
			System.out.println("Login sucessful");
				option_menu();
		}
		else {
			System.out.println("SORRY!!! Invalid Login");
			System.out.println("Try again");
				login();
		}
	}
	public void option_menu() {
		int select;
		System.out.println("Enter the option you want to perform");
		System.out.println("1.Update profile and password");
		System.out.println("2.Start the exam");
		System.out.println("3.Logout");
		select=input.nextInt();
		switch(select) {
		case 1:
			data=update();
			option_menu();
			break;
		case 2:
			exam_que();
			option_menu();
			break;
		case 3:
			System.exit(0);
			break;
		default:
			System.out.println("Invalid entry");
		}
	}
	public HashMap<String,Integer> update(){
		String upser;
		int upwd;
		System.out.println("Welcome to Update profile");
		System.out.println("Enter user name");
		upser=input.next();
		if(data.containsKey(upser)) {
		System.out.println("Enter new password you to want to update to your profile");
		upwd = input.nextInt();
		data.replace(upser, upwd);
		}
		else {
			System.out.println("User doesn't exist");
		}
		return data;
	}
public void exam_que() {
	long examtime=System.currentTimeMillis();
	long endtime=examtime+30;
	int answer_count=0;
	int ans,score;
	System.out.println("Start the exam");
	
	//Question Start From Here 
	
	while(System.currentTimeMillis()<endtime) {
		System.out.println("You have 5 minutes to answer 5 questions");
		System.out.println("Each question carries 5 marks"+" "+"-1 for wrong answer");

        System.out.println("\n\n1. Who invented Java Programming?");
		System.out.println("1)James Gosling"+"\t"+" 2)Bjarne Stroustrup"+"\t"+" 3)Guido van Rossum"+"\t"+" 4)Dennis Ritchie");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Saved");
		if(ans==1) {
			answer_count++;
		}

		System.out.println("\n\n2. Which component is used to compile,debug and execute the java program?		");
		System.out.println("1) JRE"+"\t"+" 2) JIT"+"\t"+" 3) JDK"+"\t"+" 4)JVM");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Saved");
		if(ans==3) {
			answer_count++;
		}
		System.out.println("\n\n3. Which of the following is a superclass of every class in java?");
		System.out.println("1)Array List"+"\t"+" 2)Abstract class"+"\t"+" 3)Object class"+"\t"+"4) String");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Saved");
		if(ans==3) {
			answer_count++;
		}
		
		System.out.println("\n\n4. Which of the following is not a java feature?");
		System.out.println("1) object-oriented"+"\t"+" 2)use of pointers"+"\t"+" 3) portable"+"\t"+" 4) dynamic");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Saved");
		if(ans==2) {
			answer_count++;
		}
		System.out.println("\n\n5. What is the extension of java code fils?");
		System.out.println("1) .js"+"\t"+" 2) .txt"+"\t"+" 3) .class"+"\t"+"4) .java");
		System.out.println("Enter correct option");
		ans=input.nextInt();
		System.out.println("Answer Saved");
		if(ans==4) {
			answer_count++;
		}
		break;
	}
	System.out.println("You have finished the exam");
	score=answer_count*10-((5-answer_count)*5); //Score Counting 
	System.out.println("Your score is..."+" "+score+"/50");	
}

public static void main (String[] args)
{
	Exam_System log =new Exam_System();
		log.login(); //function calling
}
}

 

		
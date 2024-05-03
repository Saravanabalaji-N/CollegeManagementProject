package dao;

	import java.sql.SQLException;
import java.util.Scanner;

	public class CollegeDetails {

		public void studentDetails() throws SQLException {
			
			String student;
			String record;
			Scanner sc=new Scanner(System.in);
			System.out.println("\nAre You New Student or Old Student");
			System.out.println("press New for 'new' or 'NEW'\n"
					+ "press Old for 'old' or 'OLD'\" \n");
			System.out.println("Enter the Vaild input :");
			student=sc.next().toLowerCase();
			while (!student.matches("old") && !student.matches("new")) {
				System.out.println("enter the valid input:");
				student = sc.next();
			}
			if(student.equals("old")) {
			LoginPassword lg = new LoginPassword();
			LoginPassword.login();
			System.out.println("------------------------------");
			System.out.println("You Are Sucessfully LoggedIn");
			System.out.println("------------------------------");
			
		
			System.out.println("\nwhich record you need\n1.attendence\n2.marks");
			System.out.println("Enter the Vaild input :");
			record=sc.next().toLowerCase();
			while (!record.matches("1") && !record.matches("2")) {
				System.out.println("enter the valid input:");
				record = sc.next();
			}
				if(record.equals("1")) {
					lg.attendence();
				}
				
				if(record.equals("2")) {
					lg.marks();
				}
			
			}
			
			if(student.equals("new")){
			Enquiry eq = new Enquiry();
			eq.details();
			}
		}
	}



package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import model.Pojo;
import util.DatabaseConnection;

public class LoginPassword {

	public static void login() throws SQLException {
		Pojo pj=new Pojo();
		Scanner sc = new Scanner(System.in);
		String userName1;
		String password1;
		String pattern = "[a-zA-Z0-9]{1,12}";
		String pattern2 = "[a-zA-Z0-9]{1,12}";

		Connection connection1 = DatabaseConnection.connectionDrive();

		System.out.println("\n   -----SIGNIN-----\n");
		System.out.println("enter your UserName :");
		userName1 = sc.next();
		while (!userName1.matches(pattern)) {
			System.err.println("Incorrect UserName");
			System.out.println("enter your UserName again:");
			userName1 = sc.next();
		}
		System.out.println("enter your Password :");
		password1 = sc.next();
		while (!password1.matches(pattern2)) {
			System.err.println("Incorrect Password");
			System.out.println("enter your Password again:");
			password1 = sc.next();
		}
		
		pj.setName(userName1);
		pj.setPassword(password1);
		
		String query = "insert into logintable values(?,?)";
		PreparedStatement prepare = connection1.prepareStatement(query);
		prepare.setString(1, userName1);
		prepare.setString(2, password1);
		int rows = prepare.executeUpdate();
		System.out.println("Rows Affected : " + rows);
	}
	
	
//	------------------Student Attendence----------------
	
	public void attendence() {
		Scanner sc = new Scanner(System.in);

		String year;
		String department;
		String pattern = "[1-4]";
		System.out.println("Enter Your Year  ('1' or '2' or '3' or '4')");
		year = sc.next();
		while (!year.matches(pattern)) {
			System.out.println("enter your Year again ('1' or '2' or '3' or '4')");
			year = sc.next();
		}
		System.out.println("Enter Your Deparment ('CSE' or 'IT' or 'ECE')");
		department = sc.next().toLowerCase();
		while (!department.matches("cse") && !department.matches("it") && !department.matches("ece")) {
			System.out.println("enter your Deparment again:");
			department = sc.next().toLowerCase();
		}
		if (department.equals("cse")) {
		Scanner se = new Scanner(System.in);
		String name;
		System.out.println("\n   -----Computer Science Students Details-----\n");
		System.out.println("1.Saravana\n2.Naveen\n3.Akash");
		System.out.println("\nenter your Name :");
		name = se.next().toLowerCase();
		while (!name.equals("saravana")&&!name.equals("naveen")&&!name.equals("akash")) {
			System.err.println("Incorrect Name:");
			System.out.println("\nenter your Name again :");
			name = se.next().toLowerCase();
		}
		if(name.equals("saravana")) {
			System.out.println("\nName     : Saravana\n"
					         + "Year       : 4-year\n"
					         + "Department : Computer Science\n"
					         + "attendence : 95%");
		}
		if(name.equals("naveen")) {
			System.out.println("\nName     : Naveen\n"
					         + "Year       : 4-year\n"
					         + "Department : Computer Science\n"
					         + "attendence : 92%");
		}
		if(name.equals("akash")) {
			System.out.println("\nName     : Akash\n"
					         + "Year       : 4-year\n"
					         + "Department : Computer Science\n"
					         + "attendence : 98%");
		}
	}
		
		if (department.equals("it")) {
			Scanner se = new Scanner(System.in);
			String name;
			System.out.println("\n   -----Information Technology Students Details-----\n");
			System.out.println("1.Saravana\n2.Naveen\n3.Akash");
			System.out.println("\nenter your Name :");
			name = se.next().toLowerCase();
			while (!name.equals("saravana")&&!name.equals("naveen")&&!name.equals("akash")) {
				System.err.println("Incorrect Name:");
				System.out.println("\nenter your Name again :");
				name = se.next().toLowerCase();
			}
			if(name.equals("saravana")) {
				System.out.println("\nName     : Saravana\n"
						         + "Year       : 4-year\n"
						         + "Department : Computer Science\n"
						         + "attendence : 95%");
			}
			if(name.equals("naveen")) {
				System.out.println("\nName     : Naveen\n"
						         + "Year       : 4-year\n"
						         + "Department : Computer Science\n"
						         + "attendence : 92%");
			}
			if(name.equals("akash")) {
				System.out.println("\nName     : Akash\n"
						         + "Year       : 4-year\n"
						         + "Department : Computer Science\n"
						         + "attendence : 98%");
			}
		}
		
		if (department.equals("ece")) {
			Scanner se = new Scanner(System.in);
			String name;
			System.out.println("\n   -----Electrical & Communication  Students Details-----\n");
			System.out.println("1.Saravana\n2.Naveen\n3.Akash");
			System.out.println("\nenter your Name :");
			name = se.next().toLowerCase();
			while (!name.equals("saravana")&&!name.equals("naveen")&&!name.equals("akash")) {
				System.err.println("Incorrect Name:");
				System.out.println("\nenter your Name again :");
				name = se.next().toLowerCase();
			}
			if(name.equals("saravana")) {
				System.out.println("\nName     : Saravana\n"
						         + "Year       : 4-year\n"
						         + "Department : Computer Science\n"
						         + "attendence : 95%");
			}
			if(name.equals("naveen")) {
				System.out.println("\nName     : Naveen\n"
						         + "Year       : 4-year\n"
						         + "Department : Computer Science\n"
						         + "attendence : 92%");
			}
			if(name.equals("akash")) {
				System.out.println("\nName     : Akash\n"
						         + "Year       : 4-year\n"
						         + "Department : Computer Science\n"
						         + "attendence : 98%");
			}
		}
	}
	
//	------------------------------Student Marks-----------------------------
	
	public void marks() {
		
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("\n   -----Computer Science Students Details-----\n");
		System.out.println("1.Saravana\n2.Naveen\n3.Akash");
		System.out.println("\nenter your Name :");
		name = sc.next().toLowerCase();
		while (!name.equals("saravana")&&!name.equals("naveen")&&!name.equals("akash")) {
			System.out.println("Incorrect Name:");
			System.out.println("\nenter your Name again :");
			name = sc.next().toLowerCase();
		}
		if(name.equals("saravana")) {
			System.out.println("\nName     : Saravana\n"
					         + "Year       : 4-year\n"
					         + "Department : Computer Science\n"
					         + "mark       : 495/500");
		}
		if(name.equals("naveen")) {
			System.out.println("\nName     : Naveen\n"
					         + "Year       : 4-year\n"
					         + "Department : Computer Science\n"
					         + "mark       : 492/500");
		}
		if(name.equals("akash")) {
			System.out.println("\nName     : Akash\n"
					         + "Year       : 4-year\n"
					         + "Department : Computer Science\n"
					         + "mark       : 455/500");
		}
	
	}


	
	}

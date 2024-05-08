package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import model.ManagementSetting;
import util.DatabaseConnection;

public class Enquiry {

//	--------------Student Signup-----------------------


	public static void studentSignupDetails() throws SQLException {
		String firstName;
		String lastName;
		String dob;
		String id;
		String location;
		String password;
		String pattern = "[a-zA-z]+";
		String pattern2 = "[0-9]{4}-[0-9]{2}-[0-9]{2}";
		String pattern3 = "[0-9]{4}[0-9]{4}[0-9]{4}[0-9]{4}";
		String pattern4 = "[a-zA-z0-9]+";

		Scanner sc = new Scanner(System.in);
		Connection connection2 = DatabaseConnection.connectionDrive();
		System.out.println("   -----SIGNUP-----\n");
		System.out.println("enter your FirstName :");
		firstName = sc.next();
		while (!firstName.matches(pattern)) {
			System.out.println("enter your FirstName again:");
			firstName = sc.next();
		}

		System.out.println("enter your Lastname :");
		lastName = sc.next();
		while (!lastName.matches(pattern)) {
			System.out.println("enter your Lastname again:");
			lastName = sc.next();
		}

		System.out.println("enter your dob :");
		System.out.println("YYYY-MM-DD    :");
		dob = sc.next();
		while (!dob.matches(pattern2)) {
			System.out.println("enter your DOB again:");
			System.out.println("DD-MM-YYYY          :");
			dob = sc.next();
		}

		System.out.println("enter your AadharId :");
		System.out.println("aaaa-bbbb-cccc-dddd :");
		id = sc.next();
		while (!id.matches(pattern3)) {
			System.out.println("enter your AadharId again:");
			System.out.println("aaaa-bbbb-cccc-dddd      :");
			id = sc.next();
		}

		System.out.println("enter your Location :");
		location = sc.next();
		while (!location.matches(pattern)) {
			System.out.println("enter your Location again:");
			location = sc.next();
		}

		System.out.println("enter your Password :");
		password = sc.next();
		while (!password.matches(pattern4)) {
			System.out.println("enter your Password again:");
			password = sc.next();
		}

		ManagementSetting pj = new ManagementSetting();
		pj.setFirstName(firstName);
		pj.setLastName(lastName);
		pj.setDob(dob);
		pj.setId(id);
		pj.setLocation(location);
		pj.setPassword(password);

		String query = "insert into signup values(?,?,?,?,?,?)";
		PreparedStatement prepare = connection2.prepareStatement(query);
		prepare.setString(1, firstName);
		prepare.setString(2, lastName);
		prepare.setString(3, dob);
		prepare.setString(4, id);
		prepare.setString(5, location);
		prepare.setString(6, password);
		int rows = prepare.executeUpdate();
		System.out.println("Rows Affected : " + rows);

		System.out.println("\n----------------------------");
		System.out.println("FirstName :" + firstName);
		System.out.println("Lastname  :" + lastName);
		System.out.println("DOB       :" + dob);
		System.out.println("AadharId  :" + id);
		System.out.println("Location  :" + location);
		System.out.println("------------------------------");
		System.out.println("Your Sinup Completed");
		System.out.println("------------------------------");
		LoginPassword.studentLogin();
//		recordChoose();

	}
	
//	--------------Admin Signup-----------------------

	
	public static void adminSignupDetails() throws SQLException {
		String userName;
		String mailId;
		String dob1;
		String location1;
		String password1;
		String pattern = "[a-zA-z]+";
		String pattern2 = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+])(?=.*\\d).{8,}$";
		String pattern3 = "[0-9]{4}-[0-9]{2}-[0-9]{2}";
		String pattern4 = "[a-zA-z0-9]+";

		Scanner sc = new Scanner(System.in);
		Connection connection2 = DatabaseConnection.connectionDrive();
		System.out.println("   -----SIGNUP-----\n");
		System.out.println("enter your UserName :");
		userName = sc.next();
		while (!userName.matches(pattern)) {
			System.out.println("enter your UserName again:");
			userName = sc.next();
		}

		System.out.println("enter your MailId :");
		mailId = sc.next();
		while (!mailId.matches(pattern2)) {
			System.out.println("enter your MailId again:");
			mailId = sc.next();
		}

		System.out.println("enter your dob :");
		System.out.println("YYYY-MM-DD    :");
		dob1= sc.next();
		while (!dob1.matches(pattern3)) {
			System.out.println("enter your DOB again:");
			System.out.println("DD-MM-YYYY          :");
			dob1 = sc.next();
		}

		System.out.println("enter your Location :");
		location1 = sc.next();
		while (!location1.matches(pattern)) {
			System.out.println("enter your Location again:");
			location1 = sc.next();
		}

		System.out.println("enter your Password :");
		password1 = sc.next();
		while (!password1.matches(pattern4)) {
			System.out.println("enter your Password again:");
			password1 = sc.next();
		}

		ManagementSetting pj = new ManagementSetting();
		pj.setUserName(userName);
		pj.setMailId(mailId);
		pj.setDob1(dob1);
		pj.setLocation1(location1);
		pj.setPassword1(password1);

		String query = "insert into AdminSignup values(?,?,?,?,?)";
		PreparedStatement prepare = connection2.prepareStatement(query);
		prepare.setString(1, userName);
		prepare.setString(2, mailId);
		prepare.setString(3, dob1);
		prepare.setString(4, location1);
		prepare.setString(5, password1);
		int rows = prepare.executeUpdate();
		System.out.println("Rows Affected : " + rows);

		System.out.println("\n----------------------------");
		System.out.println("FirstName :" + userName);
		System.out.println("Lastname  :" + mailId);
		System.out.println("DOB       :" + dob1);
		System.out.println("Location  :" + location1);
		System.out.println("------------------------------");
		System.out.println("Your Sinup Completed");
		System.out.println("------------------------------");
		LoginPassword.adminLogin();

	}
	
	

//	--------------details of adminManagement-----------------------

	public static void availability() throws SQLException {
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------------------------");
		System.out.println("You are logged in");
		System.out.println("-----------------------------\n");

		System.out.println("   -----AdminManagement------\n");
		System.out.println("1.MarksUpdate (press '1')\n" + "2.Marks Details (press '2')\n"
				+ "3.feesPayment (press 't' or 'T')\n");
		System.out.println("enter the valid input:");

		String keyWord = sc.next().toLowerCase();
		while (!keyWord.matches("1") && !keyWord.matches("2")) {
			System.out.println("enter the valid input:");
			keyWord = sc.next();
		}
		if (keyWord.equals("1")) {
	
			LoginPassword.attendenceManagement();
			// hostel method is below this page
		}
		if (keyWord.equals("2")) {
//			transport();
			// transport method is below this page
		}
	
	
	}
//	---------------Record choose(Attendance & Marks)---------------

	public static void recordChoose() throws SQLException {
		Scanner sc = new Scanner(System.in);
		LoginPassword lg = new LoginPassword();
		String record;
		System.out.println("------------------------------");
		System.out.println("You Are Sucessfully LoggedIn");
		System.out.println("------------------------------");

		System.out.println("\nwhich record you need\n1.attendence\n2.marks");
		System.out.println("Enter the Vaild input :");
		record = sc.next().toLowerCase();
		while (!record.matches("1") && !record.matches("2")) {
			System.out.println("enter the valid input:");
			record = sc.next();
		}
		if (record.equals("1")) {
			LoginPassword.attendenceManagement();
		}

		if (record.equals("2")) {
			lg.marks();
		}
	}

//	public static void marksUpdate() throws SQLException {
//		
//		Scanner sc = new Scanner(System.in);
//		ManagementSetting pj = new ManagementSetting();
//		Connection connection = DatabaseConnection.connectionDrive();
//		String studentName;
//		String pattern = "[a-zA-Z0-9]{1,12}";
//		System.out.println("enter your StudentName :");
//		studentName = sc.next();
//		while (!studentName.matches(pattern)) {
//			System.err.println("Incorrect StudentName");
//			System.out.println("enter your StudentName again:");
//			studentName = sc.next();
//		}
//		
//		pj.setStudentName(studentName);
//		
//		String query = "Select FirstName from signup where FirstName=? ";
////		String query1 = "insert into Marks(Student_Names) values(?)";
//		PreparedStatement prepare = connection.prepareStatement(query);
////		PreparedStatement prepare1 = connection.prepareStatement(query1);
//		prepare.setString(1, pj.getStudentName());
//
//		ResultSet rs = prepare.executeQuery();
////		int rows = prepare1.executeUpdate();
//		if (rs.next()) {
//			System.out.println("");
//		} else {
//			System.err.println("StudentName is not available");
//			marksUpdate();
//		}
////		LoginPassword.attendenceManagement();
//	}

	public void feesPayment() {

	}
}

package dao;

import java.sql.Connection;
import java.sql.ResultSetMetaData;

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
		String aadharId;
		String location;
		String password;
		String pattern = "[a-zA-z]+";
		String pattern2 = "[0-9]{4}-[0-9]{2}-[0-9]{2}";
		String pattern3 = "[0-9]{4}[0-9]{4}[0-9]{4}[0-9]{4}";
		String pattern4 = "[a-zA-z0-9]+";
		String pattern5 = "[a-zA-Z]{4}[0-9]{4}";

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

		System.out.println("enter your ID :");
		id = sc.next();
		while (!id.matches(pattern5)) {
			System.out.println("enter your ID again:");
			id = sc.next();
		}

		System.out.println("enter your User Password :");
		password = sc.next();
		while (!password.matches(pattern4)) {
			System.out.println("enter your User Password again:");
			password = sc.next();
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
		aadharId = sc.next();
		while (!aadharId.matches(pattern3)) {
			System.out.println("enter your AadharId again:");
			System.out.println("aaaa-bbbb-cccc-dddd      :");
			aadharId = sc.next();
		}

		System.out.println("enter your Location :");
		location = sc.next();
		while (!location.matches(pattern)) {
			System.out.println("enter your Location again:");
			location = sc.next();
		}

		ManagementSetting pj = new ManagementSetting();
		pj.setFirstName(firstName);
		pj.setLastName(lastName);
		pj.setId(id);
		pj.setPassword(password);
		pj.setDob(dob);
		pj.setAadharid(aadharId);
		pj.setLocation(location);

		String query = "insert into signup values(?,?,?,?,?,?,?)";
		PreparedStatement prepare = connection2.prepareStatement(query);
		prepare.setString(1, firstName);
		prepare.setString(2, lastName);
		prepare.setString(3, id);
		prepare.setString(4, password);
		prepare.setString(5, dob);
		prepare.setString(6, aadharId);
		prepare.setString(7, location);

		int rows = prepare.executeUpdate();
		System.out.println("Rows Affected : " + rows);

		System.out.println("\n----------------------------");
		System.out.println("FirstName :" + firstName);
		System.out.println("Lastname  :" + lastName);
		System.out.println("UserId  :" + id);
		System.out.println("DOB       :" + dob);
		System.out.println("AadharId  :" + aadharId);
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
		String pattern4 = " ^(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()_+]){8}$";

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
		dob1 = sc.next();
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

	public static void adminDetailsChoose() throws SQLException {
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------------------------");
		System.out.println("You are logged in");
		System.out.println("-----------------------------\n");

		System.out.println("   -----AdminManagement------\n");
		System.out.println(
				"1.MarksUpdate (press '1')\n" + "2.Marks Details (press '2')\n" + "3.feesPayment (press 't' or 'T')\n");
		System.out.println("enter the valid input:");

		String keyWord = sc.next().toLowerCase();
		while (!keyWord.matches("1") && !keyWord.matches("2")) {
			System.out.println("enter the valid input:");
			keyWord = sc.next();
		}
		if (keyWord.equals("1")) {

			LoginPassword.marks();
			// hostel method is below this page
		}
		if (keyWord.equals("2")) {
//			transport();
			// transport method is below this page
		}

	}
//	---------------Admin Record choose(Attendance & Marks)---------------

	public static void sudentRecordChoose(ManagementSetting pj) throws SQLException {
		Scanner sc = new Scanner(System.in);
		LoginPassword lg = new LoginPassword();
		String record;
		System.out.println("------------------------------");
		System.out.println("You Are Sucessfully LoggedIn");
		System.out.println("------------------------------");

		System.out.println("\nwhich record you need\n1.Marks\n2.Attendance");
		System.out.println("Enter the Vaild input :");
		record = sc.next().toLowerCase();
		while (!record.matches("1") && !record.matches("2")) {
			System.out.println("enter the valid input:");
			record = sc.next();
		}
		if (record.equals("1")) {
			studentMarkView(pj);
		}

		if (record.equals("2")) {
//			lg.marks();
		}
	}

//	---------------Student Record choose(Attendance & Marks)---------------

	public static void studentMarkView(ManagementSetting pj) throws SQLException {
		Connection connection = DatabaseConnection.connectionDrive();

		Scanner sc = new Scanner(System.in);
		String myName;
		myName = ManagementSetting.getId();
		String query = "Select English,Tamil,Maths,Social_science,Science from marks where Student_id=? ";
		PreparedStatement prepare = connection.prepareStatement(query);
		prepare.setString(1, myName);
		ResultSet rs = prepare.executeQuery();
		ResultSetMetaData rm = rs.getMetaData();
		int columnCount = rm.getColumnCount();
		if (rs.next()) {
			for (int i = 1; i <= columnCount; i += 1) {
				System.out.print(rm.getColumnName(i) + "\t\t");
			}
			System.out.println();
			for (int i = 1; i <= columnCount; i += 1) {
				System.out.print(rs.getString(i) + "\t\t");
			}
			System.out.println();
		}
			else {
			System.err.println("No data updated...");
			}
		
	}
}

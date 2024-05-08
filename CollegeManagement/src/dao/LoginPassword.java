package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import model.ManagementSetting;
import util.DatabaseConnection;

public class LoginPassword {

//	------------------Student login----------------

	public static void studentLogin() throws SQLException {
		ManagementSetting pj = new ManagementSetting();
		Scanner sc = new Scanner(System.in);
		String userName1;
		String password1;
		String pattern = "[a-zA-Z0-9]{1,12}";
		String pattern2 = "[a-zA-Z0-9]{1,12}";

		Connection connection1 = DatabaseConnection.connectionDrive();

		System.out.println("\n   -----LOGIN-----\n");
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

		pj.setFirstName(userName1);
		pj.setPassword(password1);

		String query = "Select FirstName,Password from signup where FirstName=? and Password=? ";
		PreparedStatement prepare = connection1.prepareStatement(query);
		prepare.setString(1, pj.getFirstName());
		prepare.setString(2, pj.getPassword());
		ResultSet rs = prepare.executeQuery();

		if (rs.next()) {
			System.out.println("");
		} else {
			System.err.println("invalid 'UserName' or 'Password'");
			studentLogin();
		}

	}

//	------------------Admin login----------------

	public static void adminLogin() throws SQLException {
		ManagementSetting pj = new ManagementSetting();
		Scanner sc = new Scanner(System.in);
		String userName2;
		String password2;
		String pattern = "[a-zA-Z0-9]{1,12}";
		String pattern2 = "[a-zA-Z0-9]{1,12}";

		Connection connection2 = DatabaseConnection.connectionDrive();

		System.out.println("\n   -----LOGIN-----\n");
		System.out.println("enter your UserName :");
		userName2 = sc.next();
		while (!userName2.matches(pattern)) {
			System.err.println("Incorrect UserName");
			System.out.println("enter your UserName again:");
			userName2 = sc.next();
		}
		System.out.println("enter your Password :");
		password2 = sc.next();
		while (!password2.matches(pattern2)) {
			System.err.println("Incorrect Password");
			System.out.println("enter your Password again:");
			password2 = sc.next();
		}

		pj.setUserName(userName2);
		pj.setPassword1(password2);

		String query = "Select UserName,Password1 from AdminSignup where UserName=? and Password1=? ";
		PreparedStatement prepare = connection2.prepareStatement(query);
		prepare.setString(1, pj.getUserName());
		prepare.setString(2, pj.getPassword1());
		ResultSet rs = prepare.executeQuery();

		if (rs.next()) {
			System.out.println("");
		} else {
			System.err.println("invalid 'UserName' or 'Password'");
			adminLogin();
		}

	}



//	------------------Student Attendance----------------

	public static void attendenceManagement() throws SQLException {
		ManagementSetting pj = new ManagementSetting();
		Scanner sc = new Scanner(System.in);
		Connection connection = DatabaseConnection.connectionDrive();
		String studentName;
		String pattern = "[a-zA-Z0-9]{1,12}";
		System.out.println("enter your StudentName :");
		studentName = sc.next();
		while (!studentName.matches(pattern)) {
			System.err.println("Incorrect StudentName");
			System.out.println("enter your StudentName again:");
			studentName = sc.next();
		}
		pj.setStudentName(studentName);
		
		String query1 = "Select FirstName from signup where FirstName=? ";
		PreparedStatement prepare = connection.prepareStatement(query1);
	
		prepare.setString(1, pj.getStudentName());
		ResultSet rs = prepare.executeQuery();
		
		if (rs.next()) {
			
			System.out.println("");
		} else {
			System.err.println("StudentName is not available");
		}

   int[] marks=new int[5];
   System.out.println("enter the marks");
   for( int i=0;i<marks.length;i++){
	   marks[i]=sc.nextInt();
   }

   pj.setMark1( marks[0]);
   pj.setMark2( marks[1]);
   pj.setMark3( marks[2]);
   pj.setMark4( marks[3]);
   pj.setMark5( marks[4]);
   String query = "insert into Marks(Student_Names,English,Tamil,Maths,Social_science,Science) values(?,?,?,?,?,?) ";
	PreparedStatement prepare1 = connection.prepareStatement(query);
	System.out.println(studentName);
	prepare1.setString(1,studentName);
	prepare1.setLong(2, pj.getMark1());
	prepare1.setLong(3, pj.getMark2());
	prepare1.setLong(4, pj.getMark3());
	prepare1.setLong(5, pj.getMark4());
	prepare1.setLong(6, pj.getMark5());
//	System.out.println(names);
	int rows = prepare1.executeUpdate();
	
	}

//	------------------------------Student Marks-----------------------------

	public void marks() {
	}

}

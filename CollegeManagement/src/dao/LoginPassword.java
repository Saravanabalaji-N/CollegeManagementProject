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
		String userId;
		String password1;
		String pattern = "[a-zA-Z]{4}[0-9]{4}";
		String pattern2 = "[a-zA-Z0-9]{1,12}";

		Connection connection1 = DatabaseConnection.connectionDrive();

		System.out.println("\n   -----STUDENT LOGIN-----\n");
		System.out.println("enter your UserId :");
		userId = sc.next();
		while (!userId.matches(pattern)) {
			System.err.println("Incorrect UserId");
			System.out.println("enter your UserId again:");
			userId = sc.next();
		}
		System.out.println("enter your Password :");
		password1 = sc.next();
		while (!password1.matches(pattern2)) {
			System.err.println("Incorrect Password");
			System.out.println("enter your Password again:");
			password1 = sc.next();
		}

		pj.setId(userId);
		pj.setPassword(password1);

		String query = "Select Id,Password from signup where Id=? and Password=? ";
		PreparedStatement prepare = connection1.prepareStatement(query);
		prepare.setString(1, pj.getId());
		prepare.setString(2, pj.getPassword());
		ResultSet rs = prepare.executeQuery();

		if (rs.next()) {
			System.out.println("");
		} else {
			System.err.println("invalid 'UserId' or 'Password'");
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

		System.out.println("\n   -----ADMIN LOGIN-----\n");
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

//	------------------------------Student Marks Update-----------------------------

	public static void marks() throws SQLException {
		ManagementSetting pj = new ManagementSetting();
		Scanner sc = new Scanner(System.in);
		Connection connection = DatabaseConnection.connectionDrive();
		String userId;
		String studentName;
		String pattern = "[a-zA-Z0-9]{1,12}";
		System.out.println("enter the StudentName to update:");
		studentName = sc.next();
		while (!studentName.matches(pattern)) {
			System.err.println("Incorrect StudentName");
			System.out.println("enter the StudentName to update again:");
			studentName = sc.next();
		}
		System.out.println("enter the userId :");
		userId = sc.next();
		while (!userId.matches(pattern)) {
			System.err.println("Incorrect userId");
			System.out.println("enter the userId again :");
			userId = sc.next();
		}
		pj.setStudentName(studentName);
		pj.setId(userId);
		String query1 = "Select FirstName from signup where FirstName=? and Id=? ";
		PreparedStatement prepare = connection.prepareStatement(query1);

		prepare.setString(1, pj.getStudentName());
		prepare.setString(2, pj.getId());
		ResultSet rs = prepare.executeQuery();

		if (rs.next()) {

			System.out.println("Student Name is Available");
			int[] marks = new int[5];
			System.out.println("enter the marks");
			for (int i = 0; i < marks.length; i++) {
				System.out.println("Enter the Mark[" + (i + 1) + "]=");
				marks[i] = sc.nextInt();
			}
			pj.setMark1(marks[0]);
			pj.setMark2(marks[1]);
			pj.setMark3(marks[2]);
			pj.setMark4(marks[3]);
			pj.setMark5(marks[4]);
			String query = "insert into Marks(Student_id,English,Tamil,Maths,Social_science,Science) values(?,?,?,?,?,?) ";
			PreparedStatement prepare1 = connection.prepareStatement(query);
			prepare1.setString(1, pj.getId());
			prepare1.setLong(2, pj.getMark1());
			prepare1.setLong(3, pj.getMark2());
			prepare1.setLong(4, pj.getMark3());
			prepare1.setLong(5, pj.getMark4());
			prepare1.setLong(6, pj.getMark5());
			int rows = prepare1.executeUpdate();
			System.out.println("Marks Updated");
		} else {
			System.err.println("StudentName is not available");
			marks();
		}

	}
}

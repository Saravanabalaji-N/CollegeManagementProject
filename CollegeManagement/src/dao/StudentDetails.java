package dao;

import java.sql.SQLException;
import java.util.Scanner;

import model.ManagementSetting;

public class StudentDetails {

	public  void studentDetails(ManagementSetting pj) throws SQLException {

		String student;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nAre You New Student or Old Student");
		System.out.println("Enter New for 'new' or 'NEW'\n" + "Enter Old for 'old' or 'OLD'\" \n");
		System.out.println("Enter the Vaild input :");
		student = sc.next().toLowerCase();
		while (!student.matches("old") && !student.matches("new")) {
			System.out.println("enter the valid input:");
			student = sc.next();
		}
		if (student.equals("old")) {
			LoginPassword.studentLogin();
			Enquiry.sudentRecordChoose(pj);
		}

		if (student.equals("new")) {
			Enquiry.studentSignupDetails();
			Enquiry.sudentRecordChoose(pj);
		}
	}
}

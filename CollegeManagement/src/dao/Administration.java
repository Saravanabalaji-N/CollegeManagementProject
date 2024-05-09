package dao;

import java.sql.SQLException;
import java.util.Scanner;

interface Documents {

	public void adminManagement() throws SQLException;

}

public class Administration implements Documents {

	public void adminManagement() throws SQLException {

		String admin;
		Scanner sc = new Scanner(System.in);
		System.out.println("\nAre You New admin or Old admin");
		System.out.println("Enter New for 'new' or 'NEW'\n" + "Enter Old for 'old' or 'OLD'\" \n");
		System.out.println("Enter the Vaild input :");
		admin = sc.next().toLowerCase();
		while (!admin.matches("old") && !admin.matches("new")) {
			System.out.println("enter the valid input:");
			admin = sc.next();
		}
		if (admin.equals("old")) {
			LoginPassword.adminLogin();
			Enquiry.adminDetailsChoose();
		}

		if (admin.equals("new")) {
			Enquiry.adminSignupDetails();
			Enquiry.adminDetailsChoose();

		}

	}
}

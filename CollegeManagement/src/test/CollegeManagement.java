package test;

import java.sql.SQLException;
import java.util.Scanner;
import dao.Administration;
import dao.StudentDetails;
import model.ManagementSetting;

public class CollegeManagement {

	public static void main(String[] args) throws SQLException {
		
		Administration am=new Administration();
		StudentDetails cd = new StudentDetails();
		ManagementSetting pj=new ManagementSetting();
		String press;
		String pattern="[0-2]{1}";
		
		System.out.println("   -----ABC College-----   \n");
		System.out.println("1.Are you  Admin\n"
				+ "2.Are you  Student\n"
				+"\npress '1' or '2'");
		Scanner sc=new Scanner(System.in);
		press=sc.next();
		while(!press.matches(pattern)) {
			System.out.println("press again '1' or '2' :");
			press=sc.next();
		}
		
		if(press.equals("1")) {
			am.adminManagement();
		}
		if(press.equals("2")) {
			cd.studentDetails(pj);
		}
	}

}

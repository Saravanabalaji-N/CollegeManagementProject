 package dao;

import java.util.Scanner;

public class Enquiry {

//	---------------------details fillup--------------------

	public void details() {
		String firstName;
		String lastName;
		String dob;
		String id;
		String location;
		String pattern = "[a-zA-z]+";
		String pattern2 = "[0-9]{2}-[0-9]{2}-[0-9]{4}";
		String pattern3 = "[0-9]{4}-[0-9]{4}-[0-9]{4}-[0-9]{4}";

		Scanner sc = new Scanner(System.in);

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
		System.out.println("DD-MM-YYYY     :");
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

		System.out.println("\n------------------------------");
		System.out.println("FirstName :" + firstName);
		System.out.println("Lastname :" + lastName);
		System.out.println("DOB :" + dob);
		System.out.println("AadharId :" + id);
		System.out.println("Location :" + location);
		System.out.println("------------------------------");
		System.out.println("your sinup completed");
	}

//	--------------details of adminManagement-----------------------

	public void availability() {
		Scanner sc = new Scanner(System.in);

		System.out.println("-----------------------------");
		System.out.println("You are logged in");
		System.out.println("-----------------------------\n");
		System.out.println("   -----AdminManagement------\n");
		System.out.println("1.Fees Details (press 'f' or 'F')\n" + "2.Hostel Details (press 'h' or 'H')\n"
				+ "3.Transport Details (press 't' or 'T')\n");

		System.out.println("enter the valid input:");
		String keyWord = sc.next().toLowerCase();
		while (!keyWord.matches("f") && !keyWord.matches("h") && !keyWord.matches("t")) {
			System.out.println("enter the valid input:");
			keyWord = sc.next();
		}

		if (keyWord.equals("f")) {
			fees();
			// fees method is below this page
		}
		if (keyWord.equals("h")) {
			hostel();
			// hostel method is below this page
		}
		if (keyWord.equals("t")) {
			transport();
			// transport method is below this page
		}

	}

//	---------------details of Fees & Hostel & Transport---------------

	public void fees() {
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
			if (year.equals("1")) {
				System.out.println("\n-----------------------------");
				System.out.println("   ____Fees Slip  - 1-year___ - 1-year\n");
				System.out.println("1.Tution fees = 12,000\n2.Book fees = 8,000\n" + "3.management fees = 15,000\n");
				System.out.println("total fees = 35,000");
				System.out.println("-----------------------------");
			}
			if (year.equals("2")) {
				System.out.println("\n-----------------------------");
				System.out.println("   ____Fees Slip - 2-year___\n");
				System.out.println("1.Tution fees = 15,000\n2.Book fees = 8,000\n" + "3.management fees = 25,000\n");
				System.out.println("total fees = 48,000");
				System.out.println("-----------------------------");
			}
			if (year.equals("3")) {
				System.out.println("\n-----------------------------");
				System.out.println("   ____Fees Slip - 3-year___\n");
				System.out.println("1.Tution fees = 15,000\n2.Book fees = 10,000\n" + "3.management fees = 25,000\n");
				System.out.println("total fees = 50,000");
				System.out.println("-----------------------------");
			}
			if (year.equals("4")) {
				System.out.println("\n-----------------------------");
				System.out.println("   ____Fees Slip - 4-year___\n");
				System.out.println("1.Tution fees = 18,000\n2.Book fees = 12,000\n" + "3.management fees = 25,000\n");
				System.out.println("total fees = 55,000");
				System.out.println("-----------------------------");
			}
		}
			if (department.equals("it")) {
				if (year.equals("1")) {
					System.out.println("\n-----------------------------");
					System.out.println("   ____Fees Slip  - 1-year___ - 1-year\n");
					System.out
							.println("1.Tution fees = 12,000\n2.Book fees = 8,000\n" + "3.management fees = 15,000\n");
					System.out.println("total fees = 35,000");
					System.out.println("-----------------------------");
				}
				if (year.equals("2")) {
					System.out.println("\n-----------------------------");
					System.out.println("   ____Fees Slip - 2-year___\n");
					System.out
							.println("1.Tution fees = 15,000\n2.Book fees = 8,000\n" + "3.management fees = 25,000\n");
					System.out.println("total fees = 48,000");
					System.out.println("-----------------------------");
				}
				if (year.equals("3")) {
					System.out.println("\n-----------------------------");
					System.out.println("   ____Fees Slip - 3-year___\n");
					System.out
							.println("1.Tution fees = 15,000\n2.Book fees = 10,000\n" + "3.management fees = 25,000\n");
					System.out.println("total fees = 50,000");
					System.out.println("-----------------------------");
				}
				if (year.equals("4")) {
					System.out.println("\n-----------------------------");
					System.out.println("   ____Fees Slip - 4-year___\n");
					System.out
							.println("1.Tution fees = 18,000\n2.Book fees = 12,000\n" + "3.management fees = 25,000\n");
					System.out.println("total fees = 55,000");
					System.out.println("-----------------------------");
				}
			}
			if (department.equals("ece")) {
				if (year.equals("1")) {
					System.out.println("\n-----------------------------");
					System.out.println("   ____Fees Slip  - 1-year___ - 1-year\n");
					System.out
							.println("1.Tution fees = 12,000\n2.Book fees = 8,000\n" + "3.management fees = 15,000\n");
					System.out.println("total fees = 35,000");
					System.out.println("-----------------------------");
				}
				if (year.equals("2")) {
					System.out.println("\n-----------------------------");
					System.out.println("   ____Fees Slip - 2-year___\n");
					System.out
							.println("1.Tution fees = 15,000\n2.Book fees = 8,000\n" + "3.management fees = 25,000\n");
					System.out.println("total fees = 48,000");
					System.out.println("-----------------------------");
				}
				if (year.equals("3")) {
					System.out.println("\n-----------------------------");
					System.out.println("   ____Fees Slip - 3-year___\n");
					System.out
							.println("1.Tution fees = 15,000\n2.Book fees = 10,000\n" + "3.management fees = 25,000\n");
					System.out.println("total fees = 50,000");
					System.out.println("-----------------------------");
				}
				if (year.equals("4")) {
					System.out.println("\n-----------------------------");
					System.out.println("   ____Fees Slip - 4-year___\n");
					System.out
							.println("1.Tution fees = 18,000\n2.Book fees = 12,000\n" + "3.management fees = 25,000\n");
					System.out.println("total fees = 55,000");
					System.out.println("-----------------------------");
				}
		}
		}
	

	public void hostel() {
		System.out.println("Show hostel");
	}

	public void transport() {
		System.out.println("Show transport");
	}
}

package dao;

import java.sql.SQLException;

interface Documents{
	
	public void adminManagement() throws SQLException;
	
}

public class Administration implements Documents {
	

	public void adminManagement() throws SQLException {

		LoginPassword lg = new LoginPassword();
		LoginPassword.login();
		
		
		Enquiry eq = new Enquiry();
		eq.availability();

	}
	
	
}

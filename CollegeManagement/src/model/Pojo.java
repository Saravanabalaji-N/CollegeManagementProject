package model;

public class Pojo {

	String name;
	String password;
	
	
	public Pojo(String name, String password) {
		super();
		this.name = name;
		this.password = password;
		
	}
	

	public Pojo() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String toString() {
		return "pojo [name=" + name + ", password=" + password + "]";
}
}
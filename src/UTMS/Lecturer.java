package UT;

public class Lecturer extends User{

	private String employeeId;
	private String department;
	
	public Lecturer(String userId, String name, String email, String password, String employeeId, String department) {
		super(userId, name, email, password);
		this.department=department;
		this.employeeId=employeeId;
	}
	
	@Override
	public void requestTransport(String destination) {
		System.out.println("Lecturer "+ getName() + " requesting transport to "+ destination + " for teaching purposes");
	}
	
}

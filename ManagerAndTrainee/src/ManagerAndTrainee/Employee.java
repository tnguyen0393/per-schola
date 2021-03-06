package ManagerAndTrainee;

public class Employee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double basicSalary;
	double specialAllowance = 250.80;
	double hra = 1000.50;
	
//	public Employee(long Id, String employeeName, String address, long phone) {
//		this.employeeId = Id;
//		this.employeeName = employeeName;
//		this.employeeAddress = address;
//		this.employeePhone = phone;
//	}
	
	public void calculateSalary() {
		double salary = this.basicSalary + (this.basicSalary * this.specialAllowance/100) + (this.basicSalary * this.hra/100);
	}
}

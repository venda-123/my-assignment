package week2.day1;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) 
	{
		
			System.out.println(empName);
			System.out.println(empId);
			}
		public void getEmployeeAddress(String empAddress)
		{
		
			System.out.println(empAddress);
		}
		public void printEmployeeSalary(double empSalary)
		{
			
			System.out.println(empSalary);
		}
		public void printEmployeeMobileNumber(long mobileNum)
		{
			System.out.println(mobileNum);
		}
		
public static void main(String[] args) 
		{
			EmployeeDetails emp=new EmployeeDetails();
			emp.printEmployeeName("Pooja",546);
		        emp.getEmployeeAddress("chennai");
			emp.printEmployeeSalary(45000.76);
			emp.printEmployeeMobileNumber(8967455749L);

		
	}

}

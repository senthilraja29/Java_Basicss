package Day38_39_22Aug;

class company
{
	private int emp_id = 1002;
	private int emp_salary = 50000;
	
	public int getEmp_id() 
	{
		return emp_id;
	}
	public void setEmp_id(int emp_id) 
	{
		this.emp_id = emp_id;
	}
	public int getEmp_salary() 
	{
		return emp_salary;
	}
	public void setEmp_salary(int emp_salary) 
	{
		this.emp_salary = emp_salary;
	} 
}


public class Assignment_056_encapsulation_int_data 
{
	
	public static void main(String[] args) 
	{
		company team = new company();
		team.setEmp_id(1003);
		System.out.println("Updated Employee ID " + team.getEmp_id());
		team.setEmp_salary(60000);
		System.out.println("Updated Salary Amount " + team.getEmp_salary());
	}
}

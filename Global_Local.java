package Day15_19July;

public class Global_Local {

	int age;
	double salary;
	String name;
	
	void emp_details(int age, double salary, String name ) 
	{
		System.out.println("Age is ->" + age);
		System.out.println("Salary is ->" + salary);
		System.out.println("Name is ->" + name);
	}

public static void main(String[] args) {

	Global_Local A1 = new Global_Local();
	A1.emp_details(70, 1000.89, "Senthil");
	System.out.println(A1.age);
	System.out.println(A1.salary);
	System.out.println(A1.name);
	A1.emp_details(0, 0, null);
}



}

package Day16_22July;

import Day15_19July.Global_Local;

public class This_variable {
	
	int age;
	double salary;
	String name;
	
	void emp_details(int age, double salary, String name ) 
	{
		this.age = age;
		this.name = name;
		
	}
	
public static void main(String[] args) {
	
	This_variable B1 = new This_variable();
	B1.emp_details(70, 1000.89, "Senthil");
	System.out.println(B1.age);
	System.out.println(B1.salary);
	System.out.println(B1.name);
	/*A1.emp_details(0, 0, null);*/
}
	
}	
}

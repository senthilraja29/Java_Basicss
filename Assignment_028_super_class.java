package Day14_18July_herirarchial_level_inheritance;

class Russia {
	void war() {
		System.out.println("War with ukraine / America Against Russia");
	}
	void war(int b) {
		System.out.println("War with ukraine / America Against Russia - 2");
	}
	
	
}
class Israel extends Russia { //Here Russia is the super class
	void war() {
		
		super.war(10); 	//calling out super class
		System.out.println("War with Palestine / America Support Israel");
	//	super.war();
	}
}

public class Assignment_028_super_class extends Israel { //Here Israel is the super class
	public static void main(String[] args) {
	
	Assignment_028_super_class country = new Assignment_028_super_class();
	country.war();
	}
}
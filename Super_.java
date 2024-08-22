package Day14_18July_herirarchial_level_inheritance;

class parent
{
	void login() // method is getting overridden
	{
		System.out.println("Login using email id");
	}
}

public class Super_ extends parent {
	
	void login()
	{
		super.login(); //  it can 1st line
		System.out.println("Login mobile no");
		super.login();
	}
	public static void main(String[] args) {
	
		Super_ m1 = new Super_();
		m1.login();
	
	}
}

package Day38_39_22Aug;

class parent
{
	void login()
	{
		System.out.println("Login by using Mobile");
	}
}

public class Polymorphism_method_overridng extends parent
{
	@Override
	void login()
	{
		System.out.println("Login by using Email");
	}
	
	public static void main(String[] args) 
	{
		Polymorphism_method_overridng p1 = new Polymorphism_method_overridng();
		
		parent p2 = new parent();
	//	p2.login();
	//	p1.login();
		new parent().login();
		new Polymorphism_method_overridng().login();
	}
}

package Day38_39_22Aug;

class flip_kart
{
	private String Username = "customer01";
	private String Password = "12345678";
	
	public String getUsername() 
	{
		return Username;
	}
	public void setUsername(String username) 
	{
		this.Username = username;
	}
	public String getPassword() 
	{
		return Password;
	}
	public void setPassword(String password) 
	{
		this.Password = password;
	}
}
public class Assignment_encapsulation 
{
	public static void main(String[] args) 
	{
		flip_kart customer = new flip_kart();
		customer.setUsername("customer02");
		System.out.println("Updated UserName " + customer.getUsername());
		customer.setPassword("876543210");	
		System.out.println("Updated Password " + customer.getPassword());
	}
}

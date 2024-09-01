package Day38_39_22Aug;

class flipkart
{
	private String order1	= "Mobiles - ";
	private String user1 	= "abcdef";
	
	public String getUser() {
		return user1;
	}
	public void setUser(String user) {
		this.user1 = user;
	}
	
	public String getOrder()
	{
		return order1;
		// we can't return in void concept
		// so return type cahnged as String
	}
	public void setOrder(String order)
	{
		this.order1 = order;
	}
}
public class Encapsulation_concept 
{
	public static void main(String[] args) 
	{
		flipkart f1 = new flipkart();
		f1.setOrder("Redmi Prime");
		System.out.println(f1.getOrder());
		f1.setUser("grotech");
		System.out.println(f1.getUser());	
	}
}

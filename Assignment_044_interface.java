package Day23_31July;

interface youtube
{
	void playvideos();
	void uploadvideos();
}

public class Assignment_044_interface implements youtube
{
	@Override
	public void playvideos() 
	{
		System.out.println("Watching Videos ");
	}
	@Override
	public void uploadvideos() 
	{
		System.out.println("Create Content ");
	}
	public static void main(String[] args) 
	{
		Assignment_044_interface google	= new Assignment_044_interface();
		google.playvideos();
		google.uploadvideos();
	}
}

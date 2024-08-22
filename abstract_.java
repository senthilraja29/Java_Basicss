package Day_Four;


abstract class bus_route {
	
	
	abstract void display();
	
	bus_route(){
		
		System.out.println("You r in salem bus stand");
		// System.out.println("Value of C is " + X);

}
	abstract class bus_path {
		abstract void display();
		
		bus_path(){
			System.out.println("Bus going towards velur and reach tirupathi");
		}
	}
}

class bus extends bus_route{

	@Override
	void display() {
		System.out.println("This bus will starts from salem");
				
	}
}

public class abstract_ {

	public static void main(String[] args) {
		
		bus path = new bus();
		path.display();
		
	}
}




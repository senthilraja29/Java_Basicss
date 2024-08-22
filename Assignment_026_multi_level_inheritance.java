package Day13_17July;

class india extends russia {
	
	void indian_army() {
		System.out.println("Indian Army");
	}
}

class russia {
	void russian_army() {
		System.out.println("Russian Missiles");
	}
}

public class Assignment_026_multi_level_inheritance extends india {

	public static void main(String[] args) {
		
		System.out.println("Multi-level Inheritance");
		Assignment_026_multi_level_inheritance war = new Assignment_026_multi_level_inheritance();
		war.russian_army();
		war.indian_army();
	
	}
}

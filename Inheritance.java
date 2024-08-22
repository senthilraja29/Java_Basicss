package Day_three;

public class Inheritance {

	class human{
		
		int nooflegs	= 2;
		int noofhands	= 2;
		String Spealization = "Walk, Talk, Laugh, Think";
		
	}
	
	class men extends human {
		String men_capability = "Physical work"; 
		
		public String getCapability() {
			return men_capability;
		}
	
	}
	
	class women extends human 
	{	String women_capability = "Mental Strength"; 
		
		public String getCapability() {
			return women_capability; }
	}
	
	public static void main(String[] args) {
		
		
		Inheritance inher = new Inheritance();
		men men_action = inher.new men();
		women women_action = inher.new women();
		System.out.println("Humans parts	" + men_action.noofhands);
		System.out.println("Humans parts	" + men_action.nooflegs);
		System.out.println("Humans parts	" + men_action.Spealization);
		System.out.println("Men	actions		" + men_action.men_capability);
		System.out.println("WOMen actions	" + women_action.women_capability);
	}

}

	
	
	
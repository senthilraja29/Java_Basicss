package Day_Four;

interface first_rounds {

	void apptitude();
	void grammer();
	void logical();

}


interface second_round {
	void tech_quiz();
	void team_handling();
}



class interview implements first_rounds,second_round{

	@Override
	public void tech_quiz() {
	
	System.out.println("teamquiz");
		
	}

	@Override
	public void team_handling() {
		System.out.println("team_handling");
		
	}

	@Override
	public void apptitude() {
		int A = 10;
		int B = 20;
		int C = A+B;
		System.out.println("apptitude");
		System.out.println("Value of C is " + C);
		
	}

	@Override
	public void grammer() {
		System.out.println("grammer");
		
	}

	@Override
	public void logical() {
		System.out.println("logical");
		
	}

	public void display() {
		System.out.println("display");
		
	}
	
	
}

public class inter_faces extends interview {

	public static void main(String[] args) {
	
		interview i1 = new interview();
		i1.display();
		i1.apptitude();
		
	}
}




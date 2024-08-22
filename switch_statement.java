package Hello_world;

public class switch_statement {

	public static void main(String[] args) {
		
		int month;
		
		String namemonth;
		
		month = 14;
		
		switch(month) {
		case 1 :
			namemonth = "Jan"; 
			break;

		case 2 :
			namemonth = "Feb"; 
			break;
		
		case 3 :
			namemonth = "Mar"; 
			break;
		
		case 4 :
			namemonth = "April"; 
			break;
		
		case 5 :
			namemonth = "May"; 
			break;

		case 6 :
			namemonth = "Jun"; 
			break;
		
		case 7 :
			namemonth = "July"; 
			break;

		case 8 :
			namemonth = "Augest"; 
			break;
		
		case 9 :
			namemonth = "Sept"; 
			break;
		
		case 10 :
			namemonth = "Oct"; 
			break;
		
		case 11 :
			namemonth = "Nov"; 
			break;
		
		case 12 :
			namemonth = "Dec"; 
			break;
			
		default :
			namemonth = " - Invalid"; 
			break;
		}
		// Result
			System.out.println("Name of the month "+ namemonth);
		
	}

}

package Day_Four;


public class method_calling {

	static int monthexpenses(int grocery,int currentbill, int homerent) { //monthexpenses is the method. // grocery,currentbill,homerent is values
		
		int total = grocery + currentbill + homerent;
		
		return (total);
		
	}

	
	public static void main(String[] args) {
	
		System.out.println("This is monthly expenses");
		
		int monthbudget = monthexpenses(2000,1000,4000); // calling the method and 
		
		System.out.println("Entire month budget is "+ monthbudget);
		
	}

}




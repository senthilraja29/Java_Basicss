package Day_Four;

class ride {
	
	public void creatures() {
	    System.out.println("Humans have legs ");	}
}

class Method_overriding extends ride {
	
	public void creatures() {
	    System.out.println("Humans have hands");
	}
	
	
	public static void main(String args[]) {
		
		Method_overriding parts = new Method_overriding();
	
		parts.creatures();
	//	parts.creature();
  
	}
	
}





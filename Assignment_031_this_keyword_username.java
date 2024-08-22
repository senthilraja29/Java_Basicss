package Day17_23July;

public class Assignment_031_this_keyword_username {
			
			String name;
			int age;
			int height;
			
		    // Constructor
		    public Assignment_031_this_keyword_username(String names, int ages, int heights) { 	
		    	this.name = names; 
		        this.age = ages;
		        this.height = heights;
		    }

		    // Non static Method to call the user name
		    public void display() {
		        System.out.println("User name: " + this.name + "\nUser age :"
		    + this.age + "\nUser Height :" + this.height ); // 'this.name' refers to the global variable
		    }

	    public static void main(String[] args) {
	    Assignment_031_this_keyword_username User_details = new Assignment_031_this_keyword_username("Indian", 26,7);
	    	User_details.display(); 
		    }
	}


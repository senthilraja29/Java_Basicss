package Day39_40_23Aug;

class Amazon_program
	{
		private String username="contact@grotechminds.com";
		private String password="mjhgfcvg6t";
		public	String getUsername()
			{
				return username;
			}
		
		public	void setUsername(String username )
			{
				this.username=username;
			}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	}

public class EncapsulationConcept 
	{
		public static void main(String[] args) 
		{
			Amazon_program a1=new Amazon_program();
			a1.setUsername("garima@gmail.com");
			System.out.println(a1.getUsername());			
		
		}

	}	
	
	


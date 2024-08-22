package Day19_25July;

public class Array_index_equals {

	public static void main(String[] args) {
		
				int []rollno=new int[5];
				rollno[0]=12;
				rollno[1]=21;
				rollno[2]=23;
				rollno[3]=43;
				rollno[4]=33;
				int givennumber=23;
				
				for(int i=0;i<rollno.length;i++)
				{
					if(givennumber==rollno[i])
					{
						System.out.println("Given number is a part of the Array, at the index position ="+i);
					}
					else
					{
						System.out.println("Sorry NOT FOUND");
					}
				}
			
			}


	}

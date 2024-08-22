package Hello_world;

public class nestedforloop {

	public static void main(String[] args) {
	int twoarr[][] = { {1,4,7},{2,5,8},{6,9,3} };
	
	for (int i=0; i<3; i++)
		{for (int j=0; j<3 ; j++) 
			System.out.print(twoarr[i][j] + " ") ;
		
		System.out.println();
	}

	}
}
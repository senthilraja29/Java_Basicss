package Day12_16July;

import java.util.Scanner;

public class Runtime_error {

	
	public static void main(String[] args) {
		Scanner inputs = new Scanner(System.in);
		
		System.out.println("Hi ");
		String 	A = inputs.next();
		byte 	B = inputs.nextByte(); //values -128 to 127, true
		int 	C = inputs.nextInt();
		float	D = inputs.nextFloat();
		long	E = inputs.nextLong();
		short	F = inputs.nextShort();
		double	G = inputs.nextDouble();
		boolean H = inputs.nextBoolean();
		inputs.close();
		System.out.println(A +" "+ B+" " +C +" "+D+" "+E+" "+F+" "+G+" "+H);
		
	}

}

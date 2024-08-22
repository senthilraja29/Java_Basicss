package Day20_26July;

public class Array_average {
	public static void main(String[] args) {
		
		int aver_age[] = new int[4];
		
		aver_age[0] = 17;
		aver_age[1] = 35;
		aver_age[2] = 81;
		aver_age[3] = 42;
		
		double sum = 0.0;
		
		for(int i = 0; i < aver_age.length ;i++ ) {
			
			sum = sum + aver_age[i] ;
		}
		
		System.out.println(sum/4);
	}
}

package Hello_world;

public class Array2Dimensional {

	public static void main(String[] args) {
		// One Dimensional Array
		int[] arr = new int[4];
		
		arr[0] = 11;
		arr[1] = 12;
		arr[2] = 13;
		arr[3] = 14;
		
		System.out.println("Elements of 1 dim " + arr[0]);
		System.out.println("Elements of 1 dim " + arr[1]);
		System.out.println("Elements of 1 dim " + arr[2]);
		System.out.println("Elements of 1 dim " + arr[3]);
		System.out.println("-------------------------");

		// Two Dimensional Array its used by matrix
		
		int twoarr[][] = {{4,3},{6,1}, {4,2}};
		
		for (int i = 0; i < 2; i ++) {
			for (int j = 0; j < 2; j ++) {
				System.out.print(twoarr[i][j] + " ");
			}
			System.out.println();
		}			
		System.out.println(twoarr[2][1]);
		
		System.out.println("-------------------------");
		
		// 3 Dimensional Array its used by matrix
		
		int[][][] triarr = {
			    {{1, 3, 4}, {2, 6, 9}},
			    {{3, 7, 5}, {10, 7, 4}},
			    {{0, 6, 11}, {19, 17, 24}}
			};

			for (int i = 0; i < triarr.length; i++) {
			    for (int j = 0; j < triarr[i].length; j++) {
			        for (int k = 0; k < triarr[i][j].length; k++) {
			            System.out.print(triarr[i][j][k] + " ");
			        }
			        System.out.println();
			    }
			    System.out.println();
			}
	}
}
package Day_three;

public class Cuboid {

		int width; 
		int height;
		int depth;
		
		Cuboid(int width, int height,int depth) 
			
		{	this.width = width;
			this.height = height;
			this.depth = depth;	}
		
		Cuboid(int width, int height) 
		
		{	this.width = width;
			this.height = height;
			this.depth = 10;	}
		
		Cuboid(int dimension) 
		
		{	width = dimension;
			height = dimension;
			depth = dimension;	}
		
		Cuboid() 
		
		{	this.width = 10;
			this.height = 10;
			this.depth = 10;	}
		
		int volume() 
		{	return width * height * depth; }
		
		
	
		public static void main(String args[]) {
			
			//////	
			
			int volume;
			
			Cuboid stdCuboid = new Cuboid(10,10,10);
			volume = stdCuboid.volume();
			System.out.println("Print the output of cuboid is  " + volume);
		
			Cuboid cuboid_default_depth = new Cuboid(40,10);
			volume = cuboid_default_depth.volume();
			System.out.println("Print the output of cuboid is  " + volume);
		
			Cuboid cube = new Cuboid(2);
			volume = cube.volume();
			System.out.println("volume of the  cube is " + volume);
			
			Cuboid fixed_cube = new Cuboid();
			volume = fixed_cube.volume();
			System.out.println("volume of the fixed_cube is " + volume);
	
		
		}
}



package Day24_1Aug_Access_speacifier;

import Day24_1Aug.Access_speacifier_in_class;

public class Access_speacifer_Outside_package extends Access_speacifier_in_class
{
	public static void main(String[] args) 
	{
		Access_speacifier_in_class q1 = new Access_speacifier_in_class();
		q1.add();
		q1.divi();
	}
}

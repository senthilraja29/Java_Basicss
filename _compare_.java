package Day_Four;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _compare_ {

	int age;
	String Name;
	
	public _compare_(int age,String Name) {
		this.age =  age;
		this.Name = Name;
	}
	
	public String toString() {
		return "Student [age " + age + ", Name " + Name + "]";
	}

	public static void main(String[] args) {
		
	Comparator<_compare_> com = new Comparator<_compare_>()
	
	{
		
		public int compare(_compare_ i, _compare_ j)
		{
		 if(i.age > j.age)
			 return 1;
		 else
			 return -1;
		}

	};
	
		List<_compare_> nums = new ArrayList<>();
		nums.add(new _compare_(21,"Senthil"));
		nums.add(new _compare_(28,"Hema"));
		nums.add(new _compare_(17,"Bhava"));
		nums.add(new _compare_(26,"Shanthi"));

		Collections.sort(nums, com);
		
		for(_compare_ c : nums)
			System.out.println(c);
	}
	
}

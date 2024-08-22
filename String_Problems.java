package Day21_29July;
public class String_Problems 
{
public static void main(String[] args) 
{
	String a="Manish";
	
	System.out.println(a.replace("M", "Z"));
	String a1="Manish Kumar Tiwari";
	System.out.println(a1.replace(" ", ""));
	String a2="Avinash Yadav";
	System.out.println(a2.replaceAll("[A-Z]", ""));
	
	System.out.println(a1.replaceAll("[a-z]", ""));
	
	String a3="kv no 2 Bangalore";
	System.out.println(a3.replaceAll("[0-9]", ""));
}
}

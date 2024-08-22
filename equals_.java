package Day_Four;

import java.util.Objects;

class _str{
	
	String Milk_quantity;
	int Milk_price;
	
	String welcome() // instead of welcome we can able to use tostring
	{
		return "Hi Senthil. \nToday Milk price is... \n" + Milk_quantity + ":"+ Milk_price;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(Milk_price, Milk_quantity);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		_str other = (_str) obj;
		return Milk_price == other.Milk_price && Objects.equals(Milk_quantity, other.Milk_quantity);
	}

	@Override
	public String toString() {
		return "_str [Milk_quantity=" + Milk_quantity + ", Milk_price=" + Milk_price + "]";
	}
	
	
}

public class equals_ {

	public static void main(String[] args) {
		
		_str Milk_shop1 = new _str();
		Milk_shop1.Milk_quantity = "Half Litres";
		Milk_shop1.Milk_price = 30;
		
		
		
		_str Milk_shop2 = new _str();
		Milk_shop2.Milk_quantity = "Half Litres";
		Milk_shop2.Milk_price = 30;
		
		boolean result = (Milk_shop1.equals(Milk_shop2));
		
		System.out.println("Out put of the value is " + result + "\n");
		
		System.out.println(Milk_shop1.welcome());
		
		System.out.println("\n");
		
		System.out.println(Milk_shop2.welcome());
		
		
		_str X = new _str();
		System.out.println("\n"+X.toString());
		
	}
}




package Day_three;

import java.util.ArrayList; // import array lists
import java.util.HashSet; // import hashsets
import java.util.Set;   // import sets
import java.util.List;  // import lists
import java.util.stream.Collectors; // import stream functions


public class streams {

	public static void main(String[] args) {
		
		List<Integer> numberlist = new ArrayList<>();
		numberlist.add(10);
		numberlist.add(15);
		numberlist.add(20);
		numberlist.add(25);
		
		// old format which used to square and store in new place
		
		List <Integer> Squarelist = new ArrayList<>();
			for (Integer i : numberlist)
				{Squarelist.add(i*i); }
		
		System.out.println("By using for loop " + Squarelist);
		
		// Above step takes too much process 
		
		List <Integer> steamsquare = numberlist.stream().map(x -> x*x).collect(Collectors.toList());
		
		System.out.println("Square root of number list is :" + steamsquare);
		
		// Streams in set functions
		
		
		Set<Integer> Squaresets =  new HashSet<>();
		
		for (Integer Z : numberlist)
			{ Squaresets.add(Z*Z); }
		System.out.println("Square for sets in for loop " +Squaresets);
		
		
		Set <Integer> Streamsets = numberlist.stream().map(y -> y * y).collect(Collectors.toSet());
		System.out.println("Square of stream sets -  "+ Streamsets);
		
		// Normal filer options
		
		List<String> words = new ArrayList<>();
		words.add("Book");
		words.add("Table");
		words.add("Chairs");
		words.add("Knife");
		
		List<String> wordsfilter = new ArrayList<>();
		for	(String Q : words)
			if(Q.startsWith("K"))	
				wordsfilter.add(Q); 	
		
		System.out.println(words);
		System.out.println(wordsfilter);
		
		// Streams in filter functions
		
		List<String> wordsstreamfilter = words.stream().filter(a -> a.startsWith("T")).collect(Collectors.toList());
		System.out.println(wordsstreamfilter);
		
		// Stream Sort options
		
		List<String> wordssort = words.stream().sorted().collect(Collectors.toList()); // sort by words
				
		System.out.println("Before sort	-	" + words);
		System.out.println("After Sort	-	" + wordssort);
		
		// For Each functions
		
		System.out.println("---Element of the String---");
		words.stream().forEach(e -> System.out.println("Element is " + e));
		
		// Reduce functions 
		
		int sum = numberlist.stream().reduce(0,(ans,i) -> ans+i);
		System.out.println("Implementing the Squarelist by using reduce functions -" + sum);
		
		
		
	}

}

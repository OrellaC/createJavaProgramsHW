package javaProgramHW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class programHomework {


	public static void main(String[] args) {
		
//		Write a Java program to copy one array list into another
	ArrayList<String> original =new ArrayList<> ();
	original.add("1, 2, 3, 4, 5");
	ArrayList<String> copy =(ArrayList<String>) original.clone();
	System.out.println("This is the bew copy: " + copy);
	
	
	
//		 Write a Java program to extract a portion of an array list
	ArrayList<String> fruits = new ArrayList<> ();
	fruits.addAll(Arrays.asList("Orange", "Apples", "Pears"));
	System.out.println(fruits);

	List<String> extract = fruits.subList(0, 1);
	System.out.println("This is the original array: " + fruits );
	System.out.println("This is the extracted array: " + extract);
	
	extract.add("Cucumber");
	System.out.println("This is the extracted array plus the added item: " + extract);
	System.out.println("This is the original array plus the added item: " + fruits);
	
	
	
//		Write a Java program of swap two elements in an array list
    ArrayList<String> animals = new ArrayList<>();
    animals.addAll(Arrays.asList("cats", "dogs", "hamsters", "giraffes", "birds", "sharks"));
    System.out.println("Original: " + animals);
    
    Collections.swap(animals, 1, 5);
    System.out.println("Swapped: " + animals);
	
	
	
	
//		Write a Java program to test an array list is empty or not
	//
//		Write a Java program to replace the second element of an ArrayList with the specified element.
	//
//		Write a Java program to trim the capacity of an array list the current list size
	//
//		 Write a Java program to test a hash set is empty or not.
	//
//		Write a Java program to get the number of elements in a hash set
	//
//		Write a Java program to iterate through all elements in a hash list.
	//
//		Write a Java program to convert a hash set (key-value pair) to an array.
	//
//		Write a Java program to compare two sets and retain elements that are the same on both sets.

	}

}

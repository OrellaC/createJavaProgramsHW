package javaProgramHW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class programHomework {

	public static void main(String[] args) {

//		Write a Java program to copy one array list into another
		ArrayList<String> original = new ArrayList<>();
		original.add("1, 2, 3, 4, 5");
		ArrayList<String> copy = (ArrayList<String>) original.clone();
		System.out.println("This is the bew copy: " + copy);

//		 Write a Java program to extract a portion of an array list
		ArrayList<String> fruits = new ArrayList<>();
		fruits.addAll(Arrays.asList("Orange", "Apples", "Pears"));
		System.out.println(fruits);

		List<String> extract = fruits.subList(0, 1);
		System.out.println("This is the original array: " + fruits);
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
		ArrayList myArrayList = new ArrayList();

		if (myArrayList.isEmpty()) {
			System.out.println("The ArrayList is empty");
		} else {
			System.out.println("The ArrayList is not empty");
		}
	
//		Write a Java program to replace the second element of an ArrayList with the specified element.
		fruits.set(1, "Tomato");
		System.out.println("This is the original array: " + fruits);

	
//		Write a Java program to trim the capacity of an array list the current list size
		ArrayList<String> colors = new ArrayList<String>();
		colors.addAll(Arrays.asList("Red", "Blue", "White", "Pink"));
		System.out.println("Oirignal array list: " + colors);
		System.out.println("Trimmed array: ");
		colors.trimToSize();
		System.out.println(colors);
		
		
//		Write a Java program to test a hash set is empty or not.
		HashSet<String> h_set = new HashSet();
		// use add() method to add values in the hash set
		h_set.add("Red");
		h_set.add("Green");
		h_set.add("Black");
		h_set.add("White");
		h_set.add("Pink");
		h_set.add("Yellow");
		System.out.println("Original Hash Set: " + h_set);
		System.out.println("Checking the above array list is empty or not! "+h_set.isEmpty());
		System.out.println("Remove all the elements from a Hash Set: ");
		h_set.removeAll(h_set);
		System.out.println("Hash Set after removing all the elements "+h_set);
//		Write a Java program to get the number of elements in a hash set
		//
//		Write a Java program to iterate through all elements in a hash list.
		//
//		Write a Java program to convert a hash set (key-value pair) to an array.
		//
//		Write a Java program to compare two sets and retain elements that are the same on both sets.

	}

}

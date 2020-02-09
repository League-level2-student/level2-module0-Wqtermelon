package arrays;

import java.util.ArrayList;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		ArrayList<String> array = new ArrayList<String>(5);
		array.add("a");
		array.add("ah");
		array.add("ahh");
		array.add("ahhh");
		array.add("ahhhh");
		// 2. print the third element in the array
		System.out.println(array.get(2));
		// 3. add the third element to a different value
		array.add(2, "different value");
		// 4. print the third element again
		System.out.println(array.get(2));
		// 5. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < array.size(); i++) {
			System.out.println(array.get(i));
		}

		// 6. make an array of 50 integers
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		// 7. use a for loop to make every value of the integer array a random number
		for (int k = 0; k < 50; k++) {
			array2.add((int) (Math.random() * 100));
		}
		// 8. without printing the entire array, print only the smallest number in the
		// array
		int min = array2.get(0);
		for (int j = 0; j < array2.size(); j++) {
			if (array2.get(j) < min) {
				min = array2.get(j);
			}
		}
		System.out.println("Min" + min);
		// 9 print the entire array to see if step 8 was correct
		for (int m = 0; m < array2.size(); m++) {
			System.out.println(array2.get(m));
		}
		// 10. print the largest number in the array.
		int max = array2.get(0);
		for (int j = 0; j < array2.size(); j++) {
			if (array2.get(j) > max) {
				max = array2.get(j);
			}
		}
		System.out.println("Max" + max);
	}
}

package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	static int small = 0;
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String array[] = {"Taco", "Quakko", "Mako", "Lokko", "Walko"};
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "Blank";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < 5; i++) {
			System.out.println(array[i]);
		}
		
		//6. make an array of 50 integers
		int [] a = new int [50];
		//7. use a for loop to make every value of the integer array a random number
		for(int is = 0; is < 5; is++) {
		Random r = new Random();
		int ran = r.nextInt(50);
			 a [is]= ran;
		}
		small = a [0];
		for(int iss = 0; iss < 50; iss++) {
			if(small > a [iss]) {
				small = a [iss];
			}
			
		}
		System.out.println(small);
		
		//8. without printing the entire array, print only the smallest number in the array
		
		//9 print the entire array to see if step 8 was correct
		for(int j = 0; j < 50; j++) {
			System.out.println(a [j]);
		}
		small = a [0];
		//10. print the largest number in the array.
		for(int isss = 0; isss < 50; isss++) {	
			if(small < a [isss]) {
				small = a [isss];
			}
	}
		System.out.println(small);
	}
}

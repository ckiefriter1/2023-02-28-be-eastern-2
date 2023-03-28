package week04;

import java.util.List;
import java.util.ArrayList;

public class Week3_4CodingAssignment {

	public static void main(String[] args) {
		
		/* 
		 * 1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		 */
			System.out.println("----------------------------------\n#1 (a,b,c)");
			int[] ages = {3,9,23,64,2,8,28,93};
		
		/* 
		 *   a.	Programmatically subtract the value of the first element in the array from the value in the last element 
		 *      of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		 */
			System.out.println("a:" + (ages[ages.length-1] - ages[0]));
			
		/*
		 *   b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		 */
			// Convert array to List and populate values from the array.
			List<Integer> ageList = new ArrayList<Integer>(ages.length);
			for (int i : ages) {
				ageList.add(i);
			}
			
			// Add the value of 103 to the end of the list.
			ageList.add(103);   
			
			// Convert List back to array.
			int[] ages2 = new int[ageList.size()];
			for (int i = 0; i < ages2.length; i++) {
				ages2[i] = ageList.get(i);
			}
			ages = ages2;    // Re-assign newly updated array back to the original array.
			System.out.println("b:" + (ages[ages.length-1] - ages[0]));
			
		/* 
		 *   c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		 */
			int ageSum = 0;
			int ageAvg = 0;
			for (int i = 0; i < ages.length; i++) {
				ageSum += ages[i];
			}
			ageAvg = ageSum / ages.length;
			System.out.println("c:" + ageAvg);
			
		/* 
		 * 2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		 */
			System.out.println("----------------------------------\n#2 (a,b)");
			String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
					
		/* 
		 *   a.	Use a loop to iterate through the array and calculate the average number of letters per name. 
		 *      Print the result to the console.
		 */
			int letterCount = 0;
			for (int i = 0; i < names.length; i++) {
				letterCount += names[i].length();
			}
			System.out.println("a: " + letterCount + " / " + names.length + " = " + Math.round(((double)letterCount / (double)names.length)));
		
		/* 
		 *   b.	Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, 
		 *      and print the result to the console.
		 */
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < names.length; i++) {
				sb.append(names[i]).append(" ");
			}
			System.out.println("b: " + sb.toString());
		
		
		/* 
		 * 3.	How do you access the last element of any array?
		 */
			System.out.println("----------------------------------\n#3");
			System.out.println("Last element of the array: " + names[names.length-1]);
		
		/* 
		 * 4.	How do you access the first element of any array?
		 */
			System.out.println("----------------------------------\n#4");
			System.out.println("First element of the array: " + names[0]);
		
			
		/* 
		 * 5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array 
		 *      and add the length of each name to the nameLengths array.
		 */
			int[] nameLengths = new int[names.length];
			for (int i = 0; i < names.length; i++) {
				nameLengths[i] = names[i].length();
			}
			System.out.println("----------------------------------\n#5");
			System.out.println("Names array lengths array -> " + nameLengths);
		
		/*
		 * 6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
		 *      Print the result to the console.
		 */
			int nameLengthsSum = 0;
			for (int i = 0; i < nameLengths.length; i++) {
				nameLengthsSum += nameLengths[i];
			}
			System.out.println("----------------------------------\n#6");
			System.out.println("Sum of all elements in lengths array: " + nameLengthsSum);
					
		/* 
		 * 7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
		 *      to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */
			System.out.println("----------------------------------\n#7");
			System.out.println("Concatenated word: " + concatenateWord("Hello", 3));
			
		/* 
		 * 8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be 
		 *      the first and the last name as a String separated by a space).
		 */
			System.out.println("----------------------------------\n#8");
			System.out.println("Full Name: " + getFullName("Chuck", "Kiefriter"));
					
		/*
		 * 9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		 */
			System.out.println("----------------------------------\n#9");
			System.out.println("Sum of ints in age array > 100: " + isIntSumGreaterThan(ages, 100));
						
		/*
		 * 10.	Write a method that takes an array of double and returns the average of all the elements in the array.
		 */
			double[] numbers = {3,9,23,64,2,8,28,93};
			System.out.println("----------------------------------\n#10");
			System.out.println("Average of numbers: " + getAverage(numbers));
			
		/*
		 * 11.	Write a method that takes two arrays of double and returns true if the average of the elements 
		 *      in the first array is greater than the average of the elements in the second array.
		 */
			double[] a = {3,9,23,64,2,8,28,93};
			double[] b = {4,9,25,67,2,9,32,110};
			System.out.println("----------------------------------\n#11");
			System.out.println("Average of numbers: " + isAvgOfAGreaterThanB(a, b));
						
		/*
		 * 12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
		 *      and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		 */
			
		/*
		 * 13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		 */
		

	}
	
	/*
	 * Method for #7
	 */
	public static String concatenateWord(String aWord, int n) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append(aWord);
		}
		return sb.toString();
	}
	
	/*
	 * Method for #8
	 */
	public static String getFullName(String firstName, String lastName) {
		return (firstName + " " + lastName);
	}
	
	/*
	 * Method for #9
	 */
	public static boolean isIntSumGreaterThan(int[] intArray, int limit) {
		int intSum = 0;
		for (int i = 0; i < intArray.length; i++) {
			intSum += intArray[i];
		}
		if (intSum > limit) {
			return true;
		} else {
			return false;
		}
	}
	
	/*
	 * Method for #10
	 */
	public static double getAverage(double[] numbers) {
		double sum = 0.0;
		
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		
		return sum / numbers.length;
		
	}
	
	/*
	 * Method for #11
	 */
	public static boolean isAvgOfAGreaterThanB(double[] a, double[] b) {
		double sumOfA = 0.0;
		double sumOfB = 0.0;
		double avgOfA = 0.0;
		double avgOfB = 0.0;
		
		for (int i = 0; i < a.length; i++) {
			sumOfA += a[i];
		}
		
		avgOfA = sumOfA / a.length;
		
		for (int i = 0; i < b.length; i++) {
			sumOfB += b[i];
		}
		
		avgOfB = sumOfB / b.length;
		
		return (avgOfA > avgOfB);
	}
	
	


}

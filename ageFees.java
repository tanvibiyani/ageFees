// Name: Tanvi Biyani

import java.util.Arrays;
import java.util.Scanner;

public class ageFees {

	public static void main(String[] args) {
		
		int fee = 0;
		int standardPrice = 10; 
		Scanner sc = new Scanner(System.in);
		System.out.println("List the age(s) of each person in your group: ");
		String ui = sc.nextLine();
		
		
		String[] uiArray = ui.split(" "); 
		int[] intArray = new int[uiArray.length]; //stores ints
		
		for(int i = 0; i < uiArray.length; i++) {
			
			intArray[i] = Integer.parseInt(uiArray[i]); //convert string elements to int, store in intArray
			
		}
		
		for(int i = 0; i < intArray.length; i++) { // price calculation for each age
			
			if(intArray[i] >= 60)
				fee += standardPrice - 2;
				
			else if(intArray[i] < 5)
				fee += 0;
			
			else if(intArray[i] < 10)
				fee += (standardPrice/2);
			
			else
				fee += standardPrice;
		}
		
		System.out.println("Total entry fee: " + "$" + fee);	

	}

}

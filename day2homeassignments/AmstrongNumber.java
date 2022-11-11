package week1.day2homeassignments;

public class AmstrongNumber {
	
	
	public static void main(String[] args) {
		// Declare your input
		int n=153;
		
	
		// Declare 3 more int variables as calculated, remainder, original (Tip: Initialize calculated alone
		
		int calculated=0, remainder, original,quotient;

		// Assign input into variable original 

                       original=n;
                       
                       
                    // Use loop to calculate: use while loop to set condition until the number greater than 0
                       
		while(original>0) {
			
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			remainder=original%10;
			
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to 
			
			 original=original/10;
			 
			// Within loop: Add calculated with the cube of remainder & assign it to calculated

			 calculated=calculated+(remainder*remainder*remainder);
			 //cal+(3*3*3)
			//27+125+1
		}
		if(calculated==n) {
			System.out.println("amstrong number");
		}else {
			System.out.println("not amstrong number");
		}
	}
}
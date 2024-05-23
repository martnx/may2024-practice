package NumberGuessing;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//Scanner class
		Scanner scan = new Scanner(System.in);
		
		//given the K trial
		int k = 5;
		
		int i, guess;
		
		System.out.println("A number is chosen"+" between 1 to 100."+ " Guess the number"+" within 5 trials.");
		
		int number = 1 + (int)(100 * Math.random());
		System.out.println(number);
		for(i = 0; i < k; i++) {
			System.out.print("Guess the number: ");
			
			
			// Take input for guessing
			guess = scan.nextInt();
			System.out.println("K: "+-k);
			// If the number is guessed
			if(number == guess) {
				System.out.println("Congratulations!"+" You guessed the number.");
				break;
			}
			else if(number > guess && i != k - 1) {
				System.out.println("The number is" + " less than " + guess);
			}
		}
		if(i == k) {
			//The variable i is equal to k it means the k variable is empty or zero
			System.out.println("You have exhausted" + " K trials.");
			
			//printing the number here
			System.out.println("The number was " + number);
		}

	}

}

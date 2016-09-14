package pkg;

import java.util.Scanner;

public class Football {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//User input for number of attempts
		System.out.println("Please enter the number of attempts");
		double attempts = input.nextDouble();
		
		//User input for number of completions
		System.out.println("Please enter the number of completions");
		double completions = input.nextDouble();
		
		//User input for number of yards
		System.out.println("Please enter the number of yards");
		double yards = input.nextDouble();
		
		//
		System.out.println("Please enter the number of touchdowns");
		double touchdowns = input.nextDouble();
		
		System.out.println("Please enter the number of interceptions");
		double interceptions = input.nextDouble();

		double a = (((completions/attempts) - .3) * 5);
		double b = (((yards/attempts) - 3) * .25);
		double c = ((touchdowns/attempts) * 20);
		double d = (2.375 - ((interceptions/attempts) * 25));
		
		double passerRating = (((a + b + c + d) / 6) * 100);
		
		System.out.println("The passer rating is " + passerRating);
	}

}

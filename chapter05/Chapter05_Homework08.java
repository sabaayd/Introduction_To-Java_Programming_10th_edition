package chapter05;

import java.util.Scanner;

public class Chapter05_Homework08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int highestScore = 0;
		String highestScoreName = "";
		
		System.out.print("How many students are there? ");
		int numofstu = input.nextInt();
		
		System.out.println("Enter each students name and score (cuz we serve a sucky education that promotes mental health issues among students ");
		for (int i = 0; i < numofstu; i++) {
			System.out.print("Student: " + (i + 1) + "\n  Name: ");
			String name = input.next();
			System.out.print(" Score: ");
			int score = input.nextInt();
			
			if (score > highestScore) {
				highestScore = score;
				highestScoreName = name;
				
			System.out.println("Nerds: " + highestScoreName);
		
			}
			
		}
		
		
		
	}

}

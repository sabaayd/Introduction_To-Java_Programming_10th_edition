package chapter05;

public class Chapter05_Homework40 {
	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;
		int coins = 0;
		
		System.out.println("If you were to flip a coin one million times (I mean idk why you would want to but if you ever wanted to)" );
		
		for (int i = 0; i < 1000000; i++) {
			coins = (int)(Math.random() * 2) == 0 ? heads++ : tails++;
			
		}
		System.out.println(
				"Heads: " + heads + "\nTails: " + tails);
		
		
	}
	

}

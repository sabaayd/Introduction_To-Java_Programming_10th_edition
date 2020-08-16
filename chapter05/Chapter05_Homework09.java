package chapter05;

import java.util.Scanner;

public class Chapter05_Homework09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Number of students: ");
		
		int numOfstu = input.nextInt();
	
		System.out.println("Scores of Students: ");
		System.out.println("Names of students: ");
		
		double score = 0;
		double first = 0;
		double second = 0;
		String name = "";
		String student1 = "";
		String student2 = "";
		
		while (numOfstu > 0) {
			score = input.nextDouble();
			name = input.nextLine();
			
			if (score > second) {
				if (score > first) {
					second = first;
					student2 = student1;
					first = score;
					student1 = name;
					
				} else {
					second = score;
					student2 = name;
				}
				second = score;
				student2 = name;
			
				}
			
			numOfstu--;
			
			}
		System.out.println(first + " " + student1);
		System.out.println(second + " " + student2);
		}
		
		
		
		
		
	}



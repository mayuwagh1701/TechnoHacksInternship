package com.TechnoHacks.Internship;

import java.util.Scanner;

/* Task 6 : Quiz Game
Build a program that displays a series of
multiple-choice questions and lets the user
select an answer. */

public class MultipleChoiceQuiz {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int score = 0;

		
		String[] questions = { "Who is the developer of java?\nA. Dennis Ritchie\nB. Guido van Rossum:\nC. James Gosling\nD. Bjarne Stroustrup",
				"In which year java was developed?\nA. 1991\nB. 1990\nC. 1992\nD. 1995",
				"In java JDK stands for?\nA. Java developer kit\nB. Java develop kit\nC. java developed kit\nD. java development kit",
				"What is size of 'char' data types?\nA. 1 Bytes\nB. 4 Bytes\nC. 2 Bytes\nD. 8 Bytes",
				"Which loop is best suitable for Array in java?\nA. for loop\nB. while loop\nC. do-while loop\nD. for-each loop"};

		char[] correctAnswers = { 'C', 'A', 'D', 'C','D'};

		for (int i = 0; i < questions.length; i++) {
			System.out.println("\nQuestion " + (i + 1) + ":");
			System.out.println(questions[i]);
			System.out.print("Your choice: ");
			char userAnswer = sc.next().toUpperCase().charAt(0);

			if (userAnswer == correctAnswers[i]) {
				System.out.println("Correct!\n");
				score++;
			} else {
				System.out.println("Incorrect. The correct answer is " + correctAnswers[i] + ".\n");
			}
		}

		System.out.println("Quiz complete! Your score is: " + score + "/" + questions.length);
		System.out.println("Thank u TechnoHacks!!!");

		
	}

}


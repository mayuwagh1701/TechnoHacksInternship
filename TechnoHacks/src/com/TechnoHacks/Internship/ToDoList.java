package com.TechnoHacks.Internship;

import java.util.ArrayList;
import java.util.Scanner;

/* Task 4 : Simple To-Do List
Build a program that allows users to add,
remove, and view items on a to-do list. */

public class ToDoList {
	public static void main(String[] args) {

		ArrayList<String> toDoList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("To-Do List Menu:");
			System.out.println("1. Add item");
			System.out.println("2. Remove item");
			System.out.println("3. View items");
			System.out.println("4. Quit");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine(); 

			switch (choice) {
			case 1:
				System.out.print("Enter the item to add: ");
				String newItem = sc.nextLine();
				toDoList.add(newItem);
				System.out.println("Item added to the to-do list.");
				break;
			case 2:
				System.out.print("Enter the item to remove: ");
				String itemToRemove = sc.nextLine();
				if (toDoList.contains(itemToRemove)) {
					toDoList.remove(itemToRemove);
					System.out.println("Item removed from the to-do list.");
				} else {
					System.out.println("Item not found in the to-do list.");
				}
				break;
			case 3:
				System.out.println("To-Do List:");
				for (int i = 0; i < toDoList.size(); i++) {
					System.out.println((i + 1) + ". " + toDoList.get(i));
				}
				break;
			case 4:
				System.out.println("Goodbye!");
				sc.close();
				System.exit(0);
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
				break;
			}
		}
	}
}

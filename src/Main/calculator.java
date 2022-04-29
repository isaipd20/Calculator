package Main;

import java.util.Scanner;
import functions.Operators;;

public class calculator {
	static boolean loop = true;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		while(loop == true) {
			System.out.println("Calculator!!");
			System.out.print("Current options -> ");
			System.out.println("1: Add || 0: Quit");
			int select = input.nextInt();
			
			menu(select);
		}
	}
	
	public static void menu(int select) {
		Operators control = new Operators();
		
		if(select == 1) {
			control.operation();
			control.print();
		}
		else if(select == 0) {
			loop = false;
			return;
		}
		else {
			System.out.println("Enter a valid option");
		}
	}

}

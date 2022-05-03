package functions;

import java.util.Scanner;
import functions.Operators;

public class UI {
	static boolean loop = true;
	
	public void Menu() {
		Scanner input = new Scanner(System.in);
		
		while(loop == true) {
			System.out.println("Calculator!!");
			System.out.print("Current options -> ");
			System.out.println("1: Add || 2:subtract || 3:multiply || 4:division || 0:Quit");
			int select = input.nextInt();
			
			menu(select);
		}
	}
	
	public static void menu(int select) {
		Operators control = new Operators();
		
		if(select == 1) {
			control.operation(1);
			control.print();
		}
		else if(select == 2) {
			control.operation(2);
			control.print();
		}
		else if(select == 3) {
			control.operation(3);
			control.print();
		}
		else if(select == 4) {
			control.operation(4);
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

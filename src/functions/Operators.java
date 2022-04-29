package functions;

import java.util.Scanner;

public class Operators {
	private int result = 0;
	
	public void print() {
		System.out.println("Your result is " + result + '\n');
	}
	
	public void sum(int x) {
		result = result + x;
	}
	
	public void operation() {
		Scanner input = new Scanner(System.in);
		Scanner inputNum = new Scanner(System.in);
		int num, n;
		
		System.out.println("How many numbers do you want to sum?");
		num = input.nextInt();
		for(int i = 0; i < num; i++) {
			System.out.println("Enter num " + (i+1) + ": ");
			n = inputNum.nextInt();
			sum(n);
		}
	}

}

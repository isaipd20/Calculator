package functions;

import java.util.Scanner;

public class Operators {
	private double result = 0.0;
	
	public void print() {
		System.out.println("Your result is " + result + '\n');
	}
	
	public void sum(int x) {
		result = result + x;
	}
	
	public void setFirst(int temp) {
		result = temp;
	}
	
	public void sub(int x) {
		result = result - x;
	}
	
	public void mul(int x) {
		result = result * x;
	}
	public void div(int x) {
		result = result / x;
	}
	
	public void operation(int temp) {
		Scanner input = new Scanner(System.in);
		Scanner inputNum = new Scanner(System.in);
		int num, n;
		
		switch(temp) {
		case 1: 
			System.out.println("How many numbers do you want to sum?");
			num = input.nextInt();
			for(int i = 0; i < num; i++) {
				System.out.println("Enter num " + (i+1) + ": ");
				n = inputNum.nextInt();
				sum(n);
			}
			break;
		case 2:
			System.out.println("How many numbers do you want to subtract?");
			num = input.nextInt();
			for(int i = 0; i < num; i++) {
				System.out.println("Enter num " + (i+1) + ": ");
				n = inputNum.nextInt();
				
				if(i == 0) {
					setFirst(n);
				}
				else {
					sub(n);
				}
			}
			break;
		case 3:
			System.out.println("How many numbers do you want to multiply?");
			num = input.nextInt();
			for(int i = 0; i < num; i++) {
				System.out.println("Enter num " + (i+1) + ": ");
				n = inputNum.nextInt();
				
				if(i == 0) {
					setFirst(n);
				}
				else {
					mul(n);
				}
			}
			break;
		case 4:
			System.out.println("How many numbers do you want to divide?");
			num = input.nextInt();
			for(int i = 0; i < num; i++) {
				System.out.println("Enter num " + (i+1) + ": ");
				n = inputNum.nextInt();
				
				if(i == 0) {
					setFirst(n);
				}
				else {
					div(n);
				}
			}
			break;
		}
	}
}

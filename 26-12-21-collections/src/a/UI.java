package a;

import java.util.Scanner;

public class UI {
	
	
	private Calculator calculator = new Calculator();
	private Scanner sc = new Scanner(System.in);
	
	public void start() {
	while(true) {
		showMenu();
		String command = sc.nextLine();
		switch (command) {
		case "+":
			doAdd();
			break;
		case "-":
			doSub();
			break;
		}
	}
	
private void doSub() {
	System.out.println("enter value to subtract: ");
	double val = Double.parseDouble(sc.nextLine())
	calculator.add(val);
	System.out.println("subtracted: " + val);
	}

	private void doAdd() {
		System.out.println("enter value to add: ");
		double val = Double.parseDouble(sc.nextLine())
		calculator.add(val);
		System.out.println("subtracted: " + val);		
	}

	public void showMenu() {
		System.out.println();
	}

	}

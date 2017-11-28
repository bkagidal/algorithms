package com.lab.paranthesis;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Expression :");
		String str = scan.nextLine();

		if (isValid(str)) {
			System.out.println("Valid Expression");
		} else
			System.out.println("Invalid Expresiion");

		scan.close();
	}

	public static boolean isValid(String expr) {

		StackA stack = new StackA();

		for (int i = 0; i < expr.length(); i++) {

			if (expr.charAt(i) == '(' || expr.charAt(i) == '{' || expr.charAt(i) == '[') {
				stack.push(expr.charAt(i));
			} else if (expr.charAt(i) == ')' || expr.charAt(i) == '}' || expr.charAt(i) == ']') {

				if (stack.isEmpty()) {
					System.out.println("Right Paranthesis are more than left");
					return false;
				}

				int ch = stack.pop();

				if (!matchParanthesis(ch, expr.charAt(i))) {
					System.out.println("Mismatched Expression");
					System.out.println(ch + " and " + expr.charAt(i));
					return false;
				}

			}
		}

		if (stack.isEmpty()) {
			System.out.println("Balanced Expression");
			return true;
		} else {
			System.out.println("Left Paranthesis are more than left paranthesis");
			return false;
		}

		// return true;
	}

	private static boolean matchParanthesis(int left, int right) {
		if (left == '(' && right == ')')
			return true;

		if (left == '[' && right == ']')
			return true;

		if (left == '{' && right == '}')
			return true;

		return false;
	}
	
	private String convertToPostfix(String infix){
		
		StringBuilder postFix = new StringBuilder();
		
		StackA st = new StackA();
		
		for(int i =0;i<infix.length();i++){
			
			if(infix.charAt(i) == '(' || infix.charAt(i) =='{' || infix.charAt(i) == '['  )
				st.push(infix.charAt(i));
			else if(infix.charAt(i) == ')' || infix.charAt(i) =='}' || infix.charAt(i) == '}'){
				do{
					int ch = st.pop();
					postFix.append(ch);
				}while(infix.charAt(i) == '(' || infix.charAt(i) =='{' || infix.charAt(i) == '[' );
			}
			else if(Character.isDigit(infix.charAt(i))){
				postFix.append(infix.charAt(i));
			}else{
				
			}
				
			
		}
		
		return "";
		
	}

}

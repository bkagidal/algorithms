package com.lab.postfix;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Expresion :");

		String str = scan.nextLine();

		String postFix = convertToPostFix(str);
		System.out.println("Post Fix :" + postFix);
		int value = postFixValue(postFix);
		
		System.out.println("Value :"+value);
		
		scan.close();

	}

	public static String convertToPostFix(String infix) {

		StringBuilder sb = new StringBuilder();

		StackChar st = new StackChar();
		char ch, next;
		for (int i = 0; i < infix.length(); i++) {

			ch = infix.charAt(i);

			switch (ch) {

			case '(':
				st.push(ch);
				break;

			case ')':

				while ((next = st.pop()) != '(')
					sb.append(next);
				break;

			case '+':
			case '-':
			case '*':
			case '/':
			case '%':
			case '^':
				while (!st.isEmpty() && (precedence(st.peek()) > precedence(ch)))
					sb.append(st.pop());

				st.push(ch);
				break;
			default:
				sb.append(ch);

			}
		}

		while (!st.isEmpty()) {
			sb.append(st.pop());
		}

		return sb.toString();
	}

	@SuppressWarnings("unused")
	private static int precedence(char ch) {

		switch (ch) {

		case '(':
		case ')':
			return 0;
		case '+':
		case '-':
			return 1;
		case '*':
		case '/':
		case '%':
			return 2;
		case '^':
			return 3;
		default:
			return 0;

		}

	}
	
	
	private static int postFixValue(String postfix){
		
		char ch;
		StackInt st1 = new StackInt();
		
		int val1 ;
		int val2;
		for(int i=0;i<postfix.length();i++){
			
			ch = postfix.charAt(i);
			
			if(Character.isDigit(ch))
				st1.push(Character.getNumericValue(ch));
			else{
				switch(ch){
				
					case '+':
						 val1 = st1.pop();
						 val2 = st1.pop();
						 st1.push(val2+val1);
						break;
					case '-':
						 val1 = st1.pop();
						 val2 = st1.pop();
						 st1.push(val2-val1);
						 break;
					case '*':
						 val1 = st1.pop();
						 val2 = st1.pop();
						 st1.push(val2*val1);
						 break;
					case '/':
						 val1 = st1.pop();
						 val2 = st1.pop();
						 st1.push(val2/val1);
						 break;
					case '^':
						 val1 = st1.pop();
						 val2 = st1.pop();
						 st1.push(val2^val1);
						 break;
						
				}
			}
			
		}
		return st1.pop();
	}

}

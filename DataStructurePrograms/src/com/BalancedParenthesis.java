package com;

public class BalancedParenthesis {

	public static void main(String[]args){

		StackArray<String> list = new StackArray<>();
		String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)(";	//given string
		
		//search for every parenthesis
		for (int i = 0; i < str.length(); i++) {
			char item = str.charAt(i);
			if (item == '('){
				//System.out.println("in");
				list.push(item);
			} else if (item == ')'){
				//System.out.println("out");
				list.pop();
			}
		}
		
		if(list.isEmpty()){
			System.out.println("Balanced Parenthesis");
		} else {
			System.out.println("Unbalanced Parenthesis");
		}
	}

}

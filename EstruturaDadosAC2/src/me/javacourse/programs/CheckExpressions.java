package me.javacourse.programs;

import java.util.Scanner;

import me.javacourse.stack.ArrayStack;

public class CheckExpressions {
	
	static boolean check(String str) {
        ArrayStack<Character> stack = new ArrayStack<Character>();
        char l;
        for (int i = 0; i < str.length(); i++) {
            l = str.charAt(i);
            if (l == '(' || l == '[' || l == '{') {

                stack.push(l);

            } else if (l == ')' || l == ']' || l == '}') {

                switch (l) {
                case ')':
                    if (stack.top() == '(')
                        stack.pop();
                    else
                        return false;
                    break;

                case ']':
                    if (stack.top() == '[')
                        stack.pop();
                    else
                        return false;
                    break;

                case '}':
                    if (stack.top() == '{')
                        stack.pop();
                    else
                        return false;
                    break;
                }

            } else {
                continue;
            }

        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.printf("String: ");
        String str = in.nextLine();

        System.out.println((check(str) ? "Correto" : "Incorreto"));

        in.close();

    }
	
}

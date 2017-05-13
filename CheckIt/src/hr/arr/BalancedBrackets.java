package hr.arr;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

	public static boolean isBalanced(String expr) {
		if (expr == null || expr.trim().length() == 0 || expr.length() % 2 != 0)
			return false;
		char[] ca = expr.toCharArray();

		Map<Character, Character> cm = new HashMap<>();
		cm.put('}', '{');
		cm.put(')', '(');
		cm.put(']', '[');

		Stack<Character> s = new Stack<>();
		for (int i = 0; i < ca.length; i++) {
			if (i == 0 && cm.keySet().contains(ca[i]))
				return false;

			if (cm.values().contains(ca[i])) {
				s.push(ca[i]);
			} else if (cm.keySet().contains(ca[i])) {
				if (s.isEmpty())
					return false;

				char lc = s.pop();
				if (cm.get(ca[i]) != lc) {
					return false;
				}
			} else
				return false;
		}
		return s.size() == 0 ? true : false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		String[] exprs = new String[t];
		for (int a0 = 0; a0 < t; a0++) {
			exprs[a0] = in.next();
		}
		for (int i = 0; i < t; i++) {
			System.out.println((isBalanced(exprs[i])) ? "YES" : "NO");
		}
	}
}

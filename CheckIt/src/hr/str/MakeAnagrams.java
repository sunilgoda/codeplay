package hr.str;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class MakeAnagrams {

	public static void main(String[] args) {
		String a = "abcdec"; //abcde
		String b = "cefgf";  // bcegf
		int diff = numberNeeded3(a,b);
		System.out.println(diff);
	}

	private static int numberNeeded3(String a, String b) {
		char[] ar = a.toCharArray();
		char[] br = b.toCharArray();
		
		int[] ai = new int[122];
		for (char c : ar) {
			ai[Character.getNumericValue(c)]++;
		}
		
		for (char c : br) {
			ai[Character.getNumericValue(c)]--;
		}
		int diff = 0;
		for (int i : ai) {
			diff = diff + Math.abs(i);
		}		
		
		return diff;
	}

	private static int numberNeeded2(String a, String b) {
		int diff = 0;
		char[] ar = a.toCharArray();
		char[] br = b.toCharArray();

		Set<Character> s1 = new HashSet<>();
		Set<Character> s2 = new HashSet<>();

		for (char c : ar) {
			s1.add(c);
		}
		for (char c : br) {
			s2.add(c);
		}
		int d1 = s1.size();
		int d2 = s2.size();

		s1.retainAll(s2);
		s2.removeAll(s1);

		d1 = d1 - s1.size();
		d2 = s2.size();

		return d1 + d2;
	}

	private static int numberNeeded1(String a, String b) {
		char[] ac = a.toCharArray();
		char[] bc = b.toCharArray();
		
		StringBuffer as = new StringBuffer("[");
		for (char c : ac) {
			as.append("[").append(c).append("]");
		}
		as.append("]");
		StringBuffer bs = new StringBuffer("[");
		for (char c : bc) {
			bs.append("[").append(c).append("]");
		}
		bs.append("]");
		
		System.out.println(as);
		System.out.println(bs);
		
		String an = b.replaceAll(as.toString(), "");
		String bn = a.replaceAll(bs.toString(),"");
		
		System.out.println("final a:" + an);
		System.out.println("final b:" + bn);
		
		long acount = an.chars().distinct().count();
		long bcount = bn.chars().distinct().count();
		
		String mp = "[[a][c][b][c]]";
		System.out.println("my trial ---" +a.replaceAll(mp, ""));
		return (int) (acount + bcount);
	}

	private static int numberNeeded(String a, String b) {
		IntStream as  = a.chars().distinct().sorted();
		IntStream bs  = b.chars().distinct().sorted();
		
		int i = as.min().getAsInt();
		int j = bs.min().getAsInt();		
		int minDiff = i > j ? i - j : j - i;
		
		IntStream as1  = a.chars().distinct().sorted();
		IntStream bs1  = b.chars().distinct().sorted();
		int i1 = as1.max().getAsInt();
		int j1 = bs1.max().getAsInt();
		int maxDiff = i1 > j1 ? i1 - j1 : j1 - i1;
		int diff = minDiff + maxDiff;
		return diff;
	}

}

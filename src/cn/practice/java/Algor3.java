package cn.practice.java;

import java.util.HashSet;
import java.util.Set;

public class Algor3 {

	public static void main(String[] args) {
		String s = "pwwkew";
		int max=0;
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (isSingal(i, j, s)) {
                       max = Math.max(max, j-i);
				}
			}
		}
		System.out.println(max);
	}

	public static boolean isSingal(int start, int end, String s) {
		Set<Character> set = new HashSet<Character>();	
		for (int i = start; i < end; i++) {
			Character ch = s.charAt(i);
			if (set.contains(ch)) {
				return false;
			}
			set.add(ch);
		}
		return true;
	}
}

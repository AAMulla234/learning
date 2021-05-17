package com.akhtar.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * This is example of code for checking almostEquelentString if string 1 and string 2 each charater has more than 3 occurences
 * @author qureshia
 *
 */

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> s = new ArrayList<String>();
		s.add("aabbc");
		s.add("abcffebbaac");
		
		List<String> t = new ArrayList<String>();
		t.add("abbbc");
		t.add("abeffeffffc");
		
		List<String>result = areAlmostEquielentString(s, t);
		
		result.stream().forEach(System.out::println);
		
	}

	static List<String> areAlmostEquielentString(List<String> s, List<String> t) {
		List<String> result = new ArrayList<String>();
		for(int i=0; i< s.size(); i++){
			result.add(isAlmostEquielentString(s.get(i), t.get(i)));
		}
		return result;
	}

	static String isAlmostEquielentString(String s, String t) {
		if (isEqualLength(s, t)) {
			Set<Character> uniques = new HashSet<Character>();

			for (char c : s.toCharArray()) {
				if (!uniques.contains(c)) {
					uniques.add(c);
					int firstS = getTotalCountChar(c, s);
					int firstT = getTotalCountChar(c, t);
					if (isDifferenceMoreThan3(firstS, firstT))
						return "NO";

				}
			}
			return "YES";
		}
		return "NO";
	}

	static boolean isEqualLength(String s, String t) {
		Optional<String> validS = Optional.ofNullable(s);
		Optional<String> validT = Optional.ofNullable(t);
		
		if(validS.isPresent() && validT.isPresent()){
			return s.length() == t.length();
		}
		return false;
	}

	static int getTotalCountChar(char charater, String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			if (c == charater) {
				count++;
			}
		}
		return count;
	}

	static boolean isDifferenceMoreThan3(int s, int t) {
		int result = 0;
		if (s >= t)
			result = s - t;
		else
			result = t - s;

		if (result > 3)
			return true;

		return false;
	}

}

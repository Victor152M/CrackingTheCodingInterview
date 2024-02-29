package cracking.thecoding.interview.chapter1.arrays.and.strings;
import java.util.Arrays;

// 1.2
public class CheckPermutation {
	String sort(String str) {
		char[] content = str.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}
	
	boolean permutation(String s1, String s2) {
		return sort(s1).equals(sort(s2));
	}
}

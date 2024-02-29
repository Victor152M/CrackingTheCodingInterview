package cracking.thecoding.interview.chapter1.arrays.and.strings;

//1.5
// This is your way, the CTCI way is somewhat different and more efficient
public class OneAway {
	boolean checkIfOneAway(String s1, String s2) {
		if (s1.equals(s2))
			return true; 
		else if (s1.length() == s2.length() && 
				checkOneReplacedCharacter(s1, s2)) {
			return true;
		}
		else if(checkOneInsertedCharacter(s1, s2)) {
			return true;
		}
		return false;
	}
	
	boolean checkOneReplacedCharacter(String s1, String s2) {
		boolean oneDifferentChar = false;
		char[] charString1 = s1.toCharArray();
		char[] charString2 = s2.toCharArray();
		for (int i = 0; i <s1.length(); i++){
			if (charString1[i] != charString2[i] && oneDifferentChar) {
				return false;
			}
			else if (charString1[i] != charString2[i]) {
				oneDifferentChar = true;
			}
		}
		return true;
	}
	
	boolean checkOneInsertedCharacter(String s1, String s2) {
		boolean onlyOneChar = true;
		if (s1.length() > s2.length()) {
			for(char c2 : s2.toCharArray()) {
				if (!checkIfCharInString(c2, s1)) {
					return false;
				}
			}
		}
		else {
			for(char c1 : s1.toCharArray()) {
				if (!checkIfCharInString(c1, s2)) {
					return false;
				}
			}
		}
		return true;
	}
	
	boolean checkIfCharInString(Character c, String str) {
		for (Character strChar : str.toCharArray()) {
			if (strChar == c) {
				return true;
			}
		}
		return false;
	}
	
}
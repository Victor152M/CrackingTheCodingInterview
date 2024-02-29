package cracking.thecoding.interview.chapter1.arrays.and.strings;

public class PalindromePermutationCTCI {
	boolean isPermutationOfPalindrome(String phrase) {
		int[] table = buildCharFrequencyTable(phrase);
		return checkMaxOneOdd(table);
	}
	
	//Check that no more than 1 char has an odd count
	boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for (int count : table) {
			if (count % 2 == 1) {
				if (foundOdd) {
					return false;
				}
				else {
					foundOdd = true;
				}
			}
		}
		return true;
	}
	
	//Map each char to a number: a -> 0, b -> 1, etc.
	//This is case insensitive. Non-letter characters map to -1
	int getCharNumber(Character c) {
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}
	
	//Count how many times each char appears
	int[] buildCharFrequencyTable(String phrase) {
		int[] table = new int[Character.getNumericValue('z') - 
		                      Character.getNumericValue('a') + 1];
		for (char c : phrase.toCharArray()) {
			int x = getCharNumber(c);
			if (x != -1) {
				table[x]++;
			}
		}
		return table;
	}
	
}

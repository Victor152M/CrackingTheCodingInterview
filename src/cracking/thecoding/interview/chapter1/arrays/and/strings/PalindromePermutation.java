package cracking.thecoding.interview.chapter1.arrays.and.strings;

// 1.4
// My way of doing it 
// Remember that you do not have to create all permutations
public class PalindromePermutation {
	boolean isPermutation(String str) {
		str = str.toLowerCase();
		str = str.replaceAll("\\s", "");
		char[] strCharArray = str.toCharArray();
		boolean letterWithoutPair = true;
		if(strCharArray.length % 2 == 0) {
			letterWithoutPair = false;
		}
		for(int i=0; i<strCharArray.length; i++) {
			int total = 0;
			for(int j=0; j<strCharArray.length; j++) {
				if(strCharArray[i] == strCharArray[j]) {
					total++;
				}
			}
			if(total%2 != 0 && !letterWithoutPair) {
				return false;
			}
			else if (total%2 != 0) {
				letterWithoutPair = true;
			}
		}
		return true;
	}
}

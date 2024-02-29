package cracking.thecoding.interview.chapter1.arrays.and.strings;

//1.6
public class StringCompression {
	//Best (most efficient) way (from the ones you know)
	String compress(String str) {
		StringBuilder compressed = new StringBuilder();
		int countConsecutive = 0;
		for(int i = 0; i < str.length(); i++){
			countConsecutive++;
			
			// If next char is different than current, 
			// append this char to result.
			if (i+1 > str.length() || str.charAt(i) != str.charAt(i+1)) {
				compressed.append(str.charAt(i));
				compressed.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressed.length() < str.length() ? 
				compressed.toString() : str;
	}
	
	//Works but is not efficient (as many strings have to be created)
	//Not using (the holy) StringBuilder
	String compressBad(String str) {
		String compressedString = "";
		int countConsecutive = 0;
		for (int i = 0; i < str.length(); i++) {
			countConsecutive++;
			
			/* If next char is different than the current, append
			this char to the result. */
			if (i+1 >= str.length() || str.charAt(i) != str.charAt(i+1)) {
				compressedString += "" + str.charAt(i) + countConsecutive;
				countConsecutive = 0;
			}
		}
		return compressedString.length() < str.length() ? compressedString : str;
	}
	
	//strignCompressor is my implementation, almost works in all cases
	String stringCompressor(String str) {
		char[] charStr = str.toCharArray();
		int count = 1;
		String result = "";
		for (int i = 0; i <str.length()-1; i++) {
			if (charStr[i] == charStr[i+1] && i+1 != str.length()-1) {
				count++;
			}
			else if (i+1 == str.length()-1 && charStr[i] == charStr[i+1]){
				count++;
				result = result + charStr[i] + count;
			}
			else {
				result = result + charStr[i] + count;
				count = 1;
			}
		}
		if (str.length() <= result.length()) {
			return str;
		}
		return result;
	}
}

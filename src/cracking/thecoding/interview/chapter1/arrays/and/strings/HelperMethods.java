package cracking.thecoding.interview.chapter1.arrays.and.strings;

public class HelperMethods {
	//String builder
	String joinWords(String[] words){
		StringBuilder sentence = new StringBuilder();
		for (String w : words) {
			sentence = sentence.append(w);
		}
		return sentence.toString();
	}
}

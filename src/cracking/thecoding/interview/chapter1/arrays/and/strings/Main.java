package cracking.thecoding.interview.chapter1.arrays.and.strings;

public class Main {
	public static void main(String[] args) {
		// 1.2
		CheckPermutation checkPermutation = new CheckPermutation();
		if (checkPermutation.permutation("permutation", "permutatio"))
			System.out.println("True");
		
		// 1.3
		URLify urlify = new URLify();
		//System.out.println(urlify.urlify("my new birthday      "));
		
		//1.4
		PalindromePermutation palindromePermutation = new PalindromePermutation();
		if (palindromePermutation.isPermutation("Tact Co")){
			System.out.println("True"); // try tact coa
		}
		PalindromePermutationCTCI palindromePermutationCTCI = new PalindromePermutationCTCI();
		if (palindromePermutationCTCI.isPermutationOfPalindrome("Tact Co")){
			System.out.println("True"); // try tact coa
		}
		
		//1.5
		OneAway oneAway = new OneAway();
		if (oneAway.checkIfOneAway("pale", "bake")) {
			System.out.println("True");
		}
		
		//1.6
		StringCompression stringCompression = new StringCompression();
		//System.out.println(stringCompression.stringCompressor(""));
		//Try "aabccccaaa" (for example)
		
		//1.7
		RotateMatrix rotator = new RotateMatrix();
		int[][] matrix = new int[3][3]; 
		matrix[0][0] = 1; matrix[0][1] = 2; matrix[0][2] = 3;
		matrix[1][0] = 4; matrix[1][1] = 5; matrix[1][2] = 6;
		matrix[2][0] = 7; matrix[2][1] = 8; matrix[2][2] = 9;
		rotator.rotate(matrix);
		
	}
	
}

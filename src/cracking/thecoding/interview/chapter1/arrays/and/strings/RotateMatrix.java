package cracking.thecoding.interview.chapter1.arrays.and.strings;
//TODO
//1.7
//By the way, Java arrays (int[] name) are mutable
//As a result, rotation can be done in place
public class RotateMatrix {
	boolean rotate(int[][] matrix){
		if (matrix.length == 0 || matrix.length != matrix[0].length) {
			return false;
		}
		int n = matrix.length;
		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for(int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i]; //save top
				
				//left -> top
				matrix[first][i] = matrix[last-offset][first];
				
				//bottom -> left
				//TODO
			}
		}
		return true;
	}
}

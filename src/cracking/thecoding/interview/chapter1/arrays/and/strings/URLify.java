package cracking.thecoding.interview.chapter1.arrays.and.strings;
// 1.3
// This is my implementation, not the one in the book.
// TODO There will (possibly) be some spaces left at the end
// of the returned string.
public class URLify {
	// IMPORTANT HINT:
	// in Java -> use a char Array to perform the operation in place
	void arrayShifter(char[] content,int index){
		char storage;
		for (int i = content.length - 1; i>index; i--) {
			content[i] = content[i-1];
		}
	}
	
	String urlify(String str) {
		char[] content = str.toCharArray();
		for (int i = 0; i<content.length - 2; i++) {
			if (content[i] == ' ') {
				content[i] = '%';
				arrayShifter(content, i);
				content[i+1] = '2';
				arrayShifter(content, i+1);
				content[i+2] = '0';
			}
		}
		return new String(content);
	}
}

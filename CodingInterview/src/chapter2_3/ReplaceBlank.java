package chapter2_3;

public class ReplaceBlank {

	public String Replace(String str){
		
//		if (str!=null) {
//			str = str.replaceAll(" ", "%20");
//		}
		
		if (str == null) {
			return null;
		}
		@SuppressWarnings("null")
		
		char[] chars = str.toCharArray();
		
		int i = 0;
		int length = chars.length;
		int numberOfBlank = 0;
		
		while (i < length) {			
			if (chars[i] == ' ') {
				numberOfBlank++;
			}
			i++;
		}
		
		int IndexOfNew = length + numberOfBlank*2-1;
		int IndexOfOriginal = length-1;
		
		char[] newChars = new char[IndexOfNew+1];
		
		while (IndexOfNew >= 0 && IndexOfOriginal >= 0) {
			if (chars[IndexOfOriginal] == ' ') {
				newChars[IndexOfNew--] = '0';
				newChars[IndexOfNew--] = '2';
				newChars[IndexOfNew--] = '%';
			}else {
				newChars[IndexOfNew--] = chars[IndexOfOriginal];
			}
			IndexOfOriginal--;
		}
		String temp = "";
		for (int j = 0; j < newChars.length; j++) {
			temp += newChars[j];
		}
		return temp;		
	}
	
}

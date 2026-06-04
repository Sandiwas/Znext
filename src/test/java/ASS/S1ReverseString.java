package ASS;

public class S1ReverseString {

	public static void main(String[] args) {
		String str = "Sandip Wasekar";
		str = reverString(str);
		System.out.println(str);
	}

	public static String reverString(String str) {
		String result = "";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			result = result + reverseWord + " ";

		}
		return result;
	}

}

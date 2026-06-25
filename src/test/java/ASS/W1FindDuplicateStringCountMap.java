package ASS;

import java.util.LinkedHashMap;
import java.util.Map;

public class W1FindDuplicateStringCountMap {
	public static void main(String[] args) {
		String str = "Java Selenium Java API Selenium Testing";
		str = makeLowerCase(str);
		findDuplicateWordCount(str);
	}

	public static void findDuplicateWordCount(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i]) + count);
			}
		}
		for (String key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key + " = " + map.get(key));
			}
		}
	}

	public static String makeLowerCase(String str) {
		String result = "";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String word = arr[i];
			String lowerCase = "";
			for (int j = 0; j < word.length(); j++) {
				char ch = word.charAt(j);
				if (ch >= 'A' && ch <= 'Z') {
					ch = (char) (ch + 32);
				}
				lowerCase = lowerCase + ch;
			}
			result = result + lowerCase + " ";
		}
		return result;
	}

}

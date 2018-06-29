package codingBatPractice;

public class FrontBack {
	public static void main(String[] args) {
		System.out.println(frontBack("candy"));
	}
	public static String frontBack(String str) {
		if (str.length()<=1) return str;
		String mid = str.substring(1, str.length()-1);
		return mid;
	}
}

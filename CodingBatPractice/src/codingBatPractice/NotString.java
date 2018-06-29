package codingBatPractice;

/* Warmup-1 > notString 
prev  |  next  |  chance
Given a string, return a new string where "not " has been added to the front.
However, if the string already begins with "not",
return the string unchanged. Note: use .equals() to compare 2 strings.

notString("candy") → "not candy"
notString("x") → "not x"
notString("not bad") → "not bad"
 */

public class NotString {

	public static void main(String[] args) {
		System.out.println(notString("candy"));
	}
	public static String notString(String str) {
		if(str.equals(str)) {
			return "not "+str;
		} else {
			return str;
		}
	}
}
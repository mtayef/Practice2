package codingBatPractice;

/* Warmup-1 > diff21 
prev  |  next  |  chance
Given an int n, return the absolute difference between n and 21, 
except return double the absolute difference if n is over 21.

diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
  */

public class Diff21 {
	public static void main(String[] args) {
		System.out.println(diff21(25));
	}
	public static int diff21(int n) {
		if (n<=21) 
			return Math.abs(21-n);
		return 2*(Math.abs(n-21));
	}

}
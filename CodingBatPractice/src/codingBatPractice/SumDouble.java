package codingBatPractice;

/* Warmup-1 > sumDouble 
prev  |  next  |  chance
Given two int values, return their sum. 
Unless the two values are the same, then return double their sum.

sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
 */ 

public class SumDouble {
	public static void main(String[] args) {
		System.out.println(sumDouble(2, 2));
	}
	public static int sumDouble(int a, int b) {
		int sum = a+b;
		if(a==b)
			return 2*(sum) ;
		return sum;
	}
}
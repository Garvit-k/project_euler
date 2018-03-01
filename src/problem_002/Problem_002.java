package problem_002;

import java.math.BigInteger;

public class Problem_002 {

	public static void main(String[] args) {
		BigInteger sum = BigInteger.ZERO;
		BigInteger first = BigInteger.ONE;
		BigInteger second = BigInteger.valueOf(2);
		BigInteger third = BigInteger.ONE;
		for(BigInteger i = BigInteger.ONE; i.compareTo(BigInteger.valueOf(4000001)) <= -1; i = i.add(BigInteger.ONE)) {
			third = first.add(second);
			//System.out.println("Works");
			if(third.mod(BigInteger.valueOf(2)).equals(BigInteger.ZERO)) {
				sum =  sum.add(third);
			//System.out.println("Works");
			}
			first = second;
			second = third;
		}
		System.out.println(sum.toString()); //1110529252
	}
}
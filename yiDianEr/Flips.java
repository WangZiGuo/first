package yiDianEr;

import library.StdOut;
import library.StdRandom;

public class Flips {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T=Integer.parseInt(args[0]);
		Counter A=new Counter("zheng");
		Counter B=new Counter("fan");
		for (int i = 0; i < T; i++) {
			if (StdRandom.bernoulli(0.5)) {
				A.increment();
			}
			else 
			B.increment();
		}
		
		StdOut.println(A);
		StdOut.println(B);
		StdOut.print("delta is: "+Math.abs(A.tally()-B.tally()));
	}

}

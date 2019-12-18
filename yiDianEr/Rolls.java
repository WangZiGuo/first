package yiDianEr;

import library.StdOut;
import library.StdRandom;

public class Rolls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T=Integer.parseInt(args[0]);
		int SIDES=6;
		Counter[]rollsCounters=new Counter[SIDES+1];
		
		for (int i = 1; i < rollsCounters.length; i++) {
			rollsCounters[i]=new Counter(i+"'s");
		}
		
	for (int i = 0; i < T; i++) {
		int result =StdRandom.uniform(1,SIDES+1);
		rollsCounters[result].increment();
	}
	
	for (int i = 1; i < rollsCounters.length; i++) {
		StdOut.println(rollsCounters[i]);
	}
	}

}

package yidiansi;

import library.StdOut;
import library.StdRandom;

public class DoublingRatio {

	public static double timeTrial(int N) {
		int MAX=1000000;
		int[]a=new int[N];
		for (int i = 0; i < a.length; i++) {
			a[i]=StdRandom.uniform(-MAX,MAX);
		}
		Stopwatch timer=new Stopwatch();
		
		
		int cnt=ThreeSum.count(a);
		
		
		return timer.elapsedTime();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double prev=timeTrial(125);
		int N=125;
		for (int i=0;i<10 ; i++) {
			N=N*2;
			double time=timeTrial(N);
			StdOut.printf("%6d %7.1f",N,time);
			StdOut.printf("%5.1f\n", time/prev);
			prev=time;
			String
		}
		}

}

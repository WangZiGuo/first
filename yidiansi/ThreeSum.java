package yidiansi;

import library.In;
import library.StdOut;
import library.StdRandom;

public class ThreeSum {
	public static int count(int[]a) {
		int sum=0;
		int count=0;
		for (int i = 0; i < a.length-2; i++) {
			for (int j = i+1; j < a.length; j++) {
				for (int j2 =j+1 ; j2 < a.length; j2++) {
					if (a[i]+a[j]+a[j2]==0) {
						count++;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N=Integer.parseInt(args[0]);
		int[]a=new int[N];
		for (int i = 0; i < N; i++) {
			a[i]=StdRandom.uniform(-100000,100000);
		}
		Stopwatch timer=new Stopwatch();
		int cnt=ThreeSum.count(a);
		double time=timer.elapsedTime();
		StdOut.println(cnt+" triples"+time+" seconds");
		
		}

}

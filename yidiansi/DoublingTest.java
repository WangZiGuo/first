package yidiansi;

import library.StdDraw;
import library.StdOut;
import library.StdRandom;

public class DoublingTest {
	
	public static double timeTrial(int N) {
		int MAX=1000000;
		int[]a=new int[N];
		for (int i = 0; i < N; i++) {
			a[i]=StdRandom.uniform(-MAX,MAX);
		}
			Stopwatch timer=new Stopwatch();
			int cnt=ThreeSum.count(a);
			return timer.elapsedTime();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StdDraw.setCanvasSize(800,800);
		StdDraw.setXscale(0,1000);
		StdDraw.setYscale(0,1000*1000*1000);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.setPenRadius(0.005);
		
		for (int i = 0; i < 1000; i++) {
			StdDraw.point(i, i*i);
			StdDraw.point(i, i*i*i);
		}
		StdDraw.show();
	}

}

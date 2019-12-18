package yidiansan;

import library.StdIn;
import library.StdOut;

public class Stats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag<Double>myBag=new Bag<Double>();
		while (!StdIn.isEmpty()) {
			myBag.add(StdIn.readDouble());
		}
		int N=myBag.size();
		
		double sum=0.0;
		for (Double double1 : myBag) {
			sum+=double1;
		}
		double mean=sum/N;
		sum=0;
		for (Double double1 : myBag) {
			sum+=(double1-mean)*(double1-mean);
		}
		double std=Math.sqrt(sum/(N-1));
		StdOut.printf("Mean:%.2f\n",mean);
		StdOut.printf("Std dev:%.2f\n",std);
	}

}

package yiDianEr;


import library.StdDraw;
import library.StdOut;
import library.StdRandom;

public class VisualAccumulator {
	private double total;
	private int N;
	
	public VisualAccumulator(int trials,double max) {
		// TODO Auto-generated constructor stub
		StdDraw.setXscale(0,trials);
		StdDraw.setYscale(0,max);
		StdDraw.setPenRadius(.005);
	}
	
	public void addDataValue(double val) {
		N++;
		total+=val;
		StdDraw.setPenColor(StdDraw.DARK_GRAY);
		StdDraw.point(N, val);
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.point(N, total/N);
	}
	
	public double mean() {
		if (N==0) {
			return 0;
		}
		else {
			return total/N;
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mean("+N+" values):"+String.format("%7.5f", mean());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int T=Integer.parseInt(args[0]);
		VisualAccumulator a=new VisualAccumulator(T, 1);
		for (int i = 0; i < T; i++) {
			a.addDataValue(StdRandom.random());
		}
		StdOut.print(a);
	}

}

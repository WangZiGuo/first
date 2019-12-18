package yiDianEr;

import library.StdOut;

public class Accumulator {
	private double total;
	private int N;
	String id;
	public Accumulator() {
		// TODO Auto-generated constructor stub
		
	}
	
	public void addDataValue(double val) {
		System.out.println(total);
		N++;
		total+=val;
	}
	
	public double mean() {
		if (N==0) {
			return 0;
		}
		else {
			return total/N;
		}
	}
	public double getTotal() {
		return total;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Mean("+N+" values):"+String.format("%7.5f", mean());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		String ssString;
		//ssString=ssString+"aa";
		Accumulator ssAccumulator;
		Accumulator a=new Accumulator();
		a.addDataValue(34);
		a.addDataValue(100);
		a.addDataValue(66);
		StdOut.println(a);
		
	}

}

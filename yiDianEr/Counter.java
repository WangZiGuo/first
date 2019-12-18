package yiDianEr;

import library.StdOut;

public class Counter {
	private int count=0;
	String id;
	
	public Counter(String id) {
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	
	public Counter(String id,int count) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.count=count;
	}
	
	
	void increment() {
		count++;
	}
	
	public int tally() {
		return count;
	}
	
	public String getId() {
		return id;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+", "+count;
	}
	
	public static void main(String[] args) {
		StdOut.print("ss");
	}

}

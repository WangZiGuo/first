package yidiansan;

import library.StdIn;
import library.StdOut;

public class FixedCapacityStackofStrings {
	private String[]a;
	int size=0;
	
	public FixedCapacityStackofStrings(int capacity) {
		// TODO Auto-generated constructor stub
		a=new String[capacity];
	}
	
	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size==0;
	}
	
	public void push(String ss) {
		a[size++]=ss;
	}
	
	public String pop() {
		return a[--size];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FixedCapacityStackofStrings s=new FixedCapacityStackofStrings(100);
		for (int i = 0; i < 10; i++) {
			s.push(i+" ");
		}
	while (!s.isEmpty()) {
		StdOut.print(s.pop()+" ");
	}
	}

}

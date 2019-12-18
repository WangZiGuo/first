package yiDianEr;

import library.In;
import library.StdIn;
import library.StdOut;

public class Whitelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]w=In.readInts("https://algs4.cs.princeton.edu/11model/largeW.txt");
		In.readInts(args[0]);
		StaticSETofInts set=new StaticSETofInts(w);
		while (!StdIn.isEmpty()) {
			int key=StdIn.readInt();
			if (!set.contains(key)) {
				StdOut.println(key);
			}
		}
	}

}

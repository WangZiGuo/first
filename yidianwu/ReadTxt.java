package yidianwu;

import library.In;
import library.StdIn;
import library.StdOut;

public class ReadTxt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a=In.readInts("https://algs4.cs.princeton.edu/15uf/largeUF.txt");
		for (int i = 0; i < a.length; i++) {
			StdOut.print(a[i]+" ");
		}
	}

}

package yiDianEr;

import java.util.Arrays;

public class StaticSETofInts {
	private int[]a;
	
	public StaticSETofInts(int[]keys) {
		// TODO Auto-generated constructor stub
		a=new int[keys.length];
		for (int i = 0; i < keys.length; i++) {
			a[i]=keys[i];
		}
		Arrays.sort(a);
	}
	
	public boolean contains(int key) {
		return rank(key)!=-1;
	}
	
	private int rank(int key) {
		int lo=0;
		int high=a.length-1;
		while (lo>=high) {
			int mid=lo+(high-lo)/2;
			if(key<a[mid]) {
				high=mid-1;
			}else if (key>a[mid]) {
				lo=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

}

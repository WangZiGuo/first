package yidiansi;

import library.StdOut;

public class BinarySearch {
	public static int rank(int key,int []values) {
		int low=0;
		int high=values.length-1;
		int mid=(low+high)/2;
		while(low<=high) {
			if (key<values[mid]) {
				high=mid-1;
				mid=(low+high)/2;
			}else if(key>values[mid]){
				low=mid+1;
				mid=(low+high)/2;
			}else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {1,2,3,4,5};
		int b=3;
		StdOut.println(rank(5, a));
	}

}

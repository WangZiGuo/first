package yidiansi;

import java.util.Arrays;


import library.In;
import library.StdIn;
import library.StdOut;

public class TwoSumFast {
	public  static int count1(int[]a) {
		Arrays.sort(a);
		int count=0;
		for (int i = a.length-1; i >=0; i--) {
			if (BinarySearch.rank(-a[i], a)<i) {
				//StdOut.println(BinarySearch.rank(-a[i], a));
				count++;
			}
		}
		return count;
	}
	
	public  static int count2(int[]a) {
		int count=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i]+a[j]==0) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int count3(int[]a) {
		int counter1=0;
		Arrays.sort(a);
		int[]b=new int[a.length];
		for (int i = 0; i < b.length; i++) {
			b[i]=-a[i];
		}
		
		StdOut.println(Arrays.toString(b));
		
		for (int i = 0; i < b.length; i++) {
			if (BinarySearch.rank(a[i],b)<i&&BinarySearch.rank(a[i], b)!=-1) {
				StdOut.println(BinarySearch.rank(a[i],b));
				counter1++;
			}
		}
		return counter1;
	}
	
	public static int count4(int[]a) {
		int counter=0;
		int i=0;
		int j=a.length-1;
		int xingdongbiao=1;
		
		while(i<j) {
			int zuo=a[i];
			int you=a[j];
			
			if (zuo+you==0) {
				counter++;
				if (xingdongbiao>0) {
					int k1=j;
					int k2=j;
					if (a[--k1]==a[k2]) {
						j--;
						continue;
					}else {
						i++;
						xingdongbiao=xingdongbiao*(-1);
						continue;
					}	
				}
				
				if (xingdongbiao<0) {
					int k1=i;
					int k2=i;
					if (a[++k1]>a[k2]) {
						i++;
						xingdongbiao=xingdongbiao*(-1);
						
						continue;
					}else {
						xingdongbiao=xingdongbiao*(1);
						continue;
					}	
					
				}
			}
			
			
			if (xingdongbiao>0) {
				j--;
			}else {
				i++;
			}
		}
		
		return counter;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]a= {-7,-5,-3,-2,-1,1,1,1,1,2,3,3,3,7,7,7};
		StdOut.println(count1(a));
		StdOut.println(count2(a));
		StdOut.println(count4(a));
	}

}

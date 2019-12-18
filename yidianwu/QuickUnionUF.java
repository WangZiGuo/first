package yidianwu;

import library.StdIn;
import library.StdOut;

public class QuickUnionUF {
	private int[]id;
	int count;
	
	public QuickUnionUF(int N) {
		// TODO Auto-generated constructor stub
		id=new int[N];
		count=N;
	}
	
	public int count() {
		return count;
	}
	
	public boolean connected(int p,int q) {
		return find(p)==find(q);
	}
	
	public int find(int p) {
		if(p!=id[p])
			p=id[p];
		return p;
	}
	
	
	public void union(int p,int q) {
		int proot=find(p);
		int qroot=find(q);
		if (proot==qroot) {
			return;
		}
		id[proot]=qroot;
		count--;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n = StdIn.readInt();
	        QuickFindUf uf = new QuickFindUf(n);
	        while (!StdIn.isEmpty()) {
	            int p = StdIn.readInt();
	            int q = StdIn.readInt();
	            if (uf.find(p) == uf.find(q)) continue;
	            uf.union(p, q);
	          //  StdOut.println(p + " " + q);
	        }
	        StdOut.println(uf.count() + " components");
	}

}

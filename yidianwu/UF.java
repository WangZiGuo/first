package yidianwu;

import library.StdIn;
import library.StdOut;
import yidiansi.Stopwatch;

public class UF {
	private int[]id;
	private int count;

	public UF(int N) {
		count=N;
		id=new int[N];
		for (int i = 0; i < id.length; i++) {
			id[i]=i;
		}
	}
	
	public int count() {
		return count;
	}
	
	public int find(int p) {
		return id[p];
	}
	
	
	public void union(int p,int q) {
		int pID=find(p);
		int qID=find(q);
		if (pID==qID) {
			return;
		}
		for (int i = 0; i < id.length; i++) {
			if (id[i]==pID) {
				id[i]=qID;
			}
		}
		count--;
	}
	
	public boolean connected(int p,int q) {
		return find(p)==find(q);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stopwatch stopwatch=new Stopwatch();
		int N=StdIn.readInt();
		UF uf=new UF(N);
		while(!StdIn.isEmpty()) {
			int p=StdIn.readInt();
			int q=StdIn.readInt();
			if (uf.connected(p, q)) {
				continue;
			}
			uf.union(p, q);
			//StdOut.println(p+" "+q);
		}
		StdOut.println(uf.count()+" components");
		StdOut.println(stopwatch.elapsedTime());
	}

}

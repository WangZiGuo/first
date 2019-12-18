package yidiansi;

public class Stopwatch {
	private final long start;
	public Stopwatch() {
		// TODO Auto-generated constructor stub
		start=System.currentTimeMillis();
	}
	
	public double elapsedTime() {
		long now=System.currentTimeMillis();
		return (now-start)/1000;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stopwatch stopwatch=new Stopwatch();
	}

}

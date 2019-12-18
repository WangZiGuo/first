package yidiansan;

import java.util.Iterator;

public class ResizingArrayStack<T>implements Iterable<T> {
	private T[]a=(T[])new Object[1];
	private int size=0;
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void push(T data) {
		if (size==a.length) {
			resize(2*size+1);
		}
		a[size++]=data;
	}
	
	private void resize(int max) {
		T[]temp=(T[])new Object[max];
		for (int i = 0; i < a.length; i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
	
	public T pop() {
		T result=a[--size];
		a[size]=null;
		if (size>0&&size==a.length/4) {
			resize(a.length/2);
		}
		return result;
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new StackIterator();
	}
	
	private class StackIterator implements Iterator<T>{
		private int N=size;
		@Override
		public T next() {
			// TODO Auto-generated method stub
			return a[--N];
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return N>0;
		}
		
		@Override
		public void remove() {
			// TODO Auto-generated method stub
			Iterator.super.remove();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

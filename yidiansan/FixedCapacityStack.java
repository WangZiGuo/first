package yidiansan;

import java.util.Iterator;

import library.StdOut;

public class FixedCapacityStack<T> implements Iterable<T>{
	private T[]data;
	private int size;
	public boolean isEmpty() {
		return size==0;
	}
	
	public int size() {
		return size;
	}
	
	public FixedCapacityStack(int capacity) {
		// TODO Auto-generated constructor stub
		data=(T[])new Object[capacity];
	}
	
	public T pop() {
		return data[--size];
	}
	
	public void push(T datad) {
		data[size++]=datad;
	}
	
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ReverseArrayIterator();
	}
	
	private class ReverseArrayIterator implements Iterator<T>{
		private int i=size;
		@Override
		public T next() {
			// TODO Auto-generated method stub
			return data[--i];
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return i>0;
		}
		
		@Override
		public void remove() {
			// TODO Auto-generated method stub
			Iterator.super.remove();
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FixedCapacityStack s=new FixedCapacityStack(100);
		for (int i = 0; i < 100; i++) {
			s.push(i+" ");
		}
		
		for (Object object : s) {
			System.out.print(object+" ");
		}

		System.out.println();
		Iterator< Integer>iterator=s.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}
	
}

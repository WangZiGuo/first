package yidiansan;

import java.util.Iterator;

import library.StdOut;

public class Queue<T>implements Iterable<T>{
	private class Node{
		T data;
		Node nexNode;
	}
	private int size;
	private Node firstNode;
	private Node lastNode;
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void enQueue(T datad) {
		Node oldlast=lastNode;
		lastNode=new Node();
		lastNode.data=datad;
		lastNode.nexNode=null;
		if (isEmpty()) {
			firstNode=lastNode;
		}
		else {
			oldlast.nexNode=lastNode;
		}
		size++;
	}
	
	public T deQueue() {
		T daT=firstNode.data;
		firstNode=firstNode.nexNode;
		if (isEmpty()) {
			lastNode=null;
		}
		size--;
		return daT;
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new QueueIterator();
	}
	
	private class QueueIterator implements Iterator<T>{
		Node bianli=firstNode;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return bianli!=null;
		}
		
		@Override
		public T next() {
			// TODO Auto-generated method stub
			T daT=bianli.data;
			bianli=bianli.nexNode;
			return daT;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>myQueue=new Queue<Integer>();
		for (int i = 0; i < 10; i++) {
			myQueue.enQueue(i);
		}
		for (Integer integer : myQueue) {
			System.out.print(" "+integer);
		}
	}

}

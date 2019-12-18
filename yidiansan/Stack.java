package yidiansan;


import java.util.Iterator;
import java.util.TreeSet;

import library.In;
import library.StdIn;
import library.StdOut;

public class Stack<T> implements Iterable<T>{
	private class Node{
		T item;
		Node next;
	}
	private Node firstNode;
	private int N;
	
	public boolean isEmpty() {
		return N==0;
	}
	
	public int size() {
		return N;
	}
	
	public void push(T dada) {
		Node oldfirstNode=firstNode;
		firstNode=new Node();
		firstNode.item=dada;
		firstNode.next=oldfirstNode;
		N++;
		
	}
	
	public T pop() {
		T data=firstNode.item;
		firstNode=firstNode.next;
		N--;
		return data;
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private class StackIterator implements Iterator<T>{
		Node bianli=firstNode;
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return bianli!=null;
		}
		
		@Override
		public T next() {
			// TODO Auto-generated method stub
			T daT=bianli.item;
			bianli=bianli.next;
			return daT;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer>myTreeSet=new TreeSet<Integer>();
		myTreeSet.add(6);
		myTreeSet.add(4);
		myTreeSet.add(10);
		myTreeSet.add(1);
		Iterator<Integer>iterator=myTreeSet.iterator();
		for (Integer integer : myTreeSet) {
			StdOut.print(integer+" ");
		}
	}

}

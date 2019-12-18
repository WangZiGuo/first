package yidiansan;

import java.util.Iterator;
import java.util.Stack;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>myStack=new Stack<Integer>();
		for (int i = 0; i < 10; i++) {
			myStack.push(i);
		}
		Iterator<Integer>myIterator=myStack.iterator();
		while (myIterator.hasNext()) {
			Integer integer = (Integer) myIterator.next();
			System.out.println(integer);
		}
		
	}

}

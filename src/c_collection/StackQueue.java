package c_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueue {

	public static void main(String[] args) {
		
		//1.스택
		
		Stack s = new Stack();
		
		s.push("A"); //넣을때 푸쉬 뺼떄 팝
		s.push("B");
		s.push("C");
		
		System.out.println(s.pop());
		
		//맨 마지막에 넣은녀석이 나옴
		
		//2.큐
		
		Queue q = new LinkedList(); // Q는 인터페이스임  - 인터페이스는 100로 추상임 
		//절대 객체생성안됌
		//근데 Q를 상속받는 자식들은 있겠지??? 보면 여러개가있다 
		//가장 많이쓰는건  LinkedList 이렇게 자식을 쓰는건 가능하지
		
		q.offer("A");
		q.offer("B");
		q.offer("C");
		
		System.out.println(q.poll());
		
		//선착순으로 먼저넣는 녀석이 나옴

	}

}

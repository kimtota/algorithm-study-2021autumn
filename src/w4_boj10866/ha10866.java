package w4_boj10866;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

// �� ����غ���

public class ha10866 {

	public static Deque<Integer> deque = new ArrayDeque<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st; 
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<N; i++) {
	        
			st = new StringTokenizer(br.readLine(), " ");
		
			switch (st.nextToken()) {
			
			case "push_front":
				deque.addFirst(Integer.parseInt(st.nextToken()));
				break;
				
			case "push_back":
				deque.addLast(Integer.parseInt(st.nextToken()));
				break;
				
			case "pop_front":
				sb.append(pop_front()+"\n");
				break;
				
			case "pop_back":
				sb.append(pop_back()+"\n");
				break;
				
			case "size":
				sb.append(deque.size()+"\n");
				break;
				
			case "empty":
				sb.append(empty()+"\n");
				break;
			
			case "front":
				sb.append(front()+"\n");
				break;
				
			case "back":
				sb.append(back()+"\n");
				break;
			}
 
		}

		System.out.print(sb);
	}
	
	public static int pop_front() {
		if (deque.isEmpty()) {
			return -1;
		}
		return deque.pollFirst();
	}
	
	public static int pop_back() {
		if (deque.isEmpty()) {
			return -1;
		}
		return deque.pollLast();
	}
	
	public static int empty() {
		if (deque.isEmpty()) {
			return 1;
		}
		return 0;
	}
	
	public static int front() {
		if (deque.isEmpty()) {
			return -1;
		}
		return deque.getFirst();
	}
	
	public static int back() {
		if (deque.isEmpty()) {
			return -1;
		}
		return deque.getLast();
	}
	
}

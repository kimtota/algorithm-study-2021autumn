package w4_boj10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList; //import
import java.util.Queue; //import
import java.util.StringTokenizer;

public class ha10845 {

	public static Queue<Integer> queue = new LinkedList<>(); // int�� queue ����, linkedlist �̿�
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st; 
		StringBuilder sb = new StringBuilder();
		
		int lastItem = 0;
		
		for(int i = 0; i < N; i++) {
	        
			st = new StringTokenizer(br.readLine(), " ");
		
			switch (st.nextToken()) {
			
			case "push":
				lastItem = Integer.parseInt(st.nextToken());
				queue.offer(lastItem);
				break;
				
			case "pop":
				sb.append(pop()+"\n");
				break;
				
			case "size":
				sb.append(queue.size()+"\n");
				break;
				
			case "empty":
				sb.append(empty()+"\n");
				break;
				
			case "front":
				sb.append(front()+"\n");
				break;
				
			case "back":
				sb.append(back(lastItem)+"\n");
				break;
			}
 
		}
		
		System.out.print(sb);
	}
	
	public static int pop() {
		if (queue.isEmpty()) {
			return -1;
		}
		return queue.poll();
	}
	
	public static int empty() {
		if (queue.isEmpty()) {
			return 1;
		}
		return 0;
	}
	
	public static int front() {
		if (queue.isEmpty()) {
			return -1;
		}
		return queue.peek();
	}
	
	public static int back(int lastItem) {
		if (queue.isEmpty()) {
			return -1;
		}
		return lastItem;
	}
	
}

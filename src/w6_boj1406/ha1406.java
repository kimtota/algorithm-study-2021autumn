package w6_boj1406;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class ha1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//이 문자열은 길이가 N이고, 영어 소문자로만 이루어져 있으며, 길이는 100,000을 넘지 않는다
		String str = br.readLine();
		
		//입력할 명령어의 개수를 나타내는 정수 M(1 ≤ M ≤ 500,000)
		int M = Integer.parseInt(br.readLine());
		
		Stack<String> leftSt = new Stack<String>();
		Stack<String> rightSt = new Stack<String>();
		
		//처음 커서는 문장의 맨 뒤에서 시작하기 때문에 왼쪽 스택에 초기 문자를 모두 넣어줌 (ex. abc|)
		String[] arr = str.split("");
		for(String s : arr) 
			leftSt.push(s); 
		
		for(int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String c = st.nextToken();
				
			switch(c) {
				case "L":
					if(!leftSt.isEmpty())
						rightSt.push(leftSt.pop());
					break;
				case "D":
					if(!rightSt.isEmpty())
						leftSt.push(rightSt.pop());
					break;
				case "B":
					if(!leftSt.isEmpty()) {
						leftSt.pop();
					}
					break;
				case "P":
					leftSt.push(st.nextToken());
					break;
				default:
					break;
				}
			}		
				

		//Stack은 LIFO 구조이기 때문에
		//왼쪽 스택에 있는 데이터들을 모두 오른쪽으로 옮긴 뒤에 오른쪽에 있는 모든 내용을 출력한다.
		while(!leftSt.isEmpty())
			rightSt.push(leftSt.pop());
				
		while(!rightSt.isEmpty())
				bw.write(rightSt.pop());
				
		bw.flush();
		bw.close(); 
	}
}
		
		
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		//M개의 줄에 걸쳐 입력할 명령어가 순서대로 주어진다
//		for(int i=0; i<M; i++) {
//			String command = st.nextToken();
//			
//			switch(command) {
//			
//				case "L":
//					break;
//				
//					
//				case "D":
//					break;
//				
//					
//				case "B":
//					break;
//				
//					
//				case "P":
//					str += st.nextToken();
//					break;
//				
//			}
//			String s = st.nextToken();
			
			
		

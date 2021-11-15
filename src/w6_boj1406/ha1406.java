package w6_boj1406;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class ha1406 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		//이 문자열은 길이가 N이고, 영어 소문자로만 이루어져 있으며, 길이는 100,000을 넘지 않는다
		String str = br.readLine();
		
		//입력할 명령어의 개수를 나타내는 정수 M(1 ≤ M ≤ 500,000)
		int M = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//M개의 줄에 걸쳐 입력할 명령어가 순서대로 주어진다
		for(int i=0; i<M; i++) {
			String command = st.nextToken();
			
			switch(command) {
			
				case "L":
					break;
				
					
				case "D":
					break;
				
					
				case "B":
					break;
				
					
				case "P":
					str += st.nextToken();
					break;
				
			}
			String s = st.nextToken();
			
			
		}
		

	}

}

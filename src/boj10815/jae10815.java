package boj10815;

import java.io.*;

public class jae100815 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 1. boolean[20_000_001]을 선언한다.
		boolean[] arr = new boolean[20_000_001];	
		
		// 2. 상근이가 가지고있는 카드의 입력을 받아서, arr[카드의 값] = true로 만들어준다.
		int n = stoi(br.readLine());
		String[] input = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			int val = stoi(input[i]) + 10_000_000;
			arr[val] = true;
		}
		
		// 3. 구분해야 할 카드의 입력을 받아서, arr[카드의 값] == true이면 1을, 아니면 0을 출력한다.
		int m = stoi(br.readLine());
		input = br.readLine().split(" ");		
		for(int i = 0; i < m; i++) {
			int val = stoi(input[i]) + 10_000_000;
			if(arr[val]) sb.append(1);
			else sb.append(0);
			sb.append(' ');
		}
		System.out.println(sb);
	}
	public static int stoi(String str) {
		return Integer.parseInt(str);
	}
}

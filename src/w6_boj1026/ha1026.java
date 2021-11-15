package w6_boj1026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ha1026 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		int N  = Integer.parseInt(br.readLine()); // N<50
		
		//A와 B의 각 원소는 100보다 작거나 같은 음이 아닌 정수이다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int[] A = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(A);
		
		st = new StringTokenizer(br.readLine(), " ");
		int[] B = new int[N];
		for(int i=0; i<N; i++) {
			B[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(B);
		
		int result = 0;
		for(int i=0; i<N; i++) {
			result += A[i]*B[N-1-i];
		}
		
		System.out.print(result);

	}

}

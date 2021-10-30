package BOJ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class numSorting_2750 { //Main

	public static int[] array; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 총 숫자개수 입력 (array에 몇개 넣을 것인지)
		array = new int[N];
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열정렬하기
		Arrays.sort(array);
		for(int i=0; i<N; i++)
			System.out.println(array[i]);
		
	}

}

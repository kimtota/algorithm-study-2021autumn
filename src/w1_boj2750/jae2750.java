package w1_boj2750;

import java.util.Scanner;
import java.util.Arrays;

public class jae2750 {
	public static void main(String[] args) {
    
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int[] arr = new int[N];
		
		for(int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
 
		// 정렬 메소드
		Arrays.sort(arr);
		
		for(int val : arr) {
			System.out.println(val);
		}
 
	}
}

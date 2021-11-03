package boj10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ha10815 {

	public static int[] arr; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i = 0; i < N; i++){
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			if(binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append(' ');
			}
			else {
				sb.append(0).append(' ');
			}
		}
		System.out.println(sb);
	}
	
	public static int binarySearch(int key) {
		 
		int left = 0;					
		int right = arr.length - 1; 	
 
		while(left <= right) {
 
			int mid = (left + right) / 2;
 
			if(key < arr[mid]) {
				right = mid - 1;
			}
			else if(key > arr[mid]) {
				left = mid + 1;
			}
			else {
				return mid;
			}
		}

		return -1;
	}      	
}


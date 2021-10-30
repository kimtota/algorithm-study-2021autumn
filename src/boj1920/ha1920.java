package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class numFind_1920 {  // Main

	public static int[] array; 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		BufferedReader br  = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); // 총 숫자개수 입력 (array에 몇개 넣을 것인지)
		array = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 띄어쓰기 기준으로 숫자구분
		for(int i = 0; i < N; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		
		// 배열정렬하기
		Arrays.sort(array);
		
		// 내가 찾아야 될 횟수 입력받기, 버퍼쓸때 공식같이 외우기
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		
		// StringBuilder의 append() : 문자열더하기, 빈번하게 긴 문자열들을 더할때 주로 사용
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < M; i++) {
			// 찾고자 하는 값이 있을 경우 1, 없을 경우 0을 출력해야한다.
			if(binarySearch(Integer.parseInt(st.nextToken())) >= 0) {
				sb.append(1).append('\n');
			}
			else {
				sb.append(0).append('\n');
			}
		}
		System.out.println(sb);
		
	}
	
	
	/**
	 * @param key 찾으려는 값
	 * @return key와 일치하는 배열의 인덱스
	 */
	
	public static int binarySearch(int key) {
 
		int left = 0;					// 탐색 범위의 왼쪽 끝 인덱스
		int right = array.length - 1;	// 탐색 범위의 오른쪽 끝 인덱스
 
		// left가 right보다 커지기 전까지 반복한다.
		while(left <= right) {
 
			int mid = (left + right) / 2;	// 중간위치를 구한다.
 
			// key값이 중간 위치의 값보다 작을 경우
			if(key < array[mid]) {
				right = mid - 1;
			}
			// key값이 중간 위치의 값보다 클 경우
			else if(key > array[mid]) {
				left = mid + 1;
			}
			// key값과 중간 위치의 값이 같을 경우
			else {
				return mid;
			}
		}
 
		// 찾고자 하는 값이 존재하지 않을 경우
		return -1;

	}

}

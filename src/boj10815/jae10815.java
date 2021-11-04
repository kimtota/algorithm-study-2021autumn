package boj10815;

import java.io.*;

public class jae10815 {
<<<<<<< HEAD
	
=======
>>>>>>> 8c78ac580be81b67038cd2af278b2f8fe83a1850
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		// 1. boolean[20_000_001]�쓣 �꽑�뼵�븳�떎.
		boolean[] arr = new boolean[20_000_001];	
		
		// 2. �긽洹쇱씠媛� 媛�吏�怨좎엳�뒗 移대뱶�쓽 �엯�젰�쓣 諛쏆븘�꽌, arr[移대뱶�쓽 媛�] = true濡� 留뚮뱾�뼱以��떎.
		int n = stoi(br.readLine());
		String[] input = br.readLine().split(" ");
		for(int i = 0; i < n; i++) {
			int val = stoi(input[i]) + 10_000_000;
			arr[val] = true;
		}
		
		// 3. 援щ텇�빐�빞 �븷 移대뱶�쓽 �엯�젰�쓣 諛쏆븘�꽌, arr[移대뱶�쓽 媛�] == true�씠硫� 1�쓣, �븘�땲硫� 0�쓣 異쒕젰�븳�떎.
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

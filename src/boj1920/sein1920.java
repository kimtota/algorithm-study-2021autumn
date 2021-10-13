package boj1920;

import java.util.Scanner;
import java.util.Arrays;

public class sein1920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for(int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for(int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);

        for(int i = 0; i < M; i++) {
            int k = binarySearch(arr1, arr2[i]);
            if(k > -1) {
                System.out.println(1);
            }
            else
                System.out.println(0);
        }
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] > key)
                right = mid - 1;
            else if (arr[mid] < key)
                left = mid + 1;
            else {
                return mid;
            }
        }
        return -1;
    }
}

// 자꾸 시간초과가 떠서 이분탐색(이진)을 사용해야 한다.

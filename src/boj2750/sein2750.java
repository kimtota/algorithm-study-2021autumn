package boj2750;

import java.util.Scanner;
import java.util.Arrays;

public class sein2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i : arr) {
            System.out.println(i);
        }
    }
}

// Arrays.sort + Scanner 방식 (중간 성능)

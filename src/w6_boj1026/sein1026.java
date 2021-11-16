package w6_boj1026;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.Arrays;

public class sein1026 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        int[] B = new int[N];
        int S = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(B);

        Integer arr[] = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = A[i];
        }
        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            S += (arr[i] * B[i]);
        }

        System.out.println(S);
    }
}

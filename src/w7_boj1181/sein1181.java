package w7_boj1181;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Comparator;

public class sein1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] word = new String[N];

        for(int i = 0; i < N; i++) {
            word[i] = br.readLine();
        }

        // Solution : Sorting by string length & alphabet
        Arrays.sort(word, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for(int i = 0; i < N; i++) {
            if(i > 0 && word[i - 1].equals(word[i])) {
                continue;
            }
            System.out.println(word[i]);
        }
    }
}

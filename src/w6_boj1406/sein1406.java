package w6_boj1406;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class sein1406 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str = br.readLine();
        int M = Integer.parseInt(br.readLine());
        String pChar = "";
        int cursorSize = 600001;
        int[] cursor = new int[cursorSize];

        int nowStrLength = str.length();

        cursor[nowStrLength] = 1; // 문자열의 맨끝에 커서가 있음
        int cursorNowIdx = nowStrLength;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            String cmdStr = st.nextToken();
            if(st.hasMoreTokens())
                pChar = st.nextToken();

            int j = 0;
            while(cursor[j] != 1) {
                j++;
            }
            cursorNowIdx = j;
            nowStrLength = str.length();
            int lastIdx = nowStrLength;

            switch (cmdStr) {
                case "L":
                    if(cursorNowIdx != 0) {
                        cursor[cursorNowIdx] = 0;
                        cursor[cursorNowIdx - 1] = 1;
                    }
                    break;
                case "D":
                    if (cursorNowIdx != nowStrLength) {
                        cursor[cursorNowIdx] = 0;
                        cursor[cursorNowIdx + 1] = 1;
                    }
                    break;
                case "B":
                    if(cursorNowIdx != 0) {
                        String leftStr = str.substring(0, cursorNowIdx - 1);
                        String rightStr = str.substring(cursorNowIdx + 1, lastIdx);
                        str = leftStr.concat(rightStr);
                        cursor[cursorNowIdx] = 0;
                        cursor[cursorNowIdx - 1] = 1;
                    }
                    break;
                case "P":
                    if (cursorNowIdx == nowStrLength) {
                        str = str.concat(pChar);
                    }
                    else {
                        String leftStr = str.substring(0, cursorNowIdx);
                        String rightStr = str.substring(cursorNowIdx, lastIdx);
                        str = leftStr.concat(pChar);
                        str = str.concat(rightStr);
                    }
                    cursor[cursorNowIdx] = 0;
                    cursor[cursorNowIdx + 1] = 1;
                    break;
            }

        }
        System.out.print(str);
    }
}

// 이 코드는 시간초과가 무지막지하게 났다!

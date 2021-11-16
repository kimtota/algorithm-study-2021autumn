package w6_boj1406;

import java.io.*;
import java.util.Stack;
 
public class jae1406 {
 
    public static void main(String[] args) throws IOException {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // reader 생성
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // writer 생성
        
        Stack<Character> lStack = new Stack<Character>();
        Stack<Character> rStack = new Stack<Character>();
        // 스택 생성
        
        String input = br.readLine();
        
        for (int i = 0; i < input.length(); i++) {
            lStack.push(input.charAt(i));
        }
        // 왼쪽 스택에 리스트에 글자 담음
 
        String nStr = br.readLine();
        int n = Integer.parseInt(nStr);
        // 첫 라인을 읽고
 
        // 첫 라인에서 입력받은 라인만큼 반복
        for (int i = 0; i < n; i++) {
 
            String command = br.readLine();
            // 명령어 입력 받음
 
            // 왼쪽이동
            if (command.startsWith("L")) {
                // 커서가 맨 왼쪽이 아니면
                if(!lStack.empty()) {
                    rStack.push(lStack.pop());
                }
            // 오른쪽 이동
            } else if (command.startsWith("D")) {
                // 커서가 맨 오른쪽이 아니면
                if(!rStack.empty()) {
                    lStack.push(rStack.pop());
                }
            // 커서 왼쪽 문자 삭제
            } else if (command.startsWith("B")) {
                
                // 커서가 맨 왼쪽이 아니면
                if(!lStack.empty()) {
                    lStack.pop();
                }
                
            // 커서 왼쪽 문자 추가
            } else if (command.startsWith("P")) {
                
                String[] pCommand = command.split(" ");
                
                lStack.push(pCommand[1].toCharArray()[0]);
 
            }
 
        }
 
        // lStack이 빌때까지 오른쪽 스택으로 옮기고
        while(!lStack.empty()) {
            rStack.push(lStack.pop());
        }
 
        // rStack이 빌때까지
        while(!rStack.empty()) {
            //출력
            bw.write(rStack.pop());
        }
 
        br.close();
        bw.flush();
        bw.close();
        // reader와 writer를 닫는다
    }
 
}
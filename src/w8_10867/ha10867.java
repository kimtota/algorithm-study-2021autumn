package w8_10867;

import java.io.*;
import java.util.*;

public class ha10867 {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int [] plusNum=new int[1001];
		int [] minusNum=new int[1001];
		String [] strArr=br.readLine().split(" ");
		StringBuffer strBuffer=new StringBuffer();
		for(int i=0;i<n;i++) {
			int num= Integer.parseInt(strArr[i]);
			if(num>=0) {
				plusNum[num]=1;
			}else {
				minusNum[num*(-1)]=1;
			}
		}
		
		for(int i=1000;i>=0;i--) {
			if(minusNum[i]>0) strBuffer.append(-i+" ");
		}
		for(int i=0;i<1001;i++) {
			if(plusNum[i]>0) strBuffer.append(i+" ");
		}
		
		System.out.println(strBuffer);
		
	}
}
package Guvi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestSubString_Pro63 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		String s=in.next();
		int cot=0;
		int k=0;
		String arr[]=new String[s.length()];
		char c[]=s.toCharArray();
		inner :for(int i=0;i<c.length;i++){
			for(int j=i+1;j<c.length;j++){
				if(c[i]==c[j]){
					arr[k]=s.substring(i,j);
							cot++;
							k++;
							continue inner;
				}
			}
			cot=0;
		}
		int max=-1;
		int idx=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=null)
			if(max<arr[i].length()){
				max=arr[i].length();
				idx=i;
			}
		}
		if(arr[idx]==null)
			System.out.println(s.length());
		else
			System.out.println(arr[idx].length());
	}
	
}

package Guvi;

import java.util.Scanner;

public class EncodePro_61 {
	static void Encode(String input1,String input2){
		String str1="";
		String str2="";
		int x=10;
		char c1[]=input1.toCharArray();
		for(int i=0;i<input1.length();i++){	
			if((char)(c1[i]+10)>122){
				 x=(int)(123-c1[i]);
				 x=10-x;
				c1[i]='a';
			}
			str1+=(char)(c1[i]+x);
			x=10;
		}
		char c2[]=input2.toCharArray();
		for(int i=1;i<input2.length()-1;i++){
			if((char)(c2[i]+10)>122){
				 x=(int)(123-c2[i]);
				 x=10-x;
				c2[i]='a';
			}
			str2+=(char)(c2[i]+x);
			x=10;
		}
		String st=input2.substring(0,1)+str2+input2.substring(input2.length()-1,input2.length());
		System.out.println(str1+" "+st);
	}
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String input1,input2;
	input1=in.next();
	input2=in.next();
	Encode(input1,input2);
}
}

package Guvi;

import java.util.Scanner;
import java.util.Arrays;
public class Least {
	static void ToFindLeast(int k,int input) throws Exception{
		String temp =String.valueOf(input);
		String last="";
		int[] input1 = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++)
		{
		    input1[i] = temp.charAt(i)-'0';
		}
		Arrays.sort(input1);
		for(int i=0;i<temp.length();i++){
			last+=input1[i];
		}
		String result=last.substring(0,last.length()-k);
		System.out.println(result);
		
	}
public static void main(String[] args) {
	int k,input;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter k value TO Delete From Input");
	k=in.nextInt();
	System.out.println("Enter input");
	input=in.nextInt();
	try{
	ToFindLeast(k,input);
	}catch(Exception e){
		System.err.print("Enter number more then length k value\n"+e);
	}
}
}

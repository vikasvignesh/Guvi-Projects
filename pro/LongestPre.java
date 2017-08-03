package Guvi;

import java.util.Arrays;
import java.util.Scanner;

public class LongestPre {
	static void ToFindLogest(String str[]){
		String s="";
		int x=0,m=0;
		boolean b=false;
		int c[]=new int[str.length];
		if(str.length>=2){
		for(int k=0;k<str.length-1;k++){
		m=(str[k].length()>str[k+1].length())?str[k+1].length():str[k].length();
			for(int i=0;i<m;i++){
				if(str[k].substring(0,i).equals(str[k+1].substring(0,i))){
				x=i;}
				else{
					b=true;break;}
			}
			c[k]=x;
			}
		}else{
			b=true;
		}
		Arrays.sort(c);
		if(c[0]!=0){
		if(b){
			System.out.println("No Common Prefix Available");
		}else{
			System.out.println(str[0].substring(0,c[0]+1));
		}}else{
			System.out.println("No Common Prefix Available");
		}

	}
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter number of string");
	int n=in.nextInt();
	String str[]=new String[n];
	System.out.println("Enter the String");
	for(int i=0;i<str.length;i++){
		str[i]=in.next();
	}
	System.out.println("Common Prefix:");
	ToFindLogest(str);
}
}

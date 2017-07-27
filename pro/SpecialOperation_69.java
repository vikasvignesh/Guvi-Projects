package Guvi;

import java.util.Arrays;
import java.util.Scanner;

public class SpecialOperation_69 {
	static int MakeSingleValue(int x,int arr[]){
		int n=0;
		for(int i=0;i<arr.length;i++){
			n+=arr[i]*x;
		}
		int m=n;
		int sum=0;
		while(n>10){
			m=n;
			sum=0;
			while(m!=0){
				int temp=m%10;
				sum+=temp;
				m/=10;
			}
			n=sum;
		}
		return sum;
	}
public static void main(String[] args) {
	String str;
	Scanner in=new Scanner(System.in);
	str=in.next();
	str=str.replaceAll("[^0-9]", "");
	int arr[]=new int[str.length()];
	for(int i=0;i<str.length();i++){
	arr[i]=Integer.parseInt(str.valueOf(str.charAt(i)));
	}
	Arrays.sort(arr);
	int x=MakeSingleValue(arr[0],arr);
	int y=MakeSingleValue(arr[arr.length-1],arr);
	int large=(x>y)?y:x;
	int result=(int) Math.pow(large, 2);
	System.out.println(result);
}
}

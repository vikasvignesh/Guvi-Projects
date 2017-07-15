package Guvi;

import java.util.Scanner;

public class AvgPro21{
	static void FindToAvg(int arr[]){
		int flag=0;
		for(int i=0;i<arr.length-2;i++){
			for(int j=0;j<arr.length-1;j++){
				int x=(arr[i]+arr[i+1]+arr[i+2])%3;
				int y=(arr[j]+arr[j+1])%2;
				if(x==y){
					flag=1;
					break;
				}
			}
		}
		if(flag==1)
			System.out.println("Possible");
			else
			System.out.println("not possible");
		
	}
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Enter Number of elements in array");
	int len=in.nextInt();
	int arr[]=new int[len];
	System.out.println("Enter the array");
	for(int i=0;i<len;i++){
		arr[i]=in.nextInt();
	}
	FindToAvg(arr);
}}

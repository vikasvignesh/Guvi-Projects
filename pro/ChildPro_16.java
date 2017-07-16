package Guvi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ChildPro_16 {
	static void Tofind(int arr[]){
		int c=0,temp=0;
		Set<Integer> mySet = new HashSet<Integer>();
		for(int i:arr){
			mySet.add(i);
		}
		int remaining=arr.length-mySet.size();
		for(int i=mySet.size();i>0;i--){
			c+=i;
		}
		System.out.println(c+remaining);
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter No of childrean");
		n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Rating's for each child");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("Minimum candies are:");
		Tofind(arr);
	}

}

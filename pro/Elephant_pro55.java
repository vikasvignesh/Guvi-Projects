package Guvi;

import java.util.Arrays;
import java.util.Scanner;

public class Elephant_pro55 {
	static void findNumberOfElephant(int arr[],int w){
		int count=0;
		int i=0;
		int tot=arr[0];
		while(tot<w){
			count++;
			i++;
			if(i>=arr.length)
				break;
			tot+=arr[i];
			
		}
		if(count!=0)
			System.out.println(count);
		else
			System.out.println("Size of web is too small");
		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m,w;
		System.out.println("Enter Number of Elephant");
		m=in.nextInt();
		System.out.println("Enter Total Weigth of web");
		w=in.nextInt();
		System.out.println("Enter Weight of Elephant");
		int arr[]=new int[m];
		for(int i=0;i<m;i++){
			arr[i]=in.nextInt();
		}
		Arrays.sort(arr);
		findNumberOfElephant(arr,w);
		
	}

}

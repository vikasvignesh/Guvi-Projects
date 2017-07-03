package Guvi;

import java.util.Scanner;
public class AppearOnce {
	static void once(int[] nums){
		int c=0;
		for(int i=0;i<nums.length;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i]==nums[j]){
					nums[j]=0;
					c++;
				}
			}if(c>=1){
				nums[i]=0;
			}
			c=0;
		}
		for(int i=0;i<nums.length;i++){
			if(nums[i]!=0)
			System.out.println(nums[i]);}
	
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n;
		System.out.println("Enter array size");
		n=in.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter element");
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		System.out.println("The Element apper once: ");
		once(arr);
		
	}

}

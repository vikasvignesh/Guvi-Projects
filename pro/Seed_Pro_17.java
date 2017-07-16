package Guvi;

import java.util.Scanner;

public class SeedPro_17 {
	static void ToFindSeed(int nums,int seed){
		int result=1,temp=0;
		int seed1=nums;
		while(nums!=0){
			temp=nums%10;
			result=result*temp;
			nums/=10;
			
		}
		result=result*seed1;
		if(result==seed)
			System.out.println("It's Seed");
		else
			System.out.println("No is not Seed");
		
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int nums,seed;
		System.out.println("Enter the value");
		nums=in.nextInt();
		System.out.println("seed value");
		seed=in.nextInt();
		ToFindSeed(nums,seed);
	}

}

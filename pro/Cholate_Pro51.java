package Guvi;

import java.util.Scanner;

public class Cholate_Pro51 {
	public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int n=in.nextInt();
	int m=in.nextInt();
	if(m*n==0)
		System.out.println("No Cholates");
	else
		System.out.println((m*n)-1);
	}

}

package Guvi;
import java.util.*;
public class LongestPalindrome_Pro62 {
	static void findLongestPalindrome(String str){
		String []starr=new String[str.length()];
		int k=0;
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(ch[i]==ch[j]){
					String st1=str.substring(i,j+1);
					StringBuffer sb=new StringBuffer(st1);
					String st2=new String(sb.reverse());
					if(st1.equals(st2)){
						starr[k]=st1;k++;}
				}
			}
		}int max=-1;
		int idx=0;
		for(int i=0;i<starr.length;i++){
			if(starr[i]!=null){
			if(max<starr[i].length()){
				max=starr[i].length();
				idx=i;
			}}
		}
		if(starr[idx]!=null)
		System.out.println(starr[idx]);
		else
			System.out.println("No Palindrome");
	}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=in.next();
		System.out.println("Longest Palindrome is:");
		findLongestPalindrome(str);
	}

}

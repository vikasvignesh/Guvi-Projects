package Guvi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram_Pro53 {
	static void findPanagram(String s){
		char ch[]=s.toCharArray();
		Set<Character> st=new HashSet<Character>();
		for(int i=0;i<ch.length;i++){
			st.add(ch[i]);
		}
		if(st.size()==26)
			System.out.println("Panagram");
		else
			System.out.println("Given String Not panagram");
	}
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Entrer the String");
	String s=in.next();
	findPanagram(s.toLowerCase());
	
}
}

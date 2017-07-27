package Guvi;

import java.util.Scanner;

public class GeneratePasword {
	static void PasswordGenerator(String name,String lastname,int pin,int n){
		int nameLength=name.length();
		int lastLength=lastname.length();
		String str="";
		if(nameLength==lastLength)
		{
		String st=(name.compareTo(lastname)>0)?lastname:name;
		if(st==lastname){
		str+=name.substring(0,1)+st;
		  }else{
			  str+=lastname.substring(0,1)+st;
		  }
		}
		else if(nameLength<lastLength) 
		{
		str+=lastname.substring(0,1)+name;
	    }else
	    {
		str+=name.substring(0,1)+lastname;
	    }
	String Epin=String.valueOf(pin);
	int lp=Epin.length()-n;
	str+=Epin.substring(n-1,n)+Epin.substring(lp,lp+1);
	char [] ch=str.toCharArray();
	for(int i=0;i<str.length();i++){
		if(Character.isLowerCase(ch[i]))
		{
			ch[i]=Character.toUpperCase(ch[i]);
		}
		else if(Character.isUpperCase(ch[i])){
			ch[i]=Character.toLowerCase(ch[i]);
		}
	}
	String result=new String(ch);
	System.out.println(result);
	}
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String name,lastname;
	int pin,n;
	System.out.println("Enter the name");
	name=in.next();
	System.out.println("Enter the lastname");
	lastname=in.next();
	System.out.println("Enter the pin");
	pin=in.nextInt();
	System.out.println("Enter the n");
	n=in.nextInt();
	PasswordGenerator(name,lastname,pin,n);
}
}

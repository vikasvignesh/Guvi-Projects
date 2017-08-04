import java.util.Scanner;

public class Alex_Pro67 {
static void findSleep(int arr[],String str,int k){
	for(int i=0;i<k;i++){
		if(str.charAt(arr[i]-1)=='0'){
			System.out.println("YES");
			System.exit(0);
		}
	}
	System.out.println("NO");
}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		String str=in.next();
		int[] arr=new int[n];
		for(int i=0;i<k;i++){
			arr[i]=in.nextInt();
		}
		findSleep(arr,str,k);
		in.close();

	}

}
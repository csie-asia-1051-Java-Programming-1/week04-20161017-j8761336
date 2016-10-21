package hw;
import java.util.Scanner;
public class hw02_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿é¤Jn&m:");
		Scanner scn =new Scanner(System.in);
		int n =scn.nextInt();
		int m =scn.nextInt();
		int a =1;
		int b =1;
		int c =1;
		for(int i=n;i>0;i--){
			a = a*i;
		}
		for(int i=m;i>0;i--){
			b = b*i;
		}
		for(int i=(n-m);i>0;i--){
			c = c*i; 
		}
		System.out.print(a/b/c);
	}

}

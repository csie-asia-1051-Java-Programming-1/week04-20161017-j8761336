package hw;
import java.util.Scanner;
public class hw03_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�s���J���(��J999����):");
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		int b =0;
		int c =0;
		int d =0;
		while(a !=999){
			a =scn.nextInt();
			if(a>0){
				b++;
			}
			else if (a==0){
				c++;
			}
			else{
				d++;
			}
		}
		System.out.println("����:"+b);
		System.out.println("�s:"+c);
		System.out.println("�t��:"+d);
	}

}

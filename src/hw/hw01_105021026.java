package hw;
import java.util.Scanner;
public class hw01_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("¿é¤Jn­Ó¼Æ:");
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		int b =1;
		int c =1;
		int d =0;
		if(a ==1){
			System.out.print("1");
		}
		else if (a == 2){
			System.out.print("1,1");
		}
		else {
			System.out.print("1,1");
			for(int q=3; q<=a; q++){
				d =b+c;
				c =b;
				b =d;
			System.out.print(","+d);
			}
		}
	}

}

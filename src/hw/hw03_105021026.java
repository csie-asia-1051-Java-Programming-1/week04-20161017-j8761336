package hw;
import java.util.Scanner;
public class hw03_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("連續輸入整數(輸入999停止):");
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
		System.out.println("正數:"+b);
		System.out.println("零:"+c);
		System.out.println("負數:"+d);
	}

}

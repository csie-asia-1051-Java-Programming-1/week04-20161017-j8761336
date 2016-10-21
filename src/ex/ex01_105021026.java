package ex;

/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021026 周永振老師
 */
import java.util.Scanner;
public class ex01_105021026 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入多個正整數(-1即停止)");
		Scanner scn =new Scanner(System.in);
		int b =scn.nextInt();
		int sum =0;
		int a = 0;
		while(b != -1){
			sum +=b;
			b = scn.nextInt();
			a++;
		}
		System.out.println("合:"+sum);
		System.out.println("平均"+sum/a);
	}

}

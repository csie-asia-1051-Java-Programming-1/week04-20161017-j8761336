package ex;
import java.util.Scanner;
/*
 * Topic: 讓使用者輸入 一個正整數 n 然後顯示出下列圖形 (例 n = 4)
	* 
	** 
	***
	****
 * Date: 2016/10/17
 * Author: 105021026 周永振老師
 */

public class ex03_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a =scn.nextInt();
		for(int b=1;b<=a;b++){
			for(int c=1;c<=b;c++){
			System.out.print("*");
		}
			System.out.println();
			}
	}

}

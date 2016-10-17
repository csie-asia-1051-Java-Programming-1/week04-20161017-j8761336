package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021026 周永振老師
 */
import java.util.Scanner;
public class ex02_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.print("輸入m.n");
		int m =scn.nextInt();
		int n =scn.nextInt();
		int sum=1;
		for(int i=1;i<=m;i++){
			for(int o=1;o<=n;o++){
				System.out.print(i*o);
			}
			System.out.println( );
		}
		while(true){
		System.out.print("請問是否要繼續?(Y/n)");
		char b= scn.next().charAt(0);
		if (b==89){
		System.out.print("輸入m.n");
		int m1 =scn.nextInt();
		int n1 =scn.nextInt();
		int sum1=1;
		for(int i=1;i<=m1;i++){
			for(int o=1;o<=n1;o++){
				System.out.print(i*o);
			}
			System.out.println( );
		}}
		else{
			System.out.print("掰掰~");
			break;
		}}
	}

}

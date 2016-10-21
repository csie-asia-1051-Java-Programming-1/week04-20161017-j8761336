package hw;
import java.util.Scanner;
public class hw04_105021026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("輸入n(3要輸入奇數):");
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		int m =scn.nextInt();
		int n =((m+1)/2);
		if(a==1){
			for(int i=0;i<n;i++){
				for(int q=n;q>i;q--){
					System.out.print("@");
				}
				System.out.println();
			}
			for(int i=1;i<n;i++){
				for(int q=0;q<i+1;q++){
					System.out.print("@");
				}
				System.out.println();
			}
		}
		else if (a==2){
			for(int i=0;i<n;i++){
				for(int q=0;q<i+1;q++){
					System.out.print("%");
				}
				System.out.println();
			}
			for(int i=1;i<n;i++){
				for(int q=n;q>i;q--){
					System.out.print("%");
				}
				System.out.println();
			}
		
			
		}
		else if(a==3){
			for(int i=1;i<=n;i++){
				for(int q=n;q>=i;q--){
					System.out.print(" ");
				}
				for(int z=1;z<=(i*2)-1;z++){
				System.out.print("#");
				}
				System.out.println();
			}
			for(int i=2;i<=m;i++){
				for(int q=1;q<=i;q++){
					System.out.print(" ");
				}
				for(int d=m;d>=(i*2)-1;d--){
				System.out.print("#");
				}
				System.out.println();
			}
			
		}
		else {
			System.out.print("End!!!");
		}
	}

}

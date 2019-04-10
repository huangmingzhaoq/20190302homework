package demo;

import java.util.*;

public class homework {

	public static void main(String[] args) {
		
		//		2.打印:
		//			1
		//			12 
		//			123
		//			1234
		//			12345
		
//		for (int i=1;i<=5;i++) {
//			for (int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		
		//		3.打印:
		//			54321
		//			4321
		//			321
		//			21
		//			1
		
//		for (int i=5;i>=1;i--) {
//			for (int j=i;j>=1;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		
		//		4.打印:
		//			12345
		//			1234
		//			123
		//			12
		//			1
		
//		for (int i=5;i>=1;i--) {
//			for (int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		
		//		5.打印:
		//			1
		//			21
		//			321
		//			4321
		//			54321
		
//		for (int i=1;i<=5;i++) {
//			for (int j=i;j>=1;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		//		6.打印空心菱形。
	
		
//		Scanner input=new Scanner(System.in);
//		int i,j,k;
//		do{
//			System.out.print("请输入一个奇数：");
//			i = input.nextInt();
//		}while(i%2==0);
//		
//		for (int h=1;h<=i;h++) {
//			if (h<=i/2+1) {
//				for(j=1;j<=i/2+1-h;j++) {
//					System.out.print(" ");
//				}
//				for(k=1;k<=2*h-1;k++) {
//					if(k==1||k==2*h-1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}else {
//				for(j=1;j<=h-(i+1)/2;j++) {
//					System.out.print(" ");
//				}
//				for(k=1;k<=(i+1-h)*2-1;k++) {
//					if(k==1||k==(i+1-h)*2-1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}
	
	
		
		//7.百元百鸡：母鸡5元一只，公鸡3元一只，小鸡1元3只，请输出100元买100只鸡的方案。
		//	母鸡0-20	公鸡0-33
		
//		int num5;
//		int num3;
//		int num1;
//		for (num5=0;num5<=20;num5++) {
//			for(num3=0;num3<=33;num3++) {
//				num1=100-num5-num3;
//				if(num1%3==0) {
//					if(num5*5+num3*3+num1/3==100) {
//						System.out.println("母鸡买"+num5+"只，公鸡买"+num3+"只，小鸡买"+num1+"只");
//					}
//				}
//			}
//		}
		
	}

}
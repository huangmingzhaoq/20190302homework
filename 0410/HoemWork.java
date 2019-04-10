package com.newer.deom;

import java.util.Scanner;

public class HoemWork {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		  /*2.打印:
			1
			12 
			123
			1234
			12345*/
		
//		System.out.println("请输入行数:");
//		int num = input.nextInt();
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}

		
		  /*3.打印:
			54321
			4321
			321
			21
			1*/
		
	
//		for(int i=1;i<=5;i++) {
//			
//			for(int j=6-i;j>=1;j--) {
//				System.out.print(j);
//			}
//			
//			System.out.println();
//		}
		
		  /*4.打印:
			12345
			1234
			123
			12
			1*/
		
//		System.out.println("请输入行数:");
//		int num = input.nextInt();
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<=num-i+1;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		  /*5.打印:
			1
			21
			321
			4321
			54321*/
		
		/*for(int i =1;i<=5;i++) {
			for(int j=i;j>=1;j--) {
				System.out.print(j);
			}
			System.out.println();
		}*/
		
		//6.打印空心菱形。
		
//		int abs = 0;
//		do {
//			System.out.print("请输入菱形行数(奇数):");
//			abs = input.nextInt();
//		} while (abs % 2 == 0);
//
//		int top = abs / 2 + 1;// 上一半行数
//		int bottom = abs / 2;// 下一半行数
//		//上半部分菱形
//		for(int i=0;i<top;i++) {
//			for(int j=top;j>i+1;j--) {
//				System.out.print(" ");
//			}
//			for(int k=0;k<2*i+1;k++) {
//				if(k==0||k==2*i) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
//		
//		//下半部分菱形
//		for(int i=abs/2+1;i<abs;i++) {
//			
//			for(int j=0;j<i-bottom;j++) {
//				System.out.print(" ");
//			}			//15
//			for(int k=0;k<2*abs-1-2*i;k++) {
//				if(k==0||k==2*(abs-i-1)) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}	
		
		
		//7.百元百鸡：母鸡5元一只，公鸡3元一只，小鸡1元3只，请输出100元买100只鸡的方案。
		
		for(int i=0;i<20;i++) {
			for(int j=0;j<33;j++) {
				int x=100-i-j;
				if((x%3==0)&&(i*5+j*3+x/3==100)) {
					System.out.println("母鸡数量:"+i+"公鸡数量:"+j+"小鸡数量:"+x);
				}
			}
		}
		
		
	}

}

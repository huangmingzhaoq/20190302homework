package com.Homework.test;

import java.util.Scanner;

public class Homework {
public static void main(String[] args) {
//	2.打印:
//		1
//		12 
//		123
//		1234
//		12345
//	int row = 5;
//	for (int i = 1; i <= row; i++) {
//		for (int j = 1; j <= i; j++) {
//			
//			System.out.print(j);
//		}
//		System.out.println();
//	}
	
//	3.打印:
//		54321
//		4321
//		321
//		21
//		1
//	
//	int row = 5;
//	for (int i = 1; i <= row; i++) {
//		for (int j = row-i+1; j >= 1; j--) {
//			System.out.print(j);
//		}
//		System.out.println();
//	}
	
//	4.打印:
//		12345
//		1234
//		123
//		12
//		1
//	int row = 5;
//	for (int i = 1; i <= row; i++) {
//		for (int j = 1; j <= row-i+1; j++) {
//			System.out.print(j);
//		}
//		System.out.println();
//	}
//	
//	5.打印:
//		1
//		21
//		321
//		4321
//		54321
//	
//	int row = 5;
//	for (int i = 1; i <= row; i++) {
//		for (int j =i ; j>0; j--) {
//			System.out.print(j);
//		}
//		System.out.println();
//	}
	
//	6.打印空心菱形。
//    *
//   * *
//  *   *
// *     *
//  *   * 
//   * *
//    *
//	Scanner Scanner = new Scanner(System.in);
//	int row;
//	do {
//
//		System.out.println("请输入一个奇数：");
//	    row = Scanner.nextInt();
//	} while (row % 2 == 0);
// 	
//	for (int i = 1; i <= (row+1)/2; i++) {
//		for (int j = 1; j <= (row+1)/2-i; j++) {
//			System.out.print(" ");
//		}
//	
//		for (int j = 1; j <= (2*i-1); j++) {
//			if (j==1||j==2*i-1) {
//				System.out.print("*");
//			}	    
//			else {
//				System.out.print(" ");
//			}	
//	}
//		System.out.println();	
//}
//
//	
//	for (int i = (row+1)/2+1; i <= row; i++) {
//		for (int j = 1; j <= i-(row+1)/2; j++) {
//			System.out.print(" ");
//		}
//	
//		for (int j = 1; j <= (row+1-i)*2-1; j++) {
//			if (j==1||j==(row+1-i)*2-1) {
//				System.out.print("*");
//			}	    
//			else {
//				System.out.print(" ");
//			}	
//		}
//		System.out.println();	
//	}
	
//	7.百元百鸡：母鸡5元一只，公鸡3元一只，小鸡1元3只，请输出100元买100只鸡的方案。
//	int g,m,x;
//	for (m = 0; m <= 20; m++) {
//		for (g = 0; g < 33; g++) {
//			x = 100-m-g;
//			if (x%3==0&&m*5+g*3+x/3==100) {
//				System.out.println("买鸡方案为：公鸡"+g+"只，"+"母鸡"+m+"只，"+"小鸡"+x+"只");
//			}
//		}
		
	}
 
}
}


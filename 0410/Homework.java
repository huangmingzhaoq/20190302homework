package com.newer.cn;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
//2.打印:
//1
//12 
//123
//1234
//12345

//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print(j);
//
//			}
//			System.out.println();
//		}
//3.打印:
//54321
//4321
//321
//21
////1
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 6 - i; j >= 1; j--) {
//				System.out.print(j);
//
//			}
//			System.out.println();
//		}
//		}
//4.打印:
//12345
//1234
//123
//12
//1
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 1; j <= 5 - i + 1; j++) {
//				System.out.print(j);
//
//			}
//			System.out.println();
//		}
//5.打印:
//1
//21
//321
//4321
//54321
//		for (int i = 1; i <= 5; i++) {
//			for (int j = i; j >= 1; j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//6.打印空心菱形。
//	    *
//	   * *
//	  *   *
//	 *     *
//	  *   * 
//	   * *
//	    *
//		// 上半部分
//		// 4次循环
//		for (int i = 1; i <= 4; i++) {// 1.2.3.4.
//			// 一行
//			// 空格部分
//			for (int j = 3; j >= i; j--) {// 1.2.3.4
//				System.out.print(" ");
//
//			}
//			// 星星部分
//			for (int k = 1; k <= 2 * i - 1; k++) {
//				if (k == 1 || k == 2 * i - 1) {
//					System.out.print("*");
//				} else {
//					System.out.print(" ");
//				}
//				;
//			}
//			// 换行
//			System.out.println();
//		}
//		// 下半部分
//		// 3次循环
//		for (int i = 3; i >= 1; i--) {// 3.2.2.1
//			// 一行
//			// 空格部分
//			for (int j = 1; j <= 4 - i; j++) {// 1.2.3.
//				System.out.print(" ");
//			}
//			// 星星部分
//
//			for (int k = 5; k >= 7 - 2 * i; k--) {// 1.3.5
//				if (k == 5 || k == 7 - 2 * i) {
//					System.out.print("*");
//
//				} else {
//					System.out.print(" ");
//				}
//
//			}
//			// 换行
//			System.out.println();
//		}
//7.百元百鸡：母鸡5元一只，公鸡3元一只，小鸡1元3只，请输出100元买100只鸡的方案。

		// 第一层公鸡
		for (int g = 1; g <= 20; g++) {
			// 第二层母鸡
			for (int m = 1; m <= 33; m++) {
				// 第三层小鸡
				for (int x = 3; x <= 100; x = x + 3) {
					if (g + m + x == 100 && 5 * g + 3*m+x / 3 == 100) {
						System.out.println("输出母鸡数为："+g + "输出公鸡数为：" + m + "输出小鸡数为" + x);
					}

				}
			}

		}

	}
}

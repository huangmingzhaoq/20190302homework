<<<<<<< HEAD
package com.newer.demo;

import java.util.Random;//导包
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Random random=new Random();
		//猜拳游戏
		int you,computer,count=0,win=0;
		String ans;		
		
		do {
			System.out.print("请出拳：1剪刀、2石头、3布");
			you=scanner.nextInt();
			computer=random.nextInt(3)+1;//取1-3之间的随机整数
			System.out.print("你出的是");
			print(you);//调用方法
			System.out.print("计算机出的是");
			print(computer);
			if(you==computer) {
				System.out.println("平手");
			}else if(you-computer==1 || you-computer==-2) {
				System.out.println("你赢了");
				win++;
			}else {
				System.out.println("你输了");
			}
			count++;
			System.out.println("还玩吗？(y/n)");
			ans=scanner.next();
		}while("y".equals(ans));
		
		System.out.println("你的胜率是"+String.format("%.2f", win/(double)count*100)+"%");
		
		scanner.close();

	}
	
	/*
	 * 根据输入的num值对应输出选择的拳类型
	 */
	public static void print(int num) {
		switch (num) {
		case 1:
			System.out.println("剪刀");
			break;
		case 2:
			System.out.println("石头");
			break;	
		case 3:
			System.out.println("布");
			break;
		}
	}

}
=======
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

>>>>>>> b1af9a46f99bb1263b267cf8e74e37a7ac4503c4

package com.newer.cn;

import java.util.Random;
import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
//1.打印九九乘法表
//1*1=1
//1*2=2 2*2=4
//1*3=3 2*3=6 3*3=9
//1*4=4 2*4=8 3*4=12 4*4=16
//1*5=5       
//	......
//1*9=9 2*9=18...............9*9=81
//	    int i=1, j=1;
//		for( i=1;i<10;i++) {
//      for( j=1;j<=i;j++) {
//         
//         
//        System.out.print(i+"*"+j+"="+i*j+"\t");
//        	
//       if(j==i) {
//    	  System.out.print("\n");
//       }
//       }
//      }
//1、用户选择出拳：1剪刀、2石头、3布
//2、计算机随机出拳
//3、判断胜负
//4、询问是否继续
//5、退出循环后，统计用户的胜率。
		int cp = 0, i;String ans = null;//接受字符串空号
		int count = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的数字：");
		int user = scanner.nextInt();
		Random random = new Random();
		for (i = 1;; i++) {
			if (user == 1) {
				System.out.println("剪刀");
			}

			if (user == 2) {
				System.out.println("石头");
			}

			if (user == 3) {
				System.out.println("布");
			}

			cp = (int) (random.nextInt(3) + 1);
			if (cp == 1) {
				System.out.println("计算机出的石头");
			}
			if (cp == 2) {
				System.out.println("计算机出的剪刀");
			}
			if (cp == 3) {
				System.out.println("计算机出的布");
			}
			if (user == 1 && cp == 1) {
				System.out.println("电脑赢了");

			}
			if (user == 1 && cp == 2) {
				System.out.println("平手");

			}
			if (user == 1 && cp == 3) {
				System.out.println("你赢了");
				count++;

			}
			if (user == 2 && cp == 1) {
				System.out.println("平手");

			}
			if (user == 2 && cp == 2) {
				System.out.println("你赢了");
				count++;
			}
			if (user == 2 && cp == 3) {
				System.out.println("电脑赢了");

			}
			if (user == 3 && cp == 1) {
				System.out.println("你赢了");
				count++;

			}
			if (user == 3 && cp == 2) {
				System.out.println("电脑赢了");

			}
			if (user == 3 && cp == 3) {
				System.out.println("平手");

			}
			System.out.println("是否还要继续" + "y/n");
			ans = scanner.next();
			if ("y".equals(ans)) {// 如果接受的是y继续循环否则停止循环
			continue;

					}
			System.out.println(count++/i*100+"%");}
	}
}

//Random random=new Random();
//int x=random.nextInt(3);//取0-2之间的随机数
//System.out.println(x);
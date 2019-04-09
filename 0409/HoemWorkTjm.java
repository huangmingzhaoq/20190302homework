package com.newer.deom;

import java.util.Scanner;
import java.util.Random;

public class HoemWorkTjm {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// 猜拳游戏
		String ans = "y";
		int num = 1;
		int cai = 0;
		int count = 0;

		for (cai = 0;; cai++) {
			Random next = new Random();
			num = next.nextInt(3);
			System.out.println("请猜拳:1石头,2剪刀,3布,");
			cai = input.nextInt();
			if (cai == 1) {
				System.out.println("您出的是石头");
			} else if (cai == 2) {
				System.out.println("您出的是剪刀");
			} else if (cai == 3) {
				System.out.println("您出的是布");
			}

			if (num == 1) {
				System.out.println("电脑出的是石头");
			} else if (num == 2) {
				System.out.println("电脑出的是剪刀");
			} else if (num == 3) {
				System.out.println("电脑出的是布");
			}
			if ((cai == 1 && num == 2) || (cai == 2 && num == 3) || (cai == 3 && num == 1)) {
				System.out.println("你赢了!!\n电脑输了!!");
				count++;
			} else if ((cai == 1 && num == 1) || (cai == 2 && num == 2) || (cai == 3 && num == 3)) {
				System.out.println("双方平手!!");

			} else if ((cai == 1 && num == 3) || (cai == 2 && num == 1) || (cai == 3 && num == 2)) {
				System.out.println("你输了!!\n电脑赢了!!");

			}

			System.out.print("是否继续:(y/n)");
			ans = input.next();
			if ("y".equals(ans)) {
				continue;
			} else {
				break;
			}
		}

		double sheng = cai / count;
		System.out.println("用户胜率" + sheng * 10.0 + "%");

		// 九九乘法表
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+"*"+j+"="+(i*j)+"\t");
//			}
//			System.out.print("\n");
//		}
		input.close();
	}
}

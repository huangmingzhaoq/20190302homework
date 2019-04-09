package demo;

import java.util.*;

public class hm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 99乘法表
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
//
//			}
//			System.out.print("\n");
//		}

		// 猜拳游戏
		int a = (int) (Math.random() * 3);
		int pc = a + 1;
		String diannao = "电脑出拳";
		switch (pc) {
		case 1:
			diannao = "剪刀";
			break;
		case 2:
			diannao = "石头";
			break;
		case 3:
			diannao = "布";
			break;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("=========猜拳游戏=========");
		System.out.println("请输入1、2、3，1代表剪刀，2代表石头，3代表布");
		int player = scanner.nextInt();
		String wanjia = "玩家出拳";
		switch (player) {
		case 1:
			wanjia = "剪刀";
			break;
		case 2:
			wanjia = "石头";
			break;
		case 3:
			wanjia = "布";
			break;
		}
		if (pc == player) {
			System.out.println("电脑出的是" + diannao + "，你出的是" + wanjia + "，平局");
		}
		if (pc == 1 && player == 2 || pc == 2 && player == 3 || pc == 3 && player == 1) {
			System.out.println("电脑出的是" + diannao + "，你出的是" + wanjia + "，你赢了");
		}
		if (pc == 1 && player == 3 || pc == 2 && player == 1 || pc == 3 && player == 2) {
			System.out.println("电脑出的是" + diannao + "，你出的是" + wanjia + "，电脑赢了");
		}

		if (player != 1 && player != 2 && player != 3) {
			System.out.println("只能输入1、2、3");
		}
	}

}

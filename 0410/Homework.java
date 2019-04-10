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

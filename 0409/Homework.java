package com.newer.demo;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
//		int sum=0;
//		for(int i=1;i<=100;i+=2) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
//		int num,sum=0;
//		System.out.println("请输入一个整数：");
//		num=scanner.nextInt();
//		//从1累加到输入的整数
//		for(int i=1;i<=num;i++) {
//			sum+=i;
//		}
//		System.out.println("sum="+sum);
		
//		int num,sub=1;
//		System.out.println("请输入一个整数：");
//		num=scanner.nextInt();
//		//从1累加到输入的整数
//		for(int i=1;i<=num;i++) {
//			sub*=i;
//		}
//		System.out.println("sub="+sub);
		
//		int num,count=0;
//		//取0-99之间的随机数
//		int ran=(int)(Math.random()*100);
//		
//		do {
//			do {
//				System.out.println("请猜一个0-99之间的数字:");
//				num=scanner.nextInt();
//			}while(num<0 || num>99);
//			
//			if(num>ran) {
//				System.out.println("猜大了！");
//			}
//			if(num<ran) {
//				System.out.println("猜小了");
//			}
//			count++;//记录猜的次数
//		}while(num!=ran);
//		
//		if(count<5) {
//			System.out.println("运气真好!");
//		}else if(count<10) {
//			System.out.println("终于结束了吗！");
//		}else {
//			System.out.println("玩游戏能认真点吗？");
//		}
		
//		int sum=0,sub=1;
//		
//		for(int i=1;i<=10;i++) {
//			sub*=i;//先累乘
//			sum+=sub;//后累加
//		}
//		System.out.println("sum="+sum);
		
		//水仙花数：穷举法
		for(int i=100;i<1000;i++) {
			int a=i%10;
			int b=i/10%10;
			int c=i/100;
			
			if(a*a*a+b*b*b+c*c*c==i) {
				System.out.print(i+"\t");
			}
		}
		
		
		
		scanner.close();

	}

}

package com.newer.demo;

import java.util.Scanner;

public class Homework0408 {

	public static void main(String[] args) {
		// TODO; Auto-generated method stub
		
//		第六题 1-100内的奇数和
		Scanner scanner=new Scanner(System.in);
//		int i=1,sum=0;
//		while(i<=100) {
//			sum=sum+i;
//			i+=2;
//		}
//		System.out.println("1-100之内的奇数和为："+sum);
		
//		int i=1,sum=0;
//		do {
//			sum=sum+i;
//			i+=2;
//		}while(i<=100);
//		System.out.println("1-100之内的奇数和为："+sum);
//		
		
//		int sum=0;
//		for (int i = 1; i<=100;) {
//			sum=sum+i;
//			i+=2;
//			System.out.println("1-100之内的奇数和为："+sum);
//		}
		
//		第七题  1-n 的和
//		int num1,sum=0;
//		System.out.println("请输入一个整数：");
//		num1=scanner.nextInt();
//		int i=1;
//		while(i<=num1) {
//			sum+=i;
//			i++;
//			System.out.println("和为："+sum);
///		}
		
		
//		第八题  1-n 的乘积
//		long num1,sum=1;
//		System.out.println("请输入一个整数：");
//		num1=scanner.nextInt();
//		long i=1;
//		while(i<=num1) {
//			sum*=i;
//			i++;
//			System.out.println("乘积为："+sum);
//		}
		
		
		
		
//		第九题 输入数字并打印
//		int num;
//		String ans,temp;
//		do {
//			System.out.print("请输入一个正整数:");
//			num=scanner.nextInt();
//			System.out.println("数字为："+num);
//			temp=scanner.nextLine();
//			System.out.println("是否继续？（y/n）");
//			ans=scanner.nextLine();
//	}while("y".equals(ans));
		
		
		
//		第10题   猜数字游戏
//		double num=Math.random()*100;
//		int x,sum=0;
//		do {
//			System.out.print("请输入一个0~99之间的数字");
//		    x=scanner.nextInt();
//		    if(x<(int)num) {
//		    	System.out.println("猜小了");
//		    	
//		    }else if(x>(int)num) {
//				System.out.println("猜大了");
//				sum++;
//			}
//	}while((int)num!=x);
//		System.out.println("猜对了");
//		if (sum<=5) {
//			System.out.println("5次以内猜中");
//		}else if (sum<=6&&sum>=10) {
//			System.out.println("6-10次猜中");
//		}else if (sum>=10) {
//			System.out.println("10次以上猜中");
//		}
		
		
		
		
//		第11缇  求1-10的阶乘
//		long sum=0;
//		long x=1;
//		for (int i = 1; i<=10;i++) {
//			x=x*i;
//			sum +=x;
//			System.out.println("1-10之内的阶乘为："+sum);
//		}
		
//      第十二题水仙花数字
		for(int i=1;i<1000;i++) {
			int a=i/100,b=(i%100)/10,c=(i%100)%10;
			if(i==a*a*a+b*b*b*b+c*c*c);{
				System.out.println("水仙花数为："+i);
			}
		
		}
		
}
}
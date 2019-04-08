package com.newer.cn;

import java.util.Scanner;

public class Homrwork {

	public static void main(String[] args) {
//6.求1-100以内的奇数和。
//要求：用while结构和do...while\for结构三种方法。
//		int i=1,sum=0;
//        while(i<100) {
//        sum=sum+i;
//        i=i+2;
//        
//        }System.out.println(sum);
//       
//7.接受用户输入一个整数，计算从1到该整数的和，如：输入50，则计算1+2+3……50的和。
//		int i=0,b=0, sum=0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入第一个正整数：");
//		i = scanner.nextInt();//i取值的大小范围
//		while(b<=i){         //b 循环体
//		     sum=sum+b;
//		     b++;
//			
//		}System.out.println(sum);
//		
//8.接受用户输入一个正整数，求出该数的阶乘，如：例如：输入5，则计算5*4*3*2*1=120。
//		int i=1,b=1,product=1;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入第一个正整数：");
//		i = scanner.nextInt();
//		while(b<=i){
//			product=product*b;
//			b++;
//			
//		}System.out.println(product);
//		
//9.请用户输入一个数字，并打印，问用户是否还要继续输入？要是要继续输入就再输，否则退出。
//要求：用do..while结构。
//		int i=0;
//		String ans="y";//定义一个字符串
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("请输入第一个正整数：");
//		i = scanner.nextInt();
//		do{
//			System.out.println(i);
//			System.out.println("是否继续？（y/n）");
//			ans=scanner.next();
//		}while("y".equals(ans));
//10.猜数字游戏要求用户输入一个0-99之间的数字.提示他猜大了，猜小了，
//再次提示输入数字直到猜中数字，退出循环，
//给出评语，5次以内猜中，6-10次猜中。10次以上猜中
//		int i = 0, coune = 0;
//		// 定义随机数
//		double num = Math.random() * 100;
//		num = (int) num;
//		Scanner scanner = new Scanner(System.in);
//
//		do {
//			System.out.println("请输入0-99之间的一个数字：");
//			i = scanner.nextInt();
//			if (i > num) {
//				System.out.println("猜大了");
//
//			} else if (i < num) {
//				System.out.println("猜小了");
//			} else {
//				System.out.println("猜对了");
//			}
//			coune++;
//
//		} while (i != num);
//		{
//			if (coune < 5) {
//				System.out.println("5次以内");
//			} else if ((coune > 6 && coune <= 10)) {
//				System.out.println("6-10次以内");
//			} else {
//				System.out.println("10次以上");
//			}
//		}
//11.求:1!+2!+3!+......+10!
//10!=1*2*3*4*5*6*7*8*9*10
//		int result=0;
//		int f=0;
//
//		for (int i=1; i<=10; i++)
//		{
//		f = 1;
//		for (int j=2; j<=i; j++)
//		{
//		f *= j;
//		}
//		result+=f;
//		}
//		System.out.println("输出"+result);
//12.输出1000以内的水仙花数说明：如果一个三位数，每位数字的立方和等于该数，则为水仙花数。如153=1*1*1+5*5*5+3*3*3
	int b=0,s=0,g=0;
	for(int i=100;i<1000;i++)
		{b=i/100;
		 s=i%100/10;
		 g=i%10;
			if(i==b*b*b+s*s*s+g*g*g) {
			System.out.println(i);
		} 
		}
		
		

	}
}
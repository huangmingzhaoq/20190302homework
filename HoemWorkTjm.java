package com.newer.deom;

import java.util.Scanner;

import java.util.Random;

public class HoemWorkTjm {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		/*6.求1-100以内的奇数和。
		要求：用while结构和do...while\for结构三种方法。*/
		
//		int i = 0,sum = 0;;
//		while(i<100) {
//			if(i%2==1) {
//				System.out.println(i);
//				sum=sum+i;
//			}
//			i++;
//			
//		}
//		System.out.println("奇数和:"+sum);
		
//		int i=0,sum=0;
//		do {
//			if(i%2==1) {
//				System.out.println(i);
//				sum+=i;
//			}
//			i++;
//		}while(i<100);
//		System.out.println("奇数和:"+sum);
//		int sum=0;
//		for(int i=0;i<100;i++) {
//			if(i%2==1) {
//			System.out.println(i);
//			sum+=i;
//		}
//			}
//		System.out.println("奇数和:"+sum);
		
		//7.接受用户输入一个整数，计算从1到该整数的和，如：输入50，则计算1+2+3……50的和。
//			int integer,sum=0,i=0;
//		System.out.println("请输入一个整数:");
//		integer = input.nextInt();
//		while(i<=integer) {
//			
//			System.out.println(i);
//			sum+=i;
//			i++;
//		}
//		System.out.println("整数和为:"+sum);
		
		//8.接受用户输入一个正整数，求出该数的阶乘，如：例如：输入5，则计算5*4*3*2*1=120。
		
//		int integer,sum=0,i=1;
//		System.out.println("请输入一个整数:");
//		integer = input.nextInt();
//		sum=integer;
//		while(i<integer) {
//			System.out.print(i+"*");
//			sum=sum*(integer-i);
//			i++;
//		}
//		System.out.println(integer+"=阶乘:"+sum);
		
//		9.请用户输入一个数字，并打印，问用户是否还要继续输入？要是要继续输入就再输，否则退出。
//		要求：用do..while结构。
		
//		int integer;
//		String ans ="y";
//		do {
//			System.out.print("请输入一个整数:");
//			integer = input.nextInt();
//			System.out.println(integer);
//			System.out.print("是否继续:(y/n)");
//			ans = input.next();
//		}while("y".equals(ans));
//			System.out.println("程序结束!!");
		
		/*10.猜数字游戏
		要求用户输入一个0-99之间的数字.提示他猜大了，猜小了，
		再次提示输入数字
		直到猜中数字，退出循环，
		给出评语，5次以内猜中，6-10次猜中。10次以上猜中*/

		//定义随机数
//				double num=Math.random()*100;
//				System.out.println(num);
//				Random rd = new Random();
//				int num = rd.nextInt(100);
//				int i = 0,count=0;
//			do {
//				System.out.print("请输入0~99中间的数字");
//				i = input.nextInt();
//				if (i > num) {
//					System.out.println("大了，请重新输入");
//				} else if (i < num) {
//					System.out.println("小了，请重新输入");
//				} else if(i==num){
//					System.out.println("恭喜你，猜对了");
//				}
//				count++;
//			}while(num != i);	
//			if(count<=5) {
//				System.out.println("5次以内猜中");
//			}else if(count>5&&count<10) {
//				System.out.println("6~10次以内猜中");
//			}else {
//				System.out.println("10次以上猜中");
//			}
		
		//10!=1*2*3*4*5*6*7*8*9*10
//		int integer,sum=0,i,a=1;
//		System.out.println("请输入一个整数:");
//		integer = input.nextInt();
//		
//		for(i=1;i<=integer;i++) {
//				a=a*i;
//				sum=sum+a;
//		}
//		System.out.println(integer+":的阶乘=:"+sum);
		
		//11.求:1!+2!+3!+......+10!
		
//		int integer,sum=0,i,a=0;
//		System.out.println("请输入一个整数:");
//		integer = input.nextInt();
//		
//		for(i=1;i<=integer;i++) {
//				a=a+i;
//				sum=sum+a;
//		}
//		System.out.println(integer+":的和="+sum);
		
		/*12.输出1000以内的水仙花数
		说明：如果一个三位数，每位数字的立方和等于该数，则为水仙花数。如153=1*1*1+5*5*5+3*3*3*/
		
//		
//			for(int i=100;i<1000;i++) {
//				int a = i/100;
//				int b = i/10%10;
//				int c = i%10;
//				if(i==(a*a*a+b*b*b+c*c*c)) {
//					System.out.println("水仙花数有:"+i+"="+a+"*"+a+"*"+a+"+"+b+"*"+b+"*"+b+"+"+c+"*"+c+"*"+c);
//				}
//			}
			double num=Math.random()*100;
			int num1=(int)num;
			int a = 0,coune=0;
			do {
				System.out.println("请输入一个数字");
				 a = input.nextInt();
				if(a>num1) {
					System.out.println("猜大了");
				}else if(a<num1){
					System.out.println("猜小了");
				}else {
					System.out.println("猜对了");
				}
				coune++;
				 
			}while(num1!=a);
			if(coune<5) {
				System.out.println("真厉害!!");
			}else if(coune>5&&coune<10) {
				System.out.println("还不错!!");
			}else {
				System.out.println("手气不好!!");
			}
			
			
	}
}

package com.niuer.homework;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		//  6.求1-100以内的奇数和。要求：用while结构和do...while\for结构三种方法。
		
		//while结构
		
//		int i = 1;
//		int sum=0;
//		while (i<=100) {
//			sum+=i;
//			i+=2;
//		}
//		System.out.println("1-100以内的奇数和为："+sum);
		
		//do..while结构
		
//		int i = 1;
//		int sum = 0;
//		do {
//			sum+=i;
//			i+=2;
//		}while (i<=100);
//		System.out.println("1-100以内的奇数和为："+sum);
		
		//for 结构
		
//		int sum=0;
//		for(int i=1;i<=100;i+=2) {
//			sum+=i;
//		}
//		System.out.println("1-100以内的奇数和为："+sum);
		
		
		//7.接受用户输入一个整数，计算从1到该整数的和，如：输入50，则计算1+2+3……50的和
		
//		Scanner input=new Scanner(System.in);
//		System.out.print("请输入一个整数：");
//		int n=input.nextInt();
//		int sum=0;
//		if (n>=1) {
//			for (int i=1;i<=n;i++) {
//				sum+=i;
//			}
//		}else {
//			for (int i=1;i>=n;i--) {
//				sum+=i;
//			}
//		}
//		System.out.println("从1加到"+n+"的和为："+sum);
		
		
		//8.接受用户输入一个正整数，求出该数的阶乘，如：例如：输入5，则计算5*4*3*2*1=120。
		
//		Scanner input=new Scanner(System.in);
//		System.out.print("请输入一个正整数：");
//		int n=input.nextInt();
//		int mult =1;
//		if(n>0) {
//			for (int i =1;i<=n;i++) {
//				mult*=i;
//			}
//			System.out.println(n+"的阶乘是:"+mult);
//		}else {
//			System.out.println("输入有误，请输入正整数");
//		}
		
		
		//9.请用户输入一个数字，并打印，问用户是否还要继续输入？要是要继续输入就再输，否则退出。要求：用do..while结构。
		
//		Scanner input=new Scanner(System.in);
//		String anwser;
//		int n;
//		do {
//			System.out.print("请输入一个整数：");
//			n=input.nextInt();
//			System.out.println("刚刚输入的整数为："+n+"\n");
//			System.out.print("是否继续输入？（y/n）:");
//			anwser = input.next();
//		}while(!"n".equals(anwser));
//		System.out.println("程序结束");
		
		
		//	10.猜数字游戏，要求用户输入一个0-99之间的数字.提示他猜大了，猜小了，再次提示输入数字直到猜中数字，退出循环，
		//		给出评语，5次以内猜中，6-10次猜中。10次以上猜中
		
//		Scanner input=new Scanner(System.in);
//		System.out.print("请猜一个整数：");
//		int n=input.nextInt();
//		int y=(int)(Math.random()*100);
//		int count=1;
//		while (n!=y) {		
//			if (n>y) {
//				System.out.println("猜大了");
//			}else if(n<y) {
//				System.out.println("猜小了");
//			}
//			System.out.print("请继续猜一个数：");
//			n=input.nextInt();
//			count++;
//		}
//		System.out.println("猜中了，您一共猜了"+count+"次");
//		
//		if (count<=5) {
//			System.out.println("您在5次以内猜中");
//		}else if(count>6 && count<=10) {
//			System.out.println("您在6-10次以内猜中");
//		}else {
//			System.out.println("您在10次以上猜中");
//		}
		
		
		
		//11.求:1!+2!+3!+......+10!   10!=1*2*3*4*5*6*7*8*9*10
		
//		int mult=1;
//		int sum=0;
//		for (int i=1;i<=10;i++) {
//			for (int j=1;j<=i;j++) {
//				mult*=j;
//			}
//			sum+=mult;
//			mult=1;
//		}
//		System.out.println(sum);
		
		
		//12.输出1000以内的水仙花数，说明：如果一个三位数，每位数字的立方和等于该数，则为水仙花数。如153=1*1*1+5*5*5+3*3*3
		
//		for (int a=100;a<1000 ;a++ ){
//			int ge = a%10;
//			int shi = a/10%10;
//			int bai = a/100;
//			if (ge*ge*ge+shi*shi*shi+bai*bai*bai==a){
//				System.out.println(a);
//			}
//		} 
		
		
	}

}

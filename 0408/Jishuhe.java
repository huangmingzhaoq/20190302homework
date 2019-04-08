package com.aqi.demo;

import java.util.Scanner;

public class Jishuhe {

	public static void main(String[] args) {
//		6.求1-100以内的奇数和。
//		要求：用while结构和do...while\for结构三种方法。
//		int sum=0;
//		for(int i=1;i<=100;i++) {
//			if(i%2!=0) {
//				sum=sum+i;
//			}
//		}
//		System.out.println("1到100的奇数和："+sum);
//		int i=1;
//		while(i<=100) {
//			if(i%2!=0) {
//				sum=sum+i;
//			}
//			i++;
//		}
//		System.out.println("1到100的奇数和："+sum);
//		int i=1;
//		do {			
//			if(i%2!=0) {
//				sum=sum+i;}
//			i++;
//		}while(i<=100);
//		System.out.println("1到100的奇数和："+sum);
//		7.接受用户输入一个整数，计算从1到该整数的和，如：输入50，则计算1+2+3……50的和。
//		Scanner input=new Scanner(System.in);
//		int sum=0;
//		System.out.println("输入一个整数：");
//		int a=input.nextInt();
//	    for(int i=1;i<=a;i++) {
//	    	sum=sum+i;
//	    }
//        System.out.println("1到输入的整数之间所有整数的和："+sum);
//        input.close();
//		8.接受用户输入一个正整数，求出该数的阶乘，如：例如：输入5，则计算5*4*3*2*1=120。
//		Scanner input=new Scanner(System.in);
//		int JieCheng=1;
//		System.out.println("输入一个正整数：");
//		int a=input.nextInt();
//        for(int i=1;i<=a;i++) {
//        	JieCheng=i*JieCheng;
//        }
//        System.out.println("输出该正整数的阶乘："+(JieCheng));
//        input.close();
//		9.请用户输入一个数字，并打印，问用户是否还要继续输入？要是要继续输入就再输，否则退出。
//		要求：用do..while结构。
//		Scanner input=new Scanner(System.in);
//        System.out.println("输入一个数字");
//        int a=input.nextInt();
//        System.out.println("输出数字"+a);
//        System.out.println("是否继续输入(y/n)");        
//        String JiXu=input.next();
//        
//        int i=1;
//        do {
//        	if("y".equals(JiXu)) {
//        		System.out.println("继续输入第"+(i+1)+"个数");
//        	}
//        	else {
//        		break;
//        	}
//        	i++;
//        	a=input.nextInt();
//        }while(i>=1);
//        input.close();
//		10.猜数字游戏
//		要求用户输入一个0-99之间的数字.提示他猜大了，猜小了，
//		再次提示输入数字
//		直到猜中数字，退出循环，
//		给出评语，5次以内猜中，6-10次猜中。10次以上猜中
//		Scanner input=new Scanner(System.in);
//		System.out.println("输入一个0到99之间的数字");
//		int a=input.nextInt();
//		int Jieguo=(int)(Math.random()*99+1);
//		int count=1;
//		while(true){
//			if(a>Jieguo) {
//				System.out.println("猜大了");}
//			if(a<Jieguo) {
//				System.out.println("猜小了");
//			}
//			if(a==Jieguo) {
//				System.out.println("恭喜你");
//				if(count<=5) {
//					System.out.println("优秀");
//				}
//				else if(count>5&&count<=10) {
//					System.out.println("一般");
//				}
//				else if(count>10) {
//					System.out.println("差");
//				}
//			}
//			System.out.println("再次输入数字");
//			a=input.nextInt();
//			count++;
//		}
//		11.求:1!+2!+3!+......+10!
//		10!=1*2*3*4*5*6*7*8*9*10
//		int chengJi=1;
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			chengJi=chengJi*i;
//			sum=sum+chengJi;
//		}
//		System.out.println("1到10的阶乘和："+sum);
//		12.输出1000以内的水仙花数
//		说明：如果一个三位数，每位数字的立方和等于该数，则为水仙花数。如153=1*1*1+5*5*5+3*3*3
//		System.out.println("输出1000以内的水仙花数：");
//		for(int i=100;i<1000;i++) {
//			int a=i/100;
//			int b=i/10%10;
//			int c=i%10;
//			if(a*a*a+b*b*b+c*c*c==i) {
//				System.out.print(i+" ");
//			}
//		}
	}
}

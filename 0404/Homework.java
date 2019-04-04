package com.newer.demo;

import java.util.Scanner;

public class Homework {
	
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		//作业1
//		int a,b,c,max;		
//		System.out.print("整数1:");
//		a=input.nextInt();
//		System.out.print("整数2:");
//		b=input.nextInt();
//		System.out.print("整数3:");
//		c=input.nextInt();		
//		max=a>b?a:b;
//		max=max>c?max:c;		
//		System.out.println("最大的数是:"+max);
		
		//作业2
//		int num1;
//		System.out.print("整数:");
//		num1=input.nextInt();
//		int a1=num1%10;//个位数字
//		int a2=num1/10%10;//十位数字
//		int a3=num1/100%10;//百位数字
//		int a4=num1/1000;//千位数字		
//		System.out.println(a4+"+"+a3+"+"+a2+"+"+a1+"="+(a1+a2+a3+a4));
		
		int num1,num2,temp;
		System.out.print("整数1:");
		num1=input.nextInt();
		System.out.print("整数2:");
		num2=input.nextInt();
//		temp=num1;
//		num1=num2;
//		num2=temp;
		num2=(num1+num2)-(num1=num2);	
		
		System.out.println("num1="+num1+",num2="+num2);
		
		input.close();//关闭输入流
	}

}

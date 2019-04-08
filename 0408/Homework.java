package com.newer.demo;

import java.util.Scanner;

public class Homework {
	
	public static void main(String[] args) {
		
		Scanner scanner =new Scanner(System.in);
		
		//输入年份,判断该年是平年,还是闰年?
//		int year;
//		System.out.print("请输入一个年份:");
//		year=scanner.nextInt();
//		if(year%400==0 || (year%4==0&&year%100!=0)) {
//			System.out.println(year+"是闰年");
//		}else {
//			System.out.println(year+"是平年");
//		}
		
//		int day;
//		System.out.print("请输入今天是星期几？");
//		day=scanner.nextInt();
//		switch (day) {
//		case 1:
//		case 2:
//		case 3:	
//		case 4:
//		case 5:
//			System.out.println("工作日");
//			break;
//		case 6:
//		case 7:	
//			System.out.println("周末");
//			break;
//		default:
//			System.out.println("输入有误！");			
//		}
		
//		int num;
//		System.out.print("请输入一个五位数？");
//		num=scanner.nextInt();
//		
//		if(num%10==num/10000 && num/10%10==num/1000%10) {
//			System.out.println(num+"是回文数");
//		}else {
//			System.out.println(num+"不是回文数");
//		}
		
		//三个数的排序
//		int a,b,c,temp;
//		System.out.print("请输入一个数1");
//		a=scanner.nextInt();
//		System.out.print("请输入一个数2");
//		b=scanner.nextInt();
//		System.out.print("请输入一个数3");
//		c=scanner.nextInt();
//		
//		if(a>c) {
//			temp=a;
//			a=c;
//			c=temp;
//		}
//		
//		if(b>c) {
//			temp=b;
//			b=c;
//			c=temp;
//		}
//		
//		if(a>b) {
//			temp=a;
//			a=b;
//			b=temp;
//		}
//		
//		System.out.println(a+"\t"+b+"\t"+c);
		
		
//		int a,b,c,temp;
//		System.out.print("请输入一个数1");
//		a=scanner.nextInt();
//		System.out.print("请输入一个数2");
//		b=scanner.nextInt();
//		System.out.print("请输入一个数3");
//		c=scanner.nextInt();
//		
//		if(a+b>c && b+c>a && a+c>b) {
//			System.out.println("能构成三角形");
//			if(a==b && b==c) {
//				System.out.println("等边三角形");
//			}
//			if(a==b || b==c || a==c) {
//				System.out.println("等腰三角形");
//			}
//			if(a*a+b*b==c*c || b*b+c*c==a*a || a*a+c*c==b*b) {
//				System.out.println("直角三角形");
//			}
//		}else {
//			System.out.println("不能构成三角形");
//		}
		
//		int age;
//		String merried,gender;
//		
//				
//		System.out.println("婚姻状况(y/n)");
//		merried=scanner.nextLine();
//		System.out.println("性别:(f/m)");
//		gender=scanner.nextLine();
//		System.out.println("请输入司机年龄：");
//		age=scanner.nextInt();	
//			
//		
//		
//		if("y".equals(merried)) {
//			System.out.println("已投保");
//		}else if("m".equals(gender)&&age>30) {
//			System.out.println("已投保");
//		}else if("f".equals(gender)&&age>25) {
//			System.out.println("已投保");
//		}else {
//			System.out.println("未投保");
//		}
		
//		int year,month,day,sum=0;		
//		
//		System.out.println("请输入年份:");
//		year=scanner.nextInt();
//		System.out.println("请输入月份:");
//		month=scanner.nextInt();
//		System.out.println("请输入日期:");
//		day=scanner.nextInt();
//		
//		switch (month-1) {
//		case 11:
//			sum+=30;
//		case 10:
//			sum+=31;
//		case 9:
//			sum+=30;
//		case 8:
//			sum+=31;
//		case 7:
//			sum+=31;
//		case 6:
//			sum+=30;
//		case 5:
//			sum+=31;
//		case 4:
//			sum+=30;
//		case 3:
//			sum+=31;
//		case 2:
//			sum+=28;
//		case 1:
//			sum+=31;		
//		}
//		sum+=day;
//		//闰年并且超过2月以后的日期
//		if((year%400==0 || (year%4==0&&year%100!=0))&&month>2) {
//			sum++;
//		}
//		
//		System.out.println(year+"年"+month+"月"+day+"日是这一年的第"+sum+"天");
//		
		
//		int num;
//		System.out.println("请输入一个正整数");
//		
//		num=scanner.nextInt();
//		
//		while(num>0) {
//			//每次输出个位数
//			System.out.print(num%10);
//			//将十位数变成个位数
//			num/=10;
//		}
		
//		int num,count=0,sum=0;
//		String ans="y";
//		
//		do {
//			System.out.print("请输入一个正整数:");
//			num=scanner.nextInt();
//			String temp=scanner.nextLine();
//			if(num%2==0) {
//				count++;
//				sum+=num;
//			}			
//			System.out.println("是否继续？（y/n）");
//			ans=scanner.nextLine();
//		}while("y".equals(ans));
//		System.out.println("偶数个数"+count+"个，和是"+sum);
		
//		int num1,num2,sum=0,temp;
//		System.out.println("请输入一个正整数1");		
//		num1=scanner.nextInt();
//		System.out.println("请输入一个正整数2");		
//		num2=scanner.nextInt();
//		
//		if(num1>num2) {
//			temp=num1;
//			num1=num2;
//			num2=temp;
//		}
//		
//		while(num1<=num2) {
//			//判断是否是偶数
//			if(num1%2==0) {
//				//将其变成奇数
//				num1++;
//			}
//			//累加奇数和
//			sum+=num1;
//			//求下一个奇数
//			num1+=2;
//		}
//		System.out.println("奇数和="+sum);
		
		//斐波拉契数列
//		int n1=1,n2=1,i=0;		
//		System.out.print(n1+"\t"+n2);		
//		while(i<18) {
//			int n3=n1+n2;
//			System.out.print("\t"+n3);
//			n1=n2;
//			n2=n3;
//			i++;
//		}
		
		//while循环基本结构
//		int i=105;
//		
//		while(i<=100) {
//			if(i%5==0) {
//				System.out.println(i);
//			}
//			i++;
//		}
		
		//do-while循环:先执行，后判断
//		int i=105;
//		
//		do {
//			if(i%5==0) {
//				System.out.println(i);
//			}
//			i++;
//		}while(i<=100);
		
		//for循环:适合固定次数的循环
//		for(int i=1;i<=100;i++) {
//			if(i%5==0) {
//				System.out.println(i);
//			}
//		}
		
		//定义随机数
		double num=Math.random()*100;
		System.out.println((int)num);
		
		
		
		scanner.close();//关闭输入流
	}

}

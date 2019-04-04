package com.newer.demo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		//int score;
		
//		System.out.println("请输入分数:");
//		score=scanner.nextInt();
//		
//		if(score>=90) {
//			System.out.println("优秀");
//		}else if(score>=80) {
//			System.out.println("良好");
//		}else if(score>=60) {
//			System.out.println("中等");
//		}else {
//			System.out.println("不合格");
//		}
		
//		int grade;
//		System.out.print("请输入名次:");
//		grade=scanner.nextInt();
//		
//		switch (grade) {
//			case 1:
//				System.out.println("第一名");
//				break;
//			case 2:
//				System.out.println("第二名");
//				break;
//			case 3:
//				System.out.println("第三名");
//				break;
//			default:
//				System.out.println("逐出师门");			
//		}
//		System.out.println("程序结束");
		
		
		//课堂案例
//		int month,type;
//		
//		System.out.print("请输入出行月份");
//		month=scanner.nextInt();
//		System.out.println("请选择舱位类型:(1为头等舱，2为经济舱)");
//		type=scanner.nextInt();
//		
//		if(month>=5 && month<=10) {
//			switch (type) {
//			case 1:
//				System.out.println("机票9折价格为:"+4000*0.9);
//				break;
//			case 2:
//				System.out.println("机票7.5折价格为:"+4000*0.75);
//				break;			
//			}
//		}else {
//			switch (type) {
//			case 1:
//				System.out.println("机票6折价格为:"+4000*0.6);
//				break;
//			case 2:
//				System.out.println("机票3折价格为:"+4000*0.3);
//				break;			
//			}
//		}
		
		
		
		//循环结构 while语句块
		
//		int i=0;
//		
//		while(i<10) {
//			System.out.println("第"+(i+1)+"次：好好学习天天向上");
//			i++;
//		}
		
		//课堂案例
		
//		String ans="y";
//		//判断字符串值是否相等，使用equals方法
//		while("y".equals(ans)) {
//			System.out.println("上午学理论，下午敲代码");
//			System.out.print("是否继续(y/n)");
//			//接收输入的字符串
//			ans=scanner.nextLine();
//		}	
		
		int year=2006;//初始年份
		double num=80000;//初始人数
		
		while(num<200000) {
			num=num*1.25;
			year++;
		}
		System.out.println(year+"年超过20万");
		
		
		
		System.out.println("程序结束");	
		

	}

}

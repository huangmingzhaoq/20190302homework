package com.newer.demo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		//课堂练习1
//		System.out.println("请输入一个数字:");
//		int num=scanner.nextInt();
//		
//		for(int i=0,j=num;i<=num;i++,j--) {
//			System.out.println(i+"+"+j+"="+num);
//		}
		
		//课堂练习2
//		int i,count=0;
//		
//		for(i=1;i<11;i++) {
//			System.out.print("请输入第"+i+"位顾客的年龄:");
//			//局部变量age
//			int age=scanner.nextInt();
//			if(age<0) {
//				System.out.println("输入错误，请重新开始");
//				//break;
//				continue;
//			}
//			if(age<30) {
//				count++;
//			}
//		}
//		if(i>10) {
//			System.out.println("30岁以下比例："+count*10.0+"%");
//		}
		
//		int i=1,count=0;
//		
//		while(i<11) {
//			System.out.print("请输入第"+i+"位顾客的年龄:");
//			//局部变量age
//			int age=scanner.nextInt();
//			if(age<0) {
//				System.out.println("输入错误，请重新开始");
//				//break;
//				continue;
//			}
//			if(age<30) {
//				count++;
//			}
//			i++;
//		}
//		if(i>10) {
//			System.out.println("30岁以下比例："+count*10.0+"%");
//		}

		
		String username,pwd;
		boolean login=false;//用于判断登录是否成功
		
		for(int i=2;i>=0;i--) {
			System.out.print("请输入用户名:");
			username=scanner.next();
			System.out.print("请输入密码:");
			pwd=scanner.next();
			if("admin".equals(username) && "111111".equals(pwd)) {
				login=true;
				break;
			}
			System.out.println("用户名或密码错误，您还有"+i+"次机会");
		}
		
		if(login) {
			System.out.println("登录成功");
		}else {
			System.out.println("您已被拒绝访问");
		}
		
		
		
		
	}

}

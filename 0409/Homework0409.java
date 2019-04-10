<<<<<<< HEAD
package com.newer.demo1;

import java.util.Scanner;
import java.util.Random;

public class Homework0409 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random input = new Random();

//九九乘法表		
//		for(int a=1;a<=9;a++) {     //循环1*9-9*9
//			for(int i=1;i<=a;i++) {  
//				System.out.print(i+"*"+a+"="+(i*a)+"\t");	
//		}
//			 System.out.println();
//		}
//		

//用户选择出拳：1为剪刀；2为石头；3为布。 计算随机出拳率；判断胜负；询问是否继续；推出循环后，统计用户的胜率。		
		int cai = 0; int count=0;int sum=1;int win=1;
		String ans="y";
		for (int i = 0;; i++) {
			int a = input.nextInt(3);

			System.out.println("请猜拳：1石头,2剪刀,3布");
			cai = scanner.nextInt();

			if (cai == 1) {
				System.out.println("您出的是石头");
			} else if (cai == 2) {
				System.out.println("您出的是剪刀");
			} else if (cai == 3) {
				System.out.println("您出的是布");
			}
			if (a == 1) {
				System.out.println("电脑出的是石头");
			} else if (a == 2) {
				System.out.println("电脑出的是剪刀");
			} else if (a == 3) {
				System.out.println("电脑出的是布");
			}
			if (cai == 1 && a == 1 || cai == 2 && a == 2 || cai == 3 && a == 3) {
				System.out.println("平局");sum++;
			}
			if (cai == 1 && a == 2 || cai == 2 && a == 3 || cai == 3 && a == 1) {
				System.out.println("恭喜你赢了");sum++; win++;
			} else if (cai == 1 && a == 3 || cai == 2 && a == 1 || cai == 3 && a == 2) {
				System.out.println("电脑赢了");sum++;
			}
			
		System.out.println("你的胜率为：" + 100*win/sum + "%");
		if(win==0) {
			System.out.println("你的胜率为："+win);
		}
			System.out.println("是否继续(y/n)");
			ans=scanner.next();
			if("y".equals(ans)) {
				continue;
			}else {
				System.out.println("程序结束");
				break;
				
			}
			
			}
		
		}

	}

=======
package com.newer.demo1;

import java.util.Scanner;
import java.util.Random;

public class Homework0409 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random input = new Random();

//九九乘法表		
//		for(int a=1;a<=9;a++) {     //循环1*9-9*9
//			for(int i=1;i<=a;i++) {  
//				System.out.print(i+"*"+a+"="+(i*a)+"\t");	
//		}
//			 System.out.println();
//		}
//		

//用户选择出拳：1为剪刀；2为石头；3为布。 计算随机出拳率；判断胜负；询问是否继续；推出循环后，统计用户的胜率。		
		int cai = 0; int count=0;int sum=1;int win=1;
		String ans="y";
		for (int i = 0;; i++) {
			int a = input.nextInt(3);

			System.out.println("请猜拳：1石头,2剪刀,3布");
			cai = scanner.nextInt();

			if (cai == 1) {
				System.out.println("您出的是石头");
			} else if (cai == 2) {
				System.out.println("您出的是剪刀");
			} else if (cai == 3) {
				System.out.println("您出的是布");
			}
			if (a == 1) {
				System.out.println("电脑出的是石头");
			} else if (a == 2) {
				System.out.println("电脑出的是剪刀");
			} else if (a == 3) {
				System.out.println("电脑出的是布");
			}
			if (cai == 1 && a == 1 || cai == 2 && a == 2 || cai == 3 && a == 3) {
				System.out.println("平局");sum++;
			}
			if (cai == 1 && a == 2 || cai == 2 && a == 3 || cai == 3 && a == 1) {
				System.out.println("恭喜你赢了");sum++; win++;
			} else if (cai == 1 && a == 3 || cai == 2 && a == 1 || cai == 3 && a == 2) {
				System.out.println("电脑赢了");sum++;
			}
			
		System.out.println("你的胜率为：" + 100*win/sum + "%");
		if(win==0) {
			System.out.println("你的胜率为："+win);
		}
			System.out.println("是否继续(y/n)");
			ans=scanner.next();
			if("y".equals(ans)) {
				continue;
			}else {
				System.out.println("程序结束");
				break;
				
			}
			
			}
		
		}

	}

>>>>>>> b1af9a46f99bb1263b267cf8e74e37a7ac4503c4

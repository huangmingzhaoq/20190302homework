package com.newer.demo;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
//		int sum=0;
//		//二重循环		
//		for(int i=1;i<=3;i++) {
//			System.out.println("请输入"+i+"班的成绩:");
//			for(int j=1;j<=4;j++) {
//				System.out.print("请输入第"+j+"个学生的成绩");
//				int score=scanner.nextInt();
//				sum+=score;
//			}
//			System.out.println("第"+i+"个班级的平均分是:"+String.format("%.2f", sum/4.0));
//			sum=0;
//		}
//		

		
		//使用二重循环打印图形
		//外层循环控制行数
//		for(int i=1;i<=5;i++) {
//			//内层循环控制每行输出*号的次数
//			for(int j=1;j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();//换行
//		}
		
		int row;
//		System.out.print("请输入行数:");
//		row=scanner.nextInt();
		//直角
//		for(int i=1;i<=row;i++) {
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//倒直角
//		for(int i=1;i<=row;i++) {
//			for(int j=1;j<=(row+1)-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//等腰
//		for(int i=1;i<=row;i++) {
//			//先打空格倒直角
//			for(int j=1;j<=row-i;j++) {
//				System.out.print(" ");
//			}
//			//再输出*号
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		do {
			System.out.print("请输入菱形行数（奇数）:");
			row=scanner.nextInt();
		}while(row%2==0);
		int top=row/2+1;//上一半行数
		int bottom=row/2;//下一半行数
		//上半部分等腰三角
		for(int i=1;i<=top;i++) {
			for(int j=1;j<=top-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//下一半倒等腰
		for(int i=1;i<=bottom;i++) {
			//先打正直角
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}			
			for(int j=1;j<=2*(bottom-i)+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		//九九乘法表
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
		
		
		scanner.close();
	}

}

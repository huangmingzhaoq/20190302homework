package lzp.com.day1;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1;
//		 while(i<=200) {
//			 if(i%5==0) {
//				 System.out.println(i);
//			 }
//			 i++;
//		 }
	//作业
	//第六题
		//while 结构
//		int i=1;
//		int sum=0;
//		while (i<=100)
//		{
//			sum=sum+i;
//			i=i+2;
//		}
//		System.out.println("1-100以内的奇数和为："+sum);
	//do..while结构
//		int i=1;
//		int sum=0;
//		do {
//			sum=sum+i;
//			i=i+2;
//		}while(i<=100);
//		System.out.println("1-100以内的奇数和为："+sum);
	//for结构
//		int sum=0;
//		for(int i=1;i<=100;i=i+2) {
//			sum=sum+i;
//		}
//		System.out.println("1-100以内的奇数和为："+sum);
	//第七题
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("请输入一个整数");
//		int a=scanner.nextInt();
//		int sum=0;
//		if(a>=1) {
//			for(int i=1;i<=a;i++) {
//				sum=sum+i;
//			}
//		}else {
//			for(int i=1;i>=a;i--) {
//				sum=sum+i;
//			}
//		}
//		System.out.println("和为："+sum);
	//第八题
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("请输入一个正整数：");
//		int a=scanner.nextInt();
//		int num=1;
//		if(a>0) {
//			for(int i=1;i<=a;i++) {
//				num=num*i;
//			}
//			System.out.println(a+"的阶乘是:"+num);
//		}else {
//			System.out.println("输入错误，请重新输入");
//		}
	//第九题
//		Scanner scanner=new Scanner(System.in);
//		String answer;
//		int a;
//		do {
//			System.out.println("请输入一个整数");
//			a=scanner.nextInt();
//			System.out.println("整数 为："+a+"\n");
//			System.out.print("是否还要继续输入？(y/n):");
//			answer=scanner.next();
//		}while("y".equals(answer));
//		System.out.println("退出");
	//第十题
//		Scanner input=new Scanner(System.in);
//		System.out.print("请猜一个整数：");
//		int n=input.nextInt();
//		int count=1;
//		while (n!=50) {		//假设要猜的数字是50
//			if (n>50) {
//				System.out.println("猜大了");
//			}else if(n<50) {
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
	//第十一题
//		int num=1;
//		int sum=0;
//		for (int i=1;i<=10;i++) {
//			for(int j=1;j<=i;j++) {
//				num=num*j;
//			}
//			sum=sum+num;
//			num=1;
//		}
//		System.out.println(sum);
	//第十二题
//		for(int a=100;a<1000;a++) {
//			int x=a%10;
//			int y=a/10%10;
//			int z=a/100;
//			if(x*x*x+y*y*y+z*z*z==a) {
//				System.out.println(a);
//			}
//		}
	}
}

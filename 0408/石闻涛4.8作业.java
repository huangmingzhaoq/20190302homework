package demo;

import java.util.*;

public class lesson4 {

	private static Scanner type;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 第六题
		// while方法
//		int i=0;int sum=0;
//		while(i<=100) {
//			if(i%2==0) {
//				i++;
//			}
//			else {sum+=i;i++;}
//		
//		}
//		System.out.println("100以内奇数和为："+sum);
		// do while方法
//		int i = 0, sum = 0;
//		do {
//			if (i % 2 == 0) {
//				i++;
//			} else {
//				sum += i;
//				i++;
//			}
//		} while (i <= 100);
//		System.out.println("100以内奇数和为："+sum);
		// for方法
//		int sum = 0;
//		for (int i = 0; i <= 100; i++) {
//			if (i % 2 != 0) {
//				sum += i;
//			}
//			
//		}
//		System.out.println("100以内奇数和为：" + sum);

		// 第七题
//		Scanner num = new Scanner(System.in);
//		System.out.println("输入一个整数");
//		int a = num.nextInt();
//		int sum = 0;
//		for (int i = 0; i <= a; i++) {
//			sum = i + sum;
//		}
//		System.out.println("1到该整数的和为" + sum);

		// 第八题
//		Scanner num = new Scanner(System.in);
//		System.out.println("输入一个整数");
//		int a = num.nextInt();
//		int pro = 1;
//		for (int i = 1; i <= a; i++) {
//			pro = i * pro;
//		}
//		System.out.println("1到该整数的积为" + pro);
		// 第九题
//	String b ;int a;
//		Scanner num = new Scanner(System.in);
//		do {
//		System.out.println("请输入一个数字");
//		a=num.nextInt();
//		System.out.println(a);
//		
//		System.out.println("是否继续输入（y/n）");
//		
//		b=num.next();
//		
//}while("y".equals(b)
//		);
//		
//System.out.println("输出结束");

		// 第十题

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

		// 第十一题
//		int sum=1;
//		int sum1=0;
//		for(int a=1;a<=10;a++) {
//			sum*=a;
//			sum1+=sum;
//		}
//		System.out.println("1!+2!+3!+...+10!的和为:"+sum1);

		// 第十二题
//		for(int a = 100;a<=999&&a>=100;a++) {
//		int x=a/100;
//		int y=a/10%10;
//		int z=a%10;
//		int sum;
//		sum = x*x*x+y*y*y+z*z*z;
//			if(sum==a) {
//				System.out.println(sum);
//			}
//		}
	}
}

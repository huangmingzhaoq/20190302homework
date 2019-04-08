package zy0408;

import java.util.Scanner;

public class Dome {

	public static void main(String[] args) {
		//6.求1-100以内的奇数和。
//		int i=1,sum=0;
//		while(i<=100) {
//			if(i%2==1) {
//				sum+=i;
//			}i++;
//		}
//		System.out.println("奇数和为"+sum);

//		do {
//			if(i%2==1) {
//				sum+=i;
//			}i++;
//		}while(i<=100);
//		System.out.println("奇数和为"+sum);
//		int sum=0;
//		for(int i=1;i<=100;i++) {
//			if(i%2==1) {
//				sum+=i;}
//		}
//		System.out.println("奇数和为"+sum);
		
		//7.接受用户输入一个整数，计算从1到该整数的和，如：输入50，则计算1+2+3……50的和。
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("请输入一个正整数");
//		int sum=0,num=scanner.nextInt();
//		for(int i=1;i<=num;i++) {
//			sum+=i;
//		}
//		System.out.println("整数和为"+sum);
		
		//8.接受用户输入一个正整数，求出该数的阶乘，
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("请输入一个正整数");
//		int sum=1;
//		for(int num=scanner.nextInt();num>0;num--) {
//			sum*=num;
//		}
//		System.out.println("阶乘为"+sum);
		
		//9.请用户输入一个数字，并打印，问用户是否还要继续输入？要是要继续输入就再输，否则退出。
//		Scanner scanner=new Scanner(System.in);
//		int num;
//		String ans,temp;
//		do {
//			System.out.println("请输入一个正整数");
//			num=scanner.nextInt();
//			temp=scanner.nextLine();
//			System.out.println("输入的数为"+num);
//			System.out.println("是否继续(y/n)");
//			ans=scanner.nextLine();
//		}while("y".equals(ans));
		
		//10.猜数字游戏
//		Scanner scanner=new Scanner(System.in);
//		double num=Math.random()*100;
//		int i,x=0;
//		do {
//			System.out.println("输入一个0~99之间的数");
//			i=scanner.nextInt();
//			if(i<(int)num) {
//				System.out.println("猜小了");
//			}else if(i>(int)num) {
//				System.out.println("猜大了");
//			}
//			x++;
//		}while((int)num!=i);
//		System.out.println("猜对了");
//		if(x<=5) {
//			System.out.println("5次以内猜中");
//		}else if(x>5&&x<=10) {
//			System.out.println("6-10次猜中");
//		}else {System.out.println("10次以上猜中");}
		
		//11.求:1!+2!+3!+......+10!
//		int sum=0,num,x=1;
//		for(num=1;num<=10;num++) {
//			x*=num;
//			sum+=x;
//		}
//		System.out.println(sum);
		
		//12.输出1000以内的水仙花数
		int b,c,d,i;
		for(i=2;i<1000;i++) {
			b=i/100;
			c=i/10%10;
			d=i%10;
			if(b*b*b+c*c*c+d*d*d==i) {
				System.out.println(i);
			}
		}
//		scanner.close();
	}

}

package com.newer.demo1;
import java.util.Scanner;
public class zuoye48 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		
//6.求1-100以内的奇数和。要求：用while结构和do...while\for结构三种方法。
		
//		int i,sum=0;
//		for(i=1;i<=100;i++) {
//			if(i%2!=0) {
//				System.out.println(i);
//				sum=sum+i;//求奇数和，累加。
//			}
//			
//		}System.out.println("和为"+sum);
		
		
//7.接受用户输入一个整数，计算从1到该整数的和，如：输入50，则计算1+2+3……50的和。
		
//		int a,sum=0;
//		System.out.println("请输入一个整数");
//		a=scanner.nextInt();
//		
//		int i=0;
//		while(i<=a) {
//			sum=sum+i;
//			i++;
//			
//		}
//	     System.out.println("和为:"+sum);
		
	
		
//8.接受用户输入一个正整数，求出该数的阶乘，如：例如：输入5，则计算5*4*3*2*1=120。	
		
//		int a,sum=1;
//		System.out.println("请输入一个正整数");
//		a=scanner.nextInt();
//		
//		int i=1;
//		while(i<=a) {
//			sum=sum*i;
//			i++;
//		}
//		System.out.println("阶乘为"+sum);
		
		
//9.请用户输入一个数字，并打印，问用户是否还要继续输入？要是要继续输入就再输，否则退出。要求：用do..while结构。
		
//		int a;
//		String b="y";
//		do {
//			System.out.println("请输入一个数字");
//			a=scanner.nextInt();
//			
//			System.out.println("是否继续(y/n)");
//			b=scanner.next();
//			
//			
//		}while("y".equals(b));
//		System.out.println("程序结束");
		

//		10.猜数字游戏
//		要求用户输入一个0-99之间的数字.提示他猜大了，猜小了，
//		再次提示输入数字
//		直到猜中数字，退出循环，
//		给出评语，5次以内猜中，6-10次猜中。10次以上猜中		
		
//		double a=Math.random()*100;
//		a=(int)a;
//		
//		int num,c=0;
//		do {
//			System.out.println("请输入一个数字");
//			num=scanner.nextInt();
//			if(num<a) {
//				System.out.println("猜小了，请继续输入！！");
//			}
//			else if(num>a) {
//				System.out.println("猜大了，请继续输入！！");
//			}else if(num==a) {
//				System.out.println("恭喜你，猜对了！");
//			}
//			c++;
//			
//		}
//		while(a!=num);
//		if(c<=5) {
//			System.out.println("5次以内猜中");
//		}else if(c>5&&c<10) {
//			System.out.println("6~10次");
//		}else if(c>10) {
//			System.out.println("10次以上猜中");
//		}
		

//  11.求:1!+2!+3!+......+10!
//	10!=1*2*3*4*5*6*7*8*9*10
	
		
		
		

//	12.输出1000以内的水仙花数
//	说明：如果一个三位数，每位数字的立方和等于该数，则为水仙花数。如153=1*1*1+5*5*5+3*3*3	
		
//		int a,one,two,three;
//		System.out.println("请输入一个数");
//		a=scanner.nextInt();
//		
//		one=a/100;     //1.53,结果为1
//		two=a/10%10;   //153/10，（等于15）15%10，结果为5
//		three=a%10;	   //153%10，结果为3	  
//
//			if(a==one*one*one+two*two*two+three*three*three) {
//				System.out.println("是水仙花数");
//			}else {
//				System.out.println("不是水仙花数");
//
//		}
//		
		
		
		
	}

}

//import java.util.Scanner;
//
//public class ZY {
//
//	public static void main(String[] args) {
//		Scanner input=new Scanner(System.in);
		//作业1
//		int a=1,b=0;
//		while(a<=100) {
//			if(a%2==1) {
//				b=a+b;
//			}
//			a++;
//		}
//		System.out.print("奇数和为:"+b);
		
//		do {
//			if(a%2==1) {
//				b=a+b;
//			}
//			a++;
//		}
//		while(a<=100);
//		System.out.println("奇数和为:"+b);
		
//		for(a=1;a<=100;a++) {
//			if(a%2==1){
//			b=a+b;
//			}
//		}
//			System.out.println("奇数和为:"+b);
		
//		int a,b=0,num=0;
//		System.out.println("请输入一个整数:");
//		a=input.nextInt();
//		while(num<=a) {
//			b+=num;
//			num++;
//		}
//		System.out.println("整数合为:"+b);
		
//		int num,a=1,b=1;
//		System.out.println("请输入一个正整数:");
//		num=input.nextInt();
//		while(num>=a) {
//			b=b*a;
//			a++;
//		}
//		System.out.println("结果为:"+b);
		
//		int a,b;
//		do {
//			System.out.println("请输入一个数字:");
//			a=input.nextInt();
//			System.out.println("是否继续输入1是2不是");
//			b=input.nextInt();	
//		}while(b==1);
//		System.out.println("程序结束");
		
//		int b,c=0;
//		double a=Math.random()*100;
//		a=(int)a;
//		do {
//			System.out.println("请输入一个数字:");
//			b=input.nextInt();
//			if(a==b) {
//				System.out.println("恭喜你，猜中了！");
//			}
//			if(a<b) {
//				System.out.println("猜大了");
//			}
//			if(a>b) {
//				System.out.println("猜小了");
//			}
//			c++;
//		}while(b!=a);
//		if(c<=5) {
//			System.out.println("运气不错!");
//		}
//		if(c>5&&c<=10) {
//			System.out.println("运气一般");
//		}
//		if(c>10) {
//			System.out.println("运气很差");
//		}
		
//		int a=1,b=1,c=0;
//		while(a<=10) {
//			b=a*b;
//			c=b+c;
//			a++;
//		}
//		System.out.println("合为:"+c);
		
		
//		for(int d=100;d<1000;d++) {			
//			int a=d/100;
//			int b=(d-a*100)/10;
//			int c=d%10;
//			if(a*a*a+b*b*b+c*c*c==d) {
//				System.out.println("水仙花数:"+d);
//		  }
//		}
//
//	}
//
//}

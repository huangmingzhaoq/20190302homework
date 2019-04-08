import java.util.Scanner;

public class Liwenlong {
	public static void main(String[] agrs) {
//		6.求1-100以内的奇数和。
//		要求：用while结构和do...while\for结构三种方法。
//   1
//				int a=1,b=0;
//		while(a<=100) {
//			if(a%2!=0) {
//				b=a+b;
//			}
//			a++;
//		}
//		System.out.println("1-100的和为："+b);
//   2
//	do {
//		if(a%2!=0) {
//			b=a+b;
//		}
//		a++;
//	}while(a<=100);
//	System.out.println("1-100的和为："+b);
//   3
//	for(a=1;a<=100;a++) {
//		if(a%2!=0) {
//		b=a+b;}
//	}System.out.println("1-100的和为："+b);
//7.接受用户输入一个整数，计算从1到该整数的和，如：输入50，则计算1+2+3……50的和。
//		Scanner input=new Scanner(System.in);
//		int a=0,b,c=0;
//		System.out.println("请输入一个整数：");
//		b=input.nextInt();
//		while(c<=b) {
//			a+=c;
//			c++;
//		}
//		System.out.println("和为："+a);
//		8.接受用户输入一个正整数，求出该数的阶乘，如：例如：输入5，则计算5*4*3*2*1=120
//		Scanner input=new Scanner(System.in);
//		int a,b=1,c=1;
//		System.out.println("请输入一个正整数：");
//		a=input.nextInt();
//		while(c<=a) {
//			b=b*c;
//			c++;	
//		}
//		System.out.println("阶乘和"+b);
	//请用户输入一个数字，并打印，问用户是否还要继续输入？要是要继续输入就再输，否则退出。
	//	要求：用do..while结构。
//		Scanner input=new Scanner(System.in);
//		int a,b;
//		do {
//			System.out.println("请输入一个数字：");
//			a=input.nextInt();
//			System.out.println("是否继续输入？1是,2不是");
//			b=input.nextInt();
//			if(b==2) {
//				System.out.println("程序退出");
//			}
//		}while(b==1) ;
		//10.猜数字游戏
//		要求用户输入一个0-99之间的数字.提示他猜大了，猜小了，
//		再次提示输入数字
//		直到猜中数字，退出循环，
//		给出评语，5次以内猜中，6-10次猜中。10次以上猜中
//		Scanner input=new Scanner(System.in);
//		int a,c=0;
//		
//		double b=Math.random()*100;
//		b=(int)b;
//		do {
//			System.out.println("请输入一个0-99之间的数字：");
//			a=input.nextInt();
//			if(a==b) {
//				System.out.println("恭喜你猜中！");
//			}if(a>b) {
//				System.out.println("猜大了！");
//			}if(a<b) {
//				System.out.println("猜小了!");
//			}
//			c++;
//		}while(a!=b);
//		if(c<=5) {
//			System.out.println("运气不错");
//		}if(c>5&&c<10){
//			System.out.println("运气一般");
//		}if(c>10) {
//			System.out.println("太黑了");
//		}
//		
		//11.求:1!+2!+3!+......+10!
	//	10!=1*2*3*4*5*6*7*8*9*10
//		int a=1,b=1,c=0;
//		for(a=1;a<=10;a++) {
//			b=a*b;
//			c=b+c;
//		}System.out.println("1!+....+10!="+c);
//		
		//12.输出1000以内的水仙花数
		//说明：如果一个三位数，每位数字的立方和等于该数，则为水仙花数。如153=1*1*1+5*5*5+3*3*3
	//	Scanner input=new Scanner(System.in);
//		int a=100,b,c,d,e=0;
//		for(a=100;a<1000;a++) {
//		b=a%10;
//		c=a/10%10;
//		d=a/100;
//		if(a==(b*b*b)+(c*c*c)+(d*d*d)) {
//			e++;
//		}
//		}
//		System.out.println(e);

	}
}

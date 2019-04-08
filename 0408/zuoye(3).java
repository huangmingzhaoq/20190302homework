package lesson5;
import java.util.Scanner;
public class zuoye {

	public static void main(String[] args) {		
//		6.求1-100以内的奇数和。
//		要求：用while结构和do...while\for结构三种方法。

		Scanner scanner=new Scanner(System.in);	
//		int x=1,y=0;
//		while(x<=100) {
//			if(x%2!=0){
//				y=x+y;
//			}   
//			x++; 
//		    }
//		System.out.println("1-100以内奇数和为"+y);
//		do {
//			if(x%2!=0) {
//				y=x+y;
//			}
//			x++;
//		}while(x<=100) ;
//		System.out.println("1-100以内奇数和为"+y);
//		for(x=1;x<=100;x++) {
//			if(x%2!=0) {
//				y=x+y;
//			}
//		    }
//		System.out.println("1-100以内奇数和为"+y);
		
//		7.接受用户输入一个整数，计算从1到该整数的和，如：输入50，则计算1+2+3……50的和。
//		要求：
//		int a,b=0,c=0;
//		System.out.println("请输入一个整数");
//		 a=scanner.nextInt();
//		 while(c<=a) {
//			 b+=c;
//			 c++;
//			}
//		 System.out.println("和为"+b);
//		8.接受用户输入一个正整数，求出该数的阶乘，如：例如：输入5，则计算5*4*3*2*1=120。
//		int a,b=1,c=1;
//		System.out.println("请输入一个整数");
//		a=scanner.nextInt();
//		while(c<=a) {
//			b=b*c;
//			c++;
//		}
//		System.out.println("结果为"+b);
		
//		9.请用户输入一个数字，并打印，问用户是否还要继续输入？要是要继续输入就再输，否则退出。
//		要求：用do..while结构。
//		int num,num1;
//		do {
//			System.out.println("请输入一个数字");
//			num=scanner.nextInt();
//			String temp=scanner.nextLine();
//			System.out.println("是否继续？（1/2）");
//			num1=scanner.nextInt();
//		}while(num1==1);
//			System.out.println("程序结束");
//		10.猜数字游戏
//		要求用户输入一个0-99之间的数字.提示他猜大了，猜小了，
//		再次提示输入数字
//		直到猜中数字，退出循环，
//		给出评语，5次以内猜中，6-10次猜中。10次以上猜中
		int a,b=0;
		double num=Math.random()*100;
		num=(int)num;
		do {
			System.out.println("请用户输入一个0-99之间的数字");
			a=scanner.nextInt();
			if(num<a) {
				System.out.println("不好意思猜大了");
			}
		if(num>a) {
			System.out.println("不好意思猜小了");
		}
		if(num==a) {
			System.out.println("恭喜答对了");
		}
		b++;
		}while(a!=num);
		if(b<=5) {
			System.out.println("运气真棒宝贝");
		}
		if(b>5&&b<=10) {
			System.out.println("你还阔以咯");
		}
		if(b>10) {
			System.out.println("你属实是个运气差的人才");
		}
//		11.求:1!+2!+3!+......+10!
//		10!=1*2*3*4*5*6*7*8*9*10
//		int a=1,b=0;
//		for(int i=1;i<=10;i++) {
//			a=i*a;
//			b=b+a;
//		}
//		System.out.println("结果为"+b);
//		12.输出1000以内的水仙花数
//		说明：如果一个三位数，每位数字的立方和等于该数，则为水仙花数。如153=1*1*1+5*5*5+3*3*3
//		System.out.println("1000以内水仙花数为");
//		int a,b,c;
//		for(int i=100;i<1000;i++) {
//			a=i/100;
//			b=i%10%10;
//			c=i%10;
//		
//		if(a*a*a+b*b*b+c*c*c==i) {
//			System.out.println(i+"");
//		}
//		}
//		
		
		
		
		}
	
	
	
	
	
	
	}

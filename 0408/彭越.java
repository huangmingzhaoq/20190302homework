//6.求1-100以内的奇数和。
//要求：用while结构和do...while\for结构三种方法。
//  方法一
//package homework;
//public class Homework4 {   
//	public static void main(String[] args) {
//		int i=1;
//		int sum=0;
//		while(i%2!=0 && i<=100) {
//			sum=sum+i;
//			System.out.println(i);
//			i=i+2;
//			
//		}System.out.println("100以内的奇数和："+sum);
//	}
//	
//	}

//  方法二
//package homework;
//
//public class Homework4 {
//	public static void main(String[] args) {
//		int i = 1;
//		int sum = 0;
//		do {
//			sum = sum + i;
//			i = i + 2;
//		} while (i < 100);
//		System.out.println("奇数和" + sum);
//	}
//}

//方法三
//package homework;
//
//public class Homework4 {
//	public static void main(String[] args) {
//		int i = 1;
//		int sum = 0;
//		for (i = 1; i < 100; i = i + 2) {
//			sum = sum + i;
//		}
//		System.out.println("奇数和是："+sum);
//	}
//}

//
//7.接受用户输入一个整数，计算从1到该整数的和，如：输入50，则计算1+2+3……50的和。
//package homework;
//import java.util.Scanner;
//public class Homework4 {
//	public static void main(String[] args) {
//			Scanner input=new Scanner(System.in);
//			System.out.println("请输入一个数：");
//			int a=input.nextInt();
//			
//			if(a>0) {
//			int sum=0;
//			sum=(1+a)*a/2;
//			System.out.println(sum);
//			}
//			else if(a<0) {
//				a=-a;
//				int sum=0;
//				sum=(1+a)*a/2;
//				System.out.println(-sum+1);
//			}
//	}
//}
//
//8.接受用户输入一个正整数，求出该数的阶乘，如：例如：输入5，则计算5*4*3*2*1=120。

//package homework;
//import java.util.Scanner;
//public class Homework4 {
//	public static void main(String[] args) {
//			Scanner input=new Scanner(System.in);
//			System.out.println("请输入一个正数：");
//			int a=input.nextInt();
//			int x=1;
//			int i=1;
//			while(i>=0 && i<=a) {
//				x=x*i;
//				i++;
//			}System.out.println("其阶乘为："+x);
//			
//	}
//}

//
//9.请用户输入一个数字，并打印，问用户是否还要继续输入？要是要继续输入就再输，否则退出。
//要求：用do..while结构。
//package homework;
//
//import java.util.Scanner;
//
//public class Homework4 {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("请输入一个数：");
//		String a = "0";
//		do {
//			a = input.next();
//			System.out.println("输入的数为：" + a);
//			System.out.println("输入“N”退出程序");
//
//		} while (!"N".equals(a));
//		System.out.println("退出成功");
//	}
//
//}

//
//10.猜数字游戏
//要求用户输入一个0-99之间的数字.提示他猜大了，猜小了，
//再次提示输入数字
//直到猜中数字，退出循环，
//给出评语，5次以内猜中，6-10次猜中。10次以上猜中
//package homework;
//
//import java.util.Scanner;
//import java.util.Random;
//
//public class Homework4 {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		Random rd=new Random();
//		int rdnum=rd.nextInt(100);
//		System.out.println(rdnum);
//		System.out.println("请输入一个数来猜大小：");
//		int num=0;
//		do {
//			 num=input.nextInt();
//			if(rdnum<num) {
//				System.out.println("大了");
//			}
//			else if(rdnum>num) {
//				System.out.println("小了");
//			}
//			else if(rdnum==num) {
//				System.out.println("对了");
//			}
//		
//		
//		}while(rdnum!=num);
//		System.out.println("拜拜！");
//	}
//}

//11.求:1!+2!+3!+......+10!
//10!=1*2*3*4*5*6*7*8*9*10
//package homework;
//import java.util.Scanner;
//public class Homework4 {
//	public static void main(String[] args) {
//			Scanner input=new Scanner(System.in);
//			
//			int a=10;
//			int x=1;
//			int i=1;
//			int sum=0;
//			while(i>=0 &&a>0&&a<=10) {
//				x=x*i;
//				sum=sum+x;
//				System.out.println(x);
//				i++;
//				a--;
//				
//			}System.out.println("1!+2!+3!+......+10!="+sum);
//			
//	}
//}
//	


//12.输出1000以内的水仙花数
//说明：如果一个三位数，每位数字的立方和等于该数，则为水仙花数。如153=1*1*1+5*5*5+3*3*3

package homework;

public class Homework4 {
	public static void main(String[] args) {
			
			System.out.println("1000以内的水仙花数有：");
			int x=100;
			
			do {
				int bai=x/100%10;
				int shi=x/10%10;
				int ge=x%10;
				int bais=bai*bai*bai;
				int shis=shi*shi*shi;
				int ges=ge*ge*ge;
				
			if(x==bais+shis+ges) {
				System.out.print(x);
				System.out.println("\t是水仙花数！");
				
				x++;
			}else if(x!=bais+shis+ges) {
				System.out.print(x);
				System.out.println("\t不是水仙花数！");
				x++;
			}
			
			}while(x<1000);
	}
}
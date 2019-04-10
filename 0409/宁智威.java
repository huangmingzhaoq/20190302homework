<<<<<<< HEAD
<<<<<<< HEAD
package zy0409;

import java.util.Random;
import java.util.Scanner;

public class Dome {

	public static void main(String[] args) {
		
		//猜拳游戏
//	Scanner sc=new Scanner(System.in);
//	String ans,tem;
//	double a=0,b=0;
//	int num;
//	do {
//		Random in=new Random();//生成随机数
//		int x=in.nextInt(3);//取0~2之间的随机整数
//		System.out.println("选择出什么（1剪刀/2石头/3布）");
//		num=sc.nextInt();
//		tem=sc.nextLine();
//		switch(num) {
//		case 1:
//			switch(x+1) {
//			    case 1:
//				System.out.println("平手");
//				break;
//			    case 2:
//					System.out.println("你输了");
//					break;
//			    case 3:
//					System.out.println("你赢了");
//					a++;
//					break;
//			}
//			break;
//		case 2:
//			switch(x+1) {
//			        case 1:
//					System.out.println("你赢了");
//					a++;
//					break;
//				    case 2:
//						System.out.println("平手");
//						break;
//				    case 3:
//						System.out.println("你输了");
//						break;
//			}
//			break;
//		case 3:
//			switch(x+1) {
//			        case 1:
//					System.out.println("你输了");
//					break;
//				    case 2:
//						System.out.println("你赢了");
//						a++;
//						break;
//				    case 3:
//						System.out.println("平手");
//						break;
//			}
//			break;
//		}
//		
//		System.out.println("是否继续（y/n）");
//		ans=sc.nextLine();
//		b++;
//	}while("y".equals(ans));
//	System.out.println("你的胜率是"+String.format("%.2f",(a/b)*100)+"%");
//	sc.close();
		
		//九九乘法表
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}

}
=======
package zy0409;

import java.util.Random;
import java.util.Scanner;

public class Dome {

	public static void main(String[] args) {
		
		//猜拳游戏
//	Scanner sc=new Scanner(System.in);
//	String ans,tem;
//	double a=0,b=0;
//	int num;
//	do {
//		Random in=new Random();//生成随机数
//		int x=in.nextInt(3);//取0~2之间的随机整数
//		System.out.println("选择出什么（1剪刀/2石头/3布）");
//		num=sc.nextInt();
//		tem=sc.nextLine();
//		switch(num) {
//		case 1:
//			switch(x+1) {
//			    case 1:
//				System.out.println("平手");
//				break;
//			    case 2:
//					System.out.println("你输了");
//					break;
//			    case 3:
//					System.out.println("你赢了");
//					a++;
//					break;
//			}
//			break;
//		case 2:
//			switch(x+1) {
//			        case 1:
//					System.out.println("你赢了");
//					a++;
//					break;
//				    case 2:
//						System.out.println("平手");
//						break;
//				    case 3:
//						System.out.println("你输了");
//						break;
//			}
//			break;
//		case 3:
//			switch(x+1) {
//			        case 1:
//					System.out.println("你输了");
//					break;
//				    case 2:
//						System.out.println("你赢了");
//						a++;
//						break;
//				    case 3:
//						System.out.println("平手");
//						break;
//			}
//			break;
//		}
//		
//		System.out.println("是否继续（y/n）");
//		ans=sc.nextLine();
//		b++;
//	}while("y".equals(ans));
//	System.out.println("你的胜率是"+String.format("%.2f",(a/b)*100)+"%");
//	sc.close();
		
		//九九乘法表
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}

}
>>>>>>> 8e570f696285452d8f2067c8ea39f5a45edc13c5
=======
package zy0409;

import java.util.Random;
import java.util.Scanner;

public class Dome {

	public static void main(String[] args) {
		
		//猜拳游戏
//	Scanner sc=new Scanner(System.in);
//	String ans,tem;
//	double a=0,b=0;
//	int num;
//	do {
//		Random in=new Random();//生成随机数
//		int x=in.nextInt(3);//取0~2之间的随机整数
//		System.out.println("选择出什么（1剪刀/2石头/3布）");
//		num=sc.nextInt();
//		tem=sc.nextLine();
//		switch(num) {
//		case 1:
//			switch(x+1) {
//			    case 1:
//				System.out.println("平手");
//				break;
//			    case 2:
//					System.out.println("你输了");
//					break;
//			    case 3:
//					System.out.println("你赢了");
//					a++;
//					break;
//			}
//			break;
//		case 2:
//			switch(x+1) {
//			        case 1:
//					System.out.println("你赢了");
//					a++;
//					break;
//				    case 2:
//						System.out.println("平手");
//						break;
//				    case 3:
//						System.out.println("你输了");
//						break;
//			}
//			break;
//		case 3:
//			switch(x+1) {
//			        case 1:
//					System.out.println("你输了");
//					break;
//				    case 2:
//						System.out.println("你赢了");
//						a++;
//						break;
//				    case 3:
//						System.out.println("平手");
//						break;
//			}
//			break;
//		}
//		
//		System.out.println("是否继续（y/n）");
//		ans=sc.nextLine();
//		b++;
//	}while("y".equals(ans));
//	System.out.println("你的胜率是"+String.format("%.2f",(a/b)*100)+"%");
//	sc.close();
		
		//九九乘法表
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}

}
>>>>>>> b1af9a46f99bb1263b267cf8e74e37a7ac4503c4

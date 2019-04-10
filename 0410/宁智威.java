package zy0410;

import java.util.Scanner;

public class Dome {

	public static void main(String[] args) {
		
//		2.打印:
//			1
//			12 
//			123
//			1234
//			12345
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		3.打印:
//			54321
//			4321
//			321
//			21
//			1
//		for(int i=5;i>0;i--) {
//			for(int j=i;j>0;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//4.打印:
//		12345
//		1234
//		123
//		12
//		1
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5+1-i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//5.打印:
//		1
//		21
//		321
//		4321
//		54321
//		for(int i=1;i<=5;i++) {
//			for(int j=i;j>0;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
//		6.打印空心菱形。
//		int trt;
//		Scanner scanner=new Scanner(System.in);
//		do {
//			System.out.print("请输入菱形行数（奇数）:");
//			trt=scanner.nextInt();
//		}while(trt%2==0);
//		int top=trt/2+1,bott=trt/2;
//		for(int i=1;i<=top;i++)
//        {
//            for(int j=1;j<=top-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=1;k<=2*i-1;k++)
//            {
//                if(k==1||k==2*i-1)
//                {
//                System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//        for(int i=bott;i>=1;i--)
//        {
//            for(int j=1;j<=top-i;j++)
//            {
//                System.out.print(" ");
//            }
//            for(int k=2*i-1;k>=1;k--)
//            {
//                if(k==1||k==2*i-1)
//                {
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
		
		//7.百元百鸡
//		int i,j,k;//i为母鸡 j为公鸡 k为小鸡
//		int l=1;
//		for(i=1;i<=20;i++) {
//			for(j=1;j<=33;j++) {
//				for(k=3;k<=100;k+=3) {
//					if(i*5+j*3+k/3==100&&i+j+k==100) {
//						System.out.println("方案"+l+":母鸡"+i+"只,"+"公鸡"+j+"只,"+"小鸡"+k+"只");
//						l++;
//					}
//				}
//				}
//			}
	}

}

package lzp3.com.day3;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//二重循环
//		Scanner scanner=new Scanner(System.in);
//		int sum=0;
//		for(int a=1;a<=3;a++) {
//			System.out.println("请输入第"+a+"班的成绩");
//			for(int j=1;j<=4;j++) {
//				System.out.print("请输入第"+j+"个学生的成绩");
//				int score=scanner.nextInt();
//				sum+=score;
//			}
//			System.out.println("第"+a+"个班的平均分是："+String.format("%.2f", sum/4.0));
//			sum=0;
//		}
		
		
//		Scanner scanner=new Scanner(System.in);
//			for(int i=1;i<=5;i++) {
//				for(int j=1;j<=i;j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
		
//		Scanner scanner=new Scanner(System.in);
//		int row;
//		System.out.println("请输入行数");
//		row=scanner.nextInt();
//			for(int i=1;i<=row;i++) {
//				for(int j=1;j<=2*i-1;j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
		
		
		
//		Scanner scanner=new Scanner(System.in);
//		int row;
//		System.out.print("请输入三角形的高度");
//		row=scanner.nextInt();
//		for(int i=row;i>=1;i--) {
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//等腰三角形*********
//		Scanner scanner=new Scanner(System.in);
//		int row;
//		System.out.print("请输入三角形的行数");
//		row=scanner.nextInt();
//		for(int i=1;i<=row;i--) {
//			for(int j=1;j<=2*row-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
	//作业
		//第二题
//		Scanner scanner =new Scanner(System.in);
//		for (int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		
		//第三题
//		Scanner scanner =new Scanner(System.in);
//		System.out.println("打印的数字为：");
//		for(int i=5;i>=1;i--) {
//			for(int j=i;j>=1;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		//第四题
//		Scanner scanner=new Scanner(System.in);
//		for(int i=5;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//第五题
//		Scanner scanner=new Scanner(System.in);
//		for(int i=1;i<=5;i++) {
//			for(int j=i;j>=1;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		//第六题
//		Scanner scanner =new Scanner(System.in);
//		int i,j,k;
//		do {
//			System.out.println("请输入一个奇数");
//			i=scanner.nextInt();
//		}while(i%2==0) ;
//		for(int a=1;a<=i;a++) {
//				if(a<i/2+1) {
//					for(j=1;j<=i/2+1-a;j++) {
//						System.out.print(" ");
//					}
//					for(k=1;k<=2*a-1;k++) {
//						if(k==1 || k==2*a-1) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						}
//					}
//				
//				}else {
//						for(j=1;j<=a-(i+1)/2;j++) {
//							System.out.print(" ");
//						}
//						for(k=1;k<=(i+1-a)*2-1;k++) {
//								if(k==1 || k==(i+1-a)*2-1) {
//									System.out.print("*");
//							}else {
//									System.out.print(" ");
//							}
//						}
//				}
//			System.out.println();
//		}
		
	//第七题
		
		Scanner scanner=new Scanner(System.in);
		int a,b,c;
		for(a=0;a<=20;a++) {
			for(b=0;b<=33;b++) {
				c=100-a-b;
				if(c%3==0) {
					if(a*5+b*3+c/3==100) {
						System.out.println("母鸡买"+a+"只,公鸡买"+b+"只,小鸡买"+c+"只");
					}
				}
			}
		}
	}
}



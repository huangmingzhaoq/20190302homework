package com.newer.demo1;
import java.util.Scanner;

public class Homework0410 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	

		
//		
//		2.打印:
//			1
//			12 
//			123
//			1234
//			12345
		
//		System.out.println("请输入行数:");
//		int a=scanner.nextInt();
//		
//		for(int i=1;i<=a;i++) {
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
		
//		System.out.println("请输入行数:");
//		int a=scanner.nextInt();
//		for(int i=0;i<=a;i++) {
//			for(int j=a-i;j>0;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		
//		4.打印:
//			12345
//			1234
//			123
//			12
//			1
		
//		System.out.println("请输入行数:");
//		int a=scanner.nextInt();
//		for(int i=0;i<=a;i++) {
//			for(int j=1;j<=a-i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
	
		
//		5.打印:
//			1
//			21
//			321
//			4321
//			54321
		
//		System.out.println("请输入行数:");
//		int a=scanner.nextInt();
//		for(int i=1;i<=a;i++) {
//			for(int j=i;j>0;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
//		6.打印空心菱形。
//	    *
//	   * *
//	  *   *
//	 *     *
//	  *   * 
//	   * *
//	    *
		
		
		
		
		
//		7.百元百鸡：母鸡5元一只，公鸡3元一只，小鸡1元3只，请输出100元买100只鸡的方案。
		
		for(int i=0;i<20;i++) {       //公鸡的上线
			for(int j=0;j<33;j++) {   //母鸡的上线
				int x=100-i-j;     //剩余的小鸡
				if((x%3==0)&&(i*5+j*3+x/3==100)) {
					System.out.println("公鸡："+i+"只 母鸡："+j+"只 小鸡:"+x+"只");
					
				}
			}
		}
		
	}

}

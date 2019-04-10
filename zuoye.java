package lesson7;

import java.util.Scanner;

public class zuoye {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
//		2.打印:
//			1
//			12 
//			123
//			1234
//			12345
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(""+j);
//			}
//			System.out.println();
//		}
//		3.打印:
//			54321
//			4321
//			321
//			21
//          1

//  	   for(int i=0;i<=5;i++) {
//			for(int j=5-i;j>=1;j--) {				
//				System.out.print(j);
//				
//			}
//			System.out.println();
//  	   }		
//		4.打印:
//		12345
//		1234
//		123
//		12
//		1
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=6-i;j++) {
//				System.out.print(""+j);
//			}
//			System.out.println();
//		}
		
//		5.打印:
//			1
//			21
//			321
//			4321
//			54321
		
//		for(int i=0;i<=5;i++) {
//		for(int j=i;j>=1;j--) {				
//		System.out.print(j);
//					
//		}
//	    System.out.println();
//	  	}
//		6.打印空心菱形。
//	    *
//	   * *
//	  *   *
//	 *     *
//	  *   * 
//	   * *
//	    *
//		for(int i=1;i<=4;i++)       {
//			for(int j=1;j<=4-1;j++) {
//			System.out.print(" ");
//			}
//			for(int j=1;j<=2*i-1;j++) {
//				if(j==1||j==2*i-1) {
//					System.out.println("*");
//				}else {
//					System.out.println(" ");
//				}
//			}
//			System.out.println();
//		    }
//		for(int i=1;i<=3;i++) {
//			for(int j=0;j<i;j++) {
//				System.out.println(" ");
//			}
//			for(int j=1;j<=2*(3-i);j++) {
//				if(j==1||j==2*(3-i)+1) {
//					System.out.println("*");
//				}else {
//					System.out.println(" ");
//				}
//				
//				
//			}
//		
//		}
//		System.out.println();
//		百元百鸡：母鸡5元一只，公鸡3元一只，小鸡1元3只，请输出100元买100只鸡的方案
//		int a,b,c,i = 0 ;
//		for(a = 0 ; a <= 100 ; a++)
//		for(b = 0 ; b <= 100 ; b ++)
//		for(c = 0 ; c <= 100 ; c = c +3)
//		if((a * 5 + b * 3 + c / 3)== 100 && a + b + c == 100){
//		i ++ ;	
//		System.out.println("方案" + i + ":"+"母鸡数为" + a + "公鸡数为" + b + "小鸡数为" + c+"");
//        }
	}
}

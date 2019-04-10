//import java.util.Scanner;
//public class ZY {
//
//	public static void main(String[] args) {
//		Scanner scanner=new Scanner(System.in);
//		int a=1,c=0,d=0,e;
//	while(a==1) {
//		double b=Math.random()*10%3;
//		b=(int)b;
//		System.out.println("选择出1剪刀，2石头，0布");
//		e=scanner.nextInt();
//		if(e>2) {
//			System.out.println("输入错误");
//			continue;
//		}
//		c++;
//		if(e==b) {
//			System.out.println("平局");
//		}
//		if((b==0&&e==2)||(b==1&&e==0)||(b==2&&e==1)) {
//			System.out.println("输了");
//		}
//		if((b==2&&e==0)||(b==0&&e==1)||(b==1&&e==2)) {
//			System.out.println("赢了");
//		}
//		System.out.println("是否继续游戏1继续2不玩了");
//		a=scanner.nextInt();
//		}
//	    System.out.println("游戏次数"+c);
		
//		for(int i=1;i<=9;i++) {
//			for(int b=1;b<=i;b++) {
//				System.out.println(b+"*"+i+"="+b*i+"\t");
//			}
//			System.out.println("");
//		}
//		
//
//	}
//
//}

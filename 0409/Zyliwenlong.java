import java.util.Scanner;

public class Zyliwenlong {
	public static void main(String[] agrs) {
		Scanner input=new Scanner(System.in);
//		1，用户选择出拳：1剪刀，2石头，3布。
//		2，计算机随机出拳
//		3，判断胜负平
//		4，询问是否继续
//		5，退出循环后统计用户的胜率~
//		int a=1,b;double c=(int)0,e=(int)0;
//		
//		while(a==1) {
//			double d=Math.random()*10%3;
//			d=(int)d;
//			System.out.println("选择出拳1剪刀，2石头，0布");
//			b=input.nextInt();
//			if(b>2) {
//				System.out.println("输入错误");
//				continue;
//			}
//			c++;
//			if(b==d) {
//				System.out.println("平局");
//				
//			}if((d==0&&b==2)||(d==1&&b==0)||(d==2&&b==1)) {
//				System.out.println("输了");
//				
//			}if((b==0&&d==2)||(b==1&&d==0)||(b==2&&d==1)){
//				System.out.println("赢了");
//				e++;
//			}System.out.println("是否继续1继续，不玩了输入任意数");
//			a=input.nextInt();
//		}double  f=e/c*100;
//		f=(int)f;
		System.out.println("胜率="+f+"%");
		//1.打印九九乘法表
//		1*1=1
//				1*2=2 2*2=4
//				1*3=3 2*3=6 3*3=9
//				1*4=4 2*4=8 3*4=12 4*4=16
//				1*5=5       
//				......
//				1*9=9 2*9=18...............9*9=81
//		int a=9,b,c;
//		for(b=1;b<=a;b++) {
//			for(c=1;c<=b;c++) {
//				System.out.print("\t"+c+"*"+b+"="+c*b);
//			}
//			System.out.print("\n");
//		}
	}
}

package newer.com.demo;
/**
 * ��ӡ�žų˷���
 * @author Administrator
 *��ȭ��Ϸ
 */
import java.util.Random;
import java.util.Scanner;
public class Homework {

	public static void main(String[] args) {
<<<<<<< HEAD
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+"*"+i+"="+(i*j)+"\t");
=======
		
		//用户选择出拳  1剪刀 2石头 3布，计算机随机出拳，判断胜负，询问是否继续，退出程序，统计胜率
		
//		Scanner input=new Scanner(System.in);
//		int cq;
//		int jcq;
//		String answer;
//		int sum=0;
//		int num=0;
//		double i=0;
//		do {
//			System.out.print("请出拳（ 1剪刀 2石头 3布）：");
//			cq=input.nextInt();
//			if(cq!=1 && cq!=2 && cq!=3) {
//				System.out.println("输入有误");
//				break;
//			}
//			jcq=(int)(Math.random()*3+1);
//			System.out.println("1--剪刀  2--石头  3--布\n您出的是"+cq+"计算机出的是"+jcq);	//可以加一句switch语句，或者写成方法
//			
//			if (cq==jcq) {
//				System.out.println("平局");
//			}else if(jcq==1&&cq==3 || jcq==2&&cq==1 || jcq==3&&cq==2) {
//				System.out.println("计算机赢了");
//			}else {
//				System.out.println("你赢了");
//				num++;
//			}
//			
//			sum++;
//			i=(num*1.0/sum*100);
//			System.out.print("是否继续（y/n）:");
//			answer=input.next();
//			if(!"y".equals(answer)&&!"n".equals(answer)) {
//				System.out.println("输入有误");
//				break;
//			}
//			}while("y".equals(answer));
//		System.out.println("一共进行了"+sum+"次，您一共赢了"+num+"次"+"\n您的胜率为"+i+"%");

		
		
		
		
		//1.打印九九乘法表
		
//		for (int i=1;i<=9;i++) {
//			for (int j=1;j<=i;j++) {
//				System.out.print(j+"*"+i+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		//--------------------------------------------------------------------------------
		
		//		2.打印:
		//			1
		//			12 
		//			123
		//			1234
		//			12345
		
//		for (int i=1;i<=5;i++) {
//			for (int j=1;j<=i;j++) {
//				System.out.print(j);
>>>>>>> 8e570f696285452d8f2067c8ea39f5a45edc13c5
//			}
//			System.out.println();
//		}
		int num,i;
		double count=0;
		String ans;
		Scanner input=new Scanner(System.in);
		
		for( i=1;;i++) {
			System.out.println("���û���ȭ��1������ 2��ʯͷ 3���� ");
			num=input.nextInt();
			if(num==1) {
				System.out.println("��������:����");
			}
			if(num==2) {
				System.out.println("��������:ʯͷ");
			}
			if(num==3) {
				System.out.println("��������:��");
			}
			
			Random a=new Random();
			int r=a.nextInt(3)+1;
			if(r==1) {
				System.out.println("�����������:����");
			}
			if(r==2) {
				System.out.println("�����������:ʯͷ");
			}
			if(r==3) {
				System.out.println("�����������:��");
			}
		
		if(num==1&&r==1) {
			System.out.println("���ƽ��");
		}	
		if(num==1&&r==2) {
			System.out.println("�����Ӯ�ˣ�������");
		}	
		if(num==1&&r==3) {
			System.out.println("��Ӯ�ˣ����������");
			count++;
		}	
		if(num==2&&r==1) {
			System.out.println("��Ӯ�ˣ����������");
			count++;
		}
		if(num==2&&r==2) {
			System.out.println("���ƽ��");
		}
		if(num==2&&r==3) {
			System.out.println("�����Ӯ�ˣ�������");
		}
		if(num==3&&r==3) {
			System.out.println("���ƽ��");
		}
		if(num==3&&r==2) {
			System.out.println("��Ӯ�ˣ����������");
			count++;
		}
		if(num==3&&r==1) {
			System.out.println("�����Ӯ�ˣ�������");
		}
		System.out.println("�Ƿ����:��(y) ��(n)");
		ans=input.next();
		if("y".equals(ans)) {
			continue;
		}else {
			break;
		}
		
		
<<<<<<< HEAD
=======
		
		//		3.打印:
		//			54321
		//			4321
		//			321
		//			21
		//			1
		
//		for (int i=5;i>=1;i--) {
//			for (int j=i;j>=1;j--) {
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
		
//		for (int i=5;i>=1;i--) {
//			for (int j=1;j<=i;j++) {
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
		
//		for (int i=1;i<=5;i++) {
//			for (int j=i;j>=1;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		//		6.打印空心菱形。
		//					行	       星	
		//	    *			1      1
		//	   * *			2      3
		//	  *   *			3      5
		//	 *     *		4	4  7	1
		//	  *   * 		5	3  5	2
		//	   * *			6	2  3	3
		//	    *			7	1  1	4
		
//		Scanner input=new Scanner(System.in);
//		int i,j,k;
//		do{
//			System.out.print("请输入一个奇数：");
//			i = input.nextInt();
//		}while(i%2==0);
//		
//		for (int h=1;h<=i;h++) {
//			if (h<=i/2+1) {
//				for(j=1;j<=i/2+1-h;j++) {
//					System.out.print(" ");
//				}
//				for(k=1;k<=2*h-1;k++) {
//					if(k==1||k==2*h-1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}else {
//				for(j=1;j<=h-(i+1)/2;j++) {
//					System.out.print(" ");
//				}
//				for(k=1;k<=(i+1-h)*2-1;k++) {
//					if(k==1||k==(i+1-h)*2-1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}
	
	
		
		//7.百元百鸡：母鸡5元一只，公鸡3元一只，小鸡1元3只，请输出100元买100只鸡的方案。
		//母鸡	0-20	公鸡 0-33
		
//		int num5;
//		int num3;
//		int num1;
//		for (num5=0;num5<=20;num5++) {
//			for(num3=0;num3<=33;num3++) {
//				num1=100-num5-num3;
//				if(num1%3==0) {
//					if(num5*5+num3*3+num1/3==100) {
//						System.out.println("母鸡买"+num5+"只，公鸡买"+num3+"只，小鸡买"+num1+"只");
//					}
//				}
//			}
//		}
		
>>>>>>> 8e570f696285452d8f2067c8ea39f5a45edc13c5
	}
		System.out.println("���ܹ�ʤ��"+(int)count+"��");
		System.out.println("ʤ����"+count/i*100+"%");
	}
}

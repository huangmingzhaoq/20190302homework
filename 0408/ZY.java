//import java.util.Scanner;
//
//public class ZY {
//
//	public static void main(String[] args) {
//		Scanner input=new Scanner(System.in);
		//��ҵ1
//		int a=1,b=0;
//		while(a<=100) {
//			if(a%2==1) {
//				b=a+b;
//			}
//			a++;
//		}
//		System.out.print("������Ϊ:"+b);
		
//		do {
//			if(a%2==1) {
//				b=a+b;
//			}
//			a++;
//		}
//		while(a<=100);
//		System.out.println("������Ϊ:"+b);
		
//		for(a=1;a<=100;a++) {
//			if(a%2==1){
//			b=a+b;
//			}
//		}
//			System.out.println("������Ϊ:"+b);
		
//		int a,b=0,num=0;
//		System.out.println("������һ������:");
//		a=input.nextInt();
//		while(num<=a) {
//			b+=num;
//			num++;
//		}
//		System.out.println("������Ϊ:"+b);
		
//		int num,a=1,b=1;
//		System.out.println("������һ��������:");
//		num=input.nextInt();
//		while(num>=a) {
//			b=b*a;
//			a++;
//		}
//		System.out.println("���Ϊ:"+b);
		
//		int a,b;
//		do {
//			System.out.println("������һ������:");
//			a=input.nextInt();
//			System.out.println("�Ƿ��������1��2����");
//			b=input.nextInt();	
//		}while(b==1);
//		System.out.println("�������");
		
//		int b,c=0;
//		double a=Math.random()*100;
//		a=(int)a;
//		do {
//			System.out.println("������һ������:");
//			b=input.nextInt();
//			if(a==b) {
//				System.out.println("��ϲ�㣬�����ˣ�");
//			}
//			if(a<b) {
//				System.out.println("�´���");
//			}
//			if(a>b) {
//				System.out.println("��С��");
//			}
//			c++;
//		}while(b!=a);
//		if(c<=5) {
//			System.out.println("��������!");
//		}
//		if(c>5&&c<=10) {
//			System.out.println("����һ��");
//		}
//		if(c>10) {
//			System.out.println("�����ܲ�");
//		}
		
//		int a=1,b=1,c=0;
//		while(a<=10) {
//			b=a*b;
//			c=b+c;
//			a++;
//		}
//		System.out.println("��Ϊ:"+c);
		
		
//		for(int d=100;d<1000;d++) {			
//			int a=d/100;
//			int b=(d-a*100)/10;
//			int c=d%10;
//			if(a*a*a+b*b*b+c*c*c==d) {
//				System.out.println("ˮ�ɻ���:"+d);
//		  }
//		}
//
//	}
//
//}

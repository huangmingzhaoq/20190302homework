package demo;

import java.util.*;

public class lesson4 {

	private static Scanner type;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ������
		// while����
//		int i=0;int sum=0;
//		while(i<=100) {
//			if(i%2==0) {
//				i++;
//			}
//			else {sum+=i;i++;}
//		
//		}
//		System.out.println("100����������Ϊ��"+sum);
		// do while����
//		int i = 0, sum = 0;
//		do {
//			if (i % 2 == 0) {
//				i++;
//			} else {
//				sum += i;
//				i++;
//			}
//		} while (i <= 100);
//		System.out.println("100����������Ϊ��"+sum);
		// for����
//		int sum = 0;
//		for (int i = 0; i <= 100; i++) {
//			if (i % 2 != 0) {
//				sum += i;
//			}
//			
//		}
//		System.out.println("100����������Ϊ��" + sum);

		// ������
//		Scanner num = new Scanner(System.in);
//		System.out.println("����һ������");
//		int a = num.nextInt();
//		int sum = 0;
//		for (int i = 0; i <= a; i++) {
//			sum = i + sum;
//		}
//		System.out.println("1���������ĺ�Ϊ" + sum);

		// �ڰ���
//		Scanner num = new Scanner(System.in);
//		System.out.println("����һ������");
//		int a = num.nextInt();
//		int pro = 1;
//		for (int i = 1; i <= a; i++) {
//			pro = i * pro;
//		}
//		System.out.println("1���������Ļ�Ϊ" + pro);
		// �ھ���
//	String b ;int a;
//		Scanner num = new Scanner(System.in);
//		do {
//		System.out.println("������һ������");
//		a=num.nextInt();
//		System.out.println(a);
//		
//		System.out.println("�Ƿ�������루y/n��");
//		
//		b=num.next();
//		
//}while("y".equals(b)
//		);
//		
//System.out.println("�������");

		// ��ʮ��

//		Scanner input=new Scanner(System.in);
//		System.out.print("���һ��������");
//		int n=input.nextInt();
//		int y=(int)(Math.random()*100);
//		int count=1;
//		while (n!=y) {		
//			if (n>y) {
//				System.out.println("�´���");
//			}else if(n<y) {
//				System.out.println("��С��");
//			}
//			System.out.print("�������һ������");
//			n=input.nextInt();
//			count++;
//		}
//		System.out.println("�����ˣ���һ������"+count+"��");
//		
//		if (count<=5) {
//			System.out.println("����5�����ڲ���");
//		}else if(count>6 && count<=10) {
//			System.out.println("����6-10�����ڲ���");
//		}else {
//			System.out.println("����10�����ϲ���");

		// ��ʮһ��
//		int sum=1;
//		int sum1=0;
//		for(int a=1;a<=10;a++) {
//			sum*=a;
//			sum1+=sum;
//		}
//		System.out.println("1!+2!+3!+...+10!�ĺ�Ϊ:"+sum1);

		// ��ʮ����
//		for(int a = 100;a<=999&&a>=100;a++) {
//		int x=a/100;
//		int y=a/10%10;
//		int z=a%10;
//		int sum;
//		sum = x*x*x+y*y*y+z*z*z;
//			if(sum==a) {
//				System.out.println(sum);
//			}
//		}
	}
}

package lzp.com.day1;

import java.util.Scanner;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i=1;
//		 while(i<=200) {
//			 if(i%5==0) {
//				 System.out.println(i);
//			 }
//			 i++;
//		 }
	//��ҵ
	//������
		//while �ṹ
//		int i=1;
//		int sum=0;
//		while (i<=100)
//		{
//			sum=sum+i;
//			i=i+2;
//		}
//		System.out.println("1-100���ڵ�������Ϊ��"+sum);
	//do..while�ṹ
//		int i=1;
//		int sum=0;
//		do {
//			sum=sum+i;
//			i=i+2;
//		}while(i<=100);
//		System.out.println("1-100���ڵ�������Ϊ��"+sum);
	//for�ṹ
//		int sum=0;
//		for(int i=1;i<=100;i=i+2) {
//			sum=sum+i;
//		}
//		System.out.println("1-100���ڵ�������Ϊ��"+sum);
	//������
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("������һ������");
//		int a=scanner.nextInt();
//		int sum=0;
//		if(a>=1) {
//			for(int i=1;i<=a;i++) {
//				sum=sum+i;
//			}
//		}else {
//			for(int i=1;i>=a;i--) {
//				sum=sum+i;
//			}
//		}
//		System.out.println("��Ϊ��"+sum);
	//�ڰ���
//		Scanner scanner=new Scanner(System.in);
//		System.out.println("������һ����������");
//		int a=scanner.nextInt();
//		int num=1;
//		if(a>0) {
//			for(int i=1;i<=a;i++) {
//				num=num*i;
//			}
//			System.out.println(a+"�Ľ׳���:"+num);
//		}else {
//			System.out.println("�����������������");
//		}
	//�ھ���
//		Scanner scanner=new Scanner(System.in);
//		String answer;
//		int a;
//		do {
//			System.out.println("������һ������");
//			a=scanner.nextInt();
//			System.out.println("���� Ϊ��"+a+"\n");
//			System.out.print("�Ƿ�Ҫ�������룿(y/n):");
//			answer=scanner.next();
//		}while("y".equals(answer));
//		System.out.println("�˳�");
	//��ʮ��
//		Scanner input=new Scanner(System.in);
//		System.out.print("���һ��������");
//		int n=input.nextInt();
//		int count=1;
//		while (n!=50) {		//����Ҫ�µ�������50
//			if (n>50) {
//				System.out.println("�´���");
//			}else if(n<50) {
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
//		}
	//��ʮһ��
//		int num=1;
//		int sum=0;
//		for (int i=1;i<=10;i++) {
//			for(int j=1;j<=i;j++) {
//				num=num*j;
//			}
//			sum=sum+num;
//			num=1;
//		}
//		System.out.println(sum);
	//��ʮ����
//		for(int a=100;a<1000;a++) {
//			int x=a%10;
//			int y=a/10%10;
//			int z=a/100;
//			if(x*x*x+y*y*y+z*z*z==a) {
//				System.out.println(a);
//			}
//		}
	}
}

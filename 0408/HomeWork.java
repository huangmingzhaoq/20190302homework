package com.niuer.homework;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		//  6.��1-100���ڵ������͡�Ҫ����while�ṹ��do...while\for�ṹ���ַ�����
		
		//while�ṹ
		
//		int i = 1;
//		int sum=0;
//		while (i<=100) {
//			sum+=i;
//			i+=2;
//		}
//		System.out.println("1-100���ڵ�������Ϊ��"+sum);
		
		//do..while�ṹ
		
//		int i = 1;
//		int sum = 0;
//		do {
//			sum+=i;
//			i+=2;
//		}while (i<=100);
//		System.out.println("1-100���ڵ�������Ϊ��"+sum);
		
		//for �ṹ
		
//		int sum=0;
//		for(int i=1;i<=100;i+=2) {
//			sum+=i;
//		}
//		System.out.println("1-100���ڵ�������Ϊ��"+sum);
		
		
		//7.�����û�����һ�������������1���������ĺͣ��磺����50�������1+2+3����50�ĺ�
		
//		Scanner input=new Scanner(System.in);
//		System.out.print("������һ��������");
//		int n=input.nextInt();
//		int sum=0;
//		if (n>=1) {
//			for (int i=1;i<=n;i++) {
//				sum+=i;
//			}
//		}else {
//			for (int i=1;i>=n;i--) {
//				sum+=i;
//			}
//		}
//		System.out.println("��1�ӵ�"+n+"�ĺ�Ϊ��"+sum);
		
		
		//8.�����û�����һ������������������Ľ׳ˣ��磺���磺����5�������5*4*3*2*1=120��
		
//		Scanner input=new Scanner(System.in);
//		System.out.print("������һ����������");
//		int n=input.nextInt();
//		int mult =1;
//		if(n>0) {
//			for (int i =1;i<=n;i++) {
//				mult*=i;
//			}
//			System.out.println(n+"�Ľ׳���:"+mult);
//		}else {
//			System.out.println("��������������������");
//		}
		
		
		//9.���û�����һ�����֣�����ӡ�����û��Ƿ�Ҫ�������룿Ҫ��Ҫ������������䣬�����˳���Ҫ����do..while�ṹ��
		
//		Scanner input=new Scanner(System.in);
//		String anwser;
//		int n;
//		do {
//			System.out.print("������һ��������");
//			n=input.nextInt();
//			System.out.println("�ո����������Ϊ��"+n+"\n");
//			System.out.print("�Ƿ�������룿��y/n��:");
//			anwser = input.next();
//		}while(!"n".equals(anwser));
//		System.out.println("�������");
		
		
		//	10.��������Ϸ��Ҫ���û�����һ��0-99֮�������.��ʾ���´��ˣ���С�ˣ��ٴ���ʾ��������ֱ���������֣��˳�ѭ����
		//		�������5�����ڲ��У�6-10�β��С�10�����ϲ���
		
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
//		}
		
		
		
		//11.��:1!+2!+3!+......+10!   10!=1*2*3*4*5*6*7*8*9*10
		
//		int mult=1;
//		int sum=0;
//		for (int i=1;i<=10;i++) {
//			for (int j=1;j<=i;j++) {
//				mult*=j;
//			}
//			sum+=mult;
//			mult=1;
//		}
//		System.out.println(sum);
		
		
		//12.���1000���ڵ�ˮ�ɻ�����˵�������һ����λ����ÿλ���ֵ������͵��ڸ�������Ϊˮ�ɻ�������153=1*1*1+5*5*5+3*3*3
		
//		for (int a=100;a<1000 ;a++ ){
//			int ge = a%10;
//			int shi = a/10%10;
//			int bai = a/100;
//			if (ge*ge*ge+shi*shi*shi+bai*bai*bai==a){
//				System.out.println(a);
//			}
//		} 
		
		
	}

}

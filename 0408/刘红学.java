package com.niuer.bianl;

import java.util.Scanner;

public class Class4 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
//	6.��1-100���ڵ������͡�
//	int sum = 0;
//	for(int i =1;i<=100;i++) {
//		if(i%2==1) {
//			sum+=i;
//		}
//	}System.out.println("������Ϊ"+sum);
	
//	int i=1;
//	int sum = 0;
//	while(i<=100) {
//		if(i%2==1) {
//			sum+=i;
//		}i++;
//	}System.out.println(sum);
	
//	int i=1;
//	int sum = 0;
//	do {
//		if(i%2==1) {
//			sum+=i;}
//			i++;
//	}while(i<=100);
//	System.out.println(sum);
//	
//	7.�����û�����һ�������������1���������ĺ�
//	int sum = 0;
//	System.out.println("������һ������");
//	int a = sc.nextInt();
//	for(int i=1;i<=a;i++) {
//		sum+=i;
//	}System.out.println("��Ϊ"+sum);
	
//	8.�����û�����һ������������������Ľ׳�
//	System.out.println("������һ������");
//	int a = sc.nextInt();
//	int sum =a;
//	for(int i =a-1;i>0;i--) {
//		sum*=i;
//	}System.out.println("��Ϊ"+sum);
	
//	9.���û�����һ�����֣�����ӡ�����û��Ƿ�Ҫ�������룿Ҫ��Ҫ������������䣬�����˳���
//	Ҫ����do..while�ṹ��
//	String b ;
//	do {
//	System.out.println("������һ������");
//	int a = sc.nextInt();
//	System.out.println(a);
//	System.out.println("�Ƿ��������");
//	 b = sc.next();
//	}while("����".equals(b));

//	10.��������Ϸ
//	Ҫ���û�����һ��0-99֮�������.��ʾ���´��ˣ���С�ˣ��ٴ���ʾ��������ֱ���������֣��˳�ѭ����
//	�������5�����ڲ��У�6-10�β��С�10�����ϲ���
//	int num = (int) (Math.random()*100);
//	int a;
//	int count=0;
//	do {
//		System.out.println("������0~99֮�������");
//		 a = sc.nextInt();
//		if(a>num) {
//			System.out.println("�´���");
//		}else	System.out.println("��С��");
//		count++;
//	}while(a!=num);
//	System.out.println("�����Ϊ"+num);
//	System.out.println(count+"�β���");
	
//	11.��:1!+2!+3!+......+10!
//	10!=1*2*3*4*5*6*7*8*9*10
//	int sum = 1;
//	int b =0;
//	for(int i=1;i<=10;i++) {
//		for(int a =1;a<=i;a++) {
//			sum*=a;
//		}
//		b+=sum;
//		sum=1;
//	}System.out.println("��Ϊ"+b);
//	
	
//	12.���1000���ڵ�ˮ�ɻ���
//	˵�������һ����λ����ÿλ���ֵ������͵��ڸ�������Ϊˮ�ɻ�������153=1*1*1+5*5*5+3*3*3
//	 for(int a=1;a<10;a++) {
//	     for(int b=0;b<10;b++) {
//	        for(int c=0;c<10;c++) {
//	            if((a*100+b*10+c)==(a*a*a+b*b*b+c*c*c))
//	            	System.out.println(a*100+b*10+c+"="+a+"*"+a+"*"+a+"+"+b+"*"+b+"*"+b+"+"+c+"*"+c+"*"+c);
//	        }
//	        }
//	     }
}
}
package com.newer.deom;

import java.util.Scanner;

import java.util.Random;

public class HoemWorkTjm {

	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		/*6.��1-100���ڵ������͡�
		Ҫ����while�ṹ��do...while\for�ṹ���ַ�����*/
		
//		int i = 0,sum = 0;;
//		while(i<100) {
//			if(i%2==1) {
//				System.out.println(i);
//				sum=sum+i;
//			}
//			i++;
//			
//		}
//		System.out.println("������:"+sum);
		
//		int i=0,sum=0;
//		do {
//			if(i%2==1) {
//				System.out.println(i);
//				sum+=i;
//			}
//			i++;
//		}while(i<100);
//		System.out.println("������:"+sum);
//		int sum=0;
//		for(int i=0;i<100;i++) {
//			if(i%2==1) {
//			System.out.println(i);
//			sum+=i;
//		}
//			}
//		System.out.println("������:"+sum);
		
		//7.�����û�����һ�������������1���������ĺͣ��磺����50�������1+2+3����50�ĺ͡�
//			int integer,sum=0,i=0;
//		System.out.println("������һ������:");
//		integer = input.nextInt();
//		while(i<=integer) {
//			
//			System.out.println(i);
//			sum+=i;
//			i++;
//		}
//		System.out.println("������Ϊ:"+sum);
		
		//8.�����û�����һ������������������Ľ׳ˣ��磺���磺����5�������5*4*3*2*1=120��
		
//		int integer,sum=0,i=1;
//		System.out.println("������һ������:");
//		integer = input.nextInt();
//		sum=integer;
//		while(i<integer) {
//			System.out.print(i+"*");
//			sum=sum*(integer-i);
//			i++;
//		}
//		System.out.println(integer+"=�׳�:"+sum);
		
//		9.���û�����һ�����֣�����ӡ�����û��Ƿ�Ҫ�������룿Ҫ��Ҫ������������䣬�����˳���
//		Ҫ����do..while�ṹ��
		
//		int integer;
//		String ans ="y";
//		do {
//			System.out.print("������һ������:");
//			integer = input.nextInt();
//			System.out.println(integer);
//			System.out.print("�Ƿ����:(y/n)");
//			ans = input.next();
//		}while("y".equals(ans));
//			System.out.println("�������!!");
		
		/*10.��������Ϸ
		Ҫ���û�����һ��0-99֮�������.��ʾ���´��ˣ���С�ˣ�
		�ٴ���ʾ��������
		ֱ���������֣��˳�ѭ����
		�������5�����ڲ��У�6-10�β��С�10�����ϲ���*/

		//���������
//				double num=Math.random()*100;
//				System.out.println(num);
//				Random rd = new Random();
//				int num = rd.nextInt(100);
//				int i = 0,count=0;
//			do {
//				System.out.print("������0~99�м������");
//				i = input.nextInt();
//				if (i > num) {
//					System.out.println("���ˣ�����������");
//				} else if (i < num) {
//					System.out.println("С�ˣ�����������");
//				} else if(i==num){
//					System.out.println("��ϲ�㣬�¶���");
//				}
//				count++;
//			}while(num != i);	
//			if(count<=5) {
//				System.out.println("5�����ڲ���");
//			}else if(count>5&&count<10) {
//				System.out.println("6~10�����ڲ���");
//			}else {
//				System.out.println("10�����ϲ���");
//			}
		
		//10!=1*2*3*4*5*6*7*8*9*10
//		int integer,sum=0,i,a=1;
//		System.out.println("������һ������:");
//		integer = input.nextInt();
//		
//		for(i=1;i<=integer;i++) {
//				a=a*i;
//				sum=sum+a;
//		}
//		System.out.println(integer+":�Ľ׳�=:"+sum);
		
		//11.��:1!+2!+3!+......+10!
		
//		int integer,sum=0,i,a=0;
//		System.out.println("������һ������:");
//		integer = input.nextInt();
//		
//		for(i=1;i<=integer;i++) {
//				a=a+i;
//				sum=sum+a;
//		}
//		System.out.println(integer+":�ĺ�="+sum);
		
		/*12.���1000���ڵ�ˮ�ɻ���
		˵�������һ����λ����ÿλ���ֵ������͵��ڸ�������Ϊˮ�ɻ�������153=1*1*1+5*5*5+3*3*3*/
		
//		
//			for(int i=100;i<1000;i++) {
//				int a = i/100;
//				int b = i/10%10;
//				int c = i%10;
//				if(i==(a*a*a+b*b*b+c*c*c)) {
//					System.out.println("ˮ�ɻ�����:"+i+"="+a+"*"+a+"*"+a+"+"+b+"*"+b+"*"+b+"+"+c+"*"+c+"*"+c);
//				}
//			}
			double num=Math.random()*100;
			int num1=(int)num;
			int a = 0,coune=0;
			do {
				System.out.println("������һ������");
				 a = input.nextInt();
				if(a>num1) {
					System.out.println("�´���");
				}else if(a<num1){
					System.out.println("��С��");
				}else {
					System.out.println("�¶���");
				}
				coune++;
				 
			}while(num1!=a);
			if(coune<5) {
				System.out.println("������!!");
			}else if(coune>5&&coune<10) {
				System.out.println("������!!");
			}else {
				System.out.println("��������!!");
			}
			
			
	}
}

package com.aqi.demo;

import java.util.Scanner;

public class Jishuhe {

	public static void main(String[] args) {
//		6.��1-100���ڵ������͡�
//		Ҫ����while�ṹ��do...while\for�ṹ���ַ�����
//		int sum=0;
//		for(int i=1;i<=100;i++) {
//			if(i%2!=0) {
//				sum=sum+i;
//			}
//		}
//		System.out.println("1��100�������ͣ�"+sum);
//		int i=1;
//		while(i<=100) {
//			if(i%2!=0) {
//				sum=sum+i;
//			}
//			i++;
//		}
//		System.out.println("1��100�������ͣ�"+sum);
//		int i=1;
//		do {			
//			if(i%2!=0) {
//				sum=sum+i;}
//			i++;
//		}while(i<=100);
//		System.out.println("1��100�������ͣ�"+sum);
//		7.�����û�����һ�������������1���������ĺͣ��磺����50�������1+2+3����50�ĺ͡�
//		Scanner input=new Scanner(System.in);
//		int sum=0;
//		System.out.println("����һ��������");
//		int a=input.nextInt();
//	    for(int i=1;i<=a;i++) {
//	    	sum=sum+i;
//	    }
//        System.out.println("1�����������֮�����������ĺͣ�"+sum);
//        input.close();
//		8.�����û�����һ������������������Ľ׳ˣ��磺���磺����5�������5*4*3*2*1=120��
//		Scanner input=new Scanner(System.in);
//		int JieCheng=1;
//		System.out.println("����һ����������");
//		int a=input.nextInt();
//        for(int i=1;i<=a;i++) {
//        	JieCheng=i*JieCheng;
//        }
//        System.out.println("������������Ľ׳ˣ�"+(JieCheng));
//        input.close();
//		9.���û�����һ�����֣�����ӡ�����û��Ƿ�Ҫ�������룿Ҫ��Ҫ������������䣬�����˳���
//		Ҫ����do..while�ṹ��
//		Scanner input=new Scanner(System.in);
//        System.out.println("����һ������");
//        int a=input.nextInt();
//        System.out.println("�������"+a);
//        System.out.println("�Ƿ��������(y/n)");        
//        String JiXu=input.next();
//        
//        int i=1;
//        do {
//        	if("y".equals(JiXu)) {
//        		System.out.println("���������"+(i+1)+"����");
//        	}
//        	else {
//        		break;
//        	}
//        	i++;
//        	a=input.nextInt();
//        }while(i>=1);
//        input.close();
//		10.��������Ϸ
//		Ҫ���û�����һ��0-99֮�������.��ʾ���´��ˣ���С�ˣ�
//		�ٴ���ʾ��������
//		ֱ���������֣��˳�ѭ����
//		�������5�����ڲ��У�6-10�β��С�10�����ϲ���
//		Scanner input=new Scanner(System.in);
//		System.out.println("����һ��0��99֮�������");
//		int a=input.nextInt();
//		int Jieguo=(int)(Math.random()*99+1);
//		int count=1;
//		while(true){
//			if(a>Jieguo) {
//				System.out.println("�´���");}
//			if(a<Jieguo) {
//				System.out.println("��С��");
//			}
//			if(a==Jieguo) {
//				System.out.println("��ϲ��");
//				if(count<=5) {
//					System.out.println("����");
//				}
//				else if(count>5&&count<=10) {
//					System.out.println("һ��");
//				}
//				else if(count>10) {
//					System.out.println("��");
//				}
//			}
//			System.out.println("�ٴ���������");
//			a=input.nextInt();
//			count++;
//		}
//		11.��:1!+2!+3!+......+10!
//		10!=1*2*3*4*5*6*7*8*9*10
//		int chengJi=1;
//		int sum=0;
//		for(int i=1;i<=10;i++) {
//			chengJi=chengJi*i;
//			sum=sum+chengJi;
//		}
//		System.out.println("1��10�Ľ׳˺ͣ�"+sum);
//		12.���1000���ڵ�ˮ�ɻ���
//		˵�������һ����λ����ÿλ���ֵ������͵��ڸ�������Ϊˮ�ɻ�������153=1*1*1+5*5*5+3*3*3
//		System.out.println("���1000���ڵ�ˮ�ɻ�����");
//		for(int i=100;i<1000;i++) {
//			int a=i/100;
//			int b=i/10%10;
//			int c=i%10;
//			if(a*a*a+b*b*b+c*c*c==i) {
//				System.out.print(i+" ");
//			}
//		}
	}
}

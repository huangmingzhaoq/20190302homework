package com.niuer.homework;

import java.util.Scanner;

public class HomeWork {

	public static void main(String[] args) {
		
		//�û�ѡ���ȭ  1���� 2ʯͷ 3��������������ȭ���ж�ʤ����ѯ���Ƿ�������˳�����ͳ��ʤ��
		
//		Scanner input=new Scanner(System.in);
//		int cq;
//		int jcq;
//		String answer;
//		int sum=0;
//		int num=0;
//		double i=0;
//		do {
//			System.out.print("���ȭ�� 1���� 2ʯͷ 3������");
//			cq=input.nextInt();
//			if(cq!=1 && cq!=2 && cq!=3) {
//				System.out.println("��������");
//				break;
//			}
//			jcq=(int)(Math.random()*3+1);
//			System.out.println("1--����  2--ʯͷ  3--��\n��������"+cq+"�����������"+jcq);
//			
//			if (cq==jcq) {
//				System.out.println("ƽ��");
//			}else if(jcq==1&&cq==3 || jcq==2&&cq==1 || jcq==3&&cq==2) {
//				System.out.println("�����Ӯ��");
//			}else {
//				System.out.println("��Ӯ��");
//				num++;
//			}
//			
//			sum++;
//			i=(num*1.0/sum*100);
//			System.out.print("�Ƿ������y/n��:");
//			answer=input.next();
//			if(!"y".equals(answer)&&!"n".equals(answer)) {
//				System.out.println("��������");
//				break;
//			}
//			}while("y".equals(answer));
//		System.out.println("һ��������"+sum+"�Σ���һ��Ӯ��"+num+"��"+"\n����ʤ��Ϊ"+i+"%");

		
		
		
		
		//1.��ӡ�žų˷���
		
//		for (int i=1;i<=9;i++) {
//			for (int j=1;j<=i;j++) {
//				System.out.print(j+"*"+i+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		//--------------------------------------------------------------------------------
		
		//		2.��ӡ:
		//			1
		//			12 
		//			123
		//			1234
		//			12345
		
//		for (int i=1;i<=5;i++) {
//			for (int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		
		//		3.��ӡ:
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
		
		
		
		//		4.��ӡ:
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
		
		
		
		//		5.��ӡ:
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
		
		
		//		6.��ӡ�������Ρ�
		//					��	       ��	
		//	    *			1      1
		//	   * *			2      3
		//	  *   *			3      5
		//	 *     *		4	4  7
		//	  *   * 		5	3  5
		//	   * *			6	2  3
		//	    *			7	1  1
		
//		int i,j,k;
//		
//		for (i=1;i<=7;i++) {
//			if (i<4) {
//				for(j=4-i;j>=1;j--) {
//					System.out.print(" ");
//				}
//				for(k=1;k<=2*i-1;k++) {
//					if(k==1||k==2*i-1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}else {
//				for(j=1;j<=i-4;j++) {
//					System.out.print(" ");
//				}
//				for(k=1;k<=(8-i)*2-1;k++) {
//					if(k==1||k==(8-i)*2-1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}
	
	
		
		//7.��Ԫ�ټ���ĸ��5Ԫһֻ������3Ԫһֻ��С��1Ԫ3ֻ�������100Ԫ��100ֻ���ķ�����
		//ĸ��	0-20	���� 0-33
		
//		int num5;
//		int num3;
//		int num1;
//		for (num5=0;num5<=20;num5++) {
//			for(num3=0;num3<=33;num3++) {
//				num1=100-num5-num3;
//				if(num1%3==0) {
//					if(num5*5+num3*3+num1/3==100) {
//						System.out.println("ĸ����"+num5+"ֻ��������"+num3+"ֻ��С����"+num1+"ֻ");
//					}
//				}
//			}
//		}
		
	
	}

}

package com.niuer.bianl;

public class Class6 {
public static void main(String[] args) {
//	2.��ӡ:
//		1
//		12 
//		123
//		1234
//		12345
//	for(int a =1;a<=5;a++) {
//		for(int b=1;b<=a;b++) {
//			System.out.print(b);
//		}System.out.println();
//	}
	
//	3.��ӡ:
//		54321	1	5
//		4321	2	4
//		321		3	3
//		21		4	2
//		1		5	1
//	for(int a =5;a>0;a--) {
//		for(int b=a;b>=1;b--) {
//			System.out.print(b);
//		}System.out.println();
//	}
	
//	4.��ӡ:
//		12345
//		1234
//		123
//		12
//		1
//	for(int a =5;a>0;a--) {
//		for(int b=1;b<=a;b++) {
//			System.out.print(b);
//		}System.out.println();
//	}
	

//	5.��ӡ:
//	1
//	21
//	321
//	4321
//	54321
//	for(int a =1;a<=5;a++) {
//		for(int b=a;b>=1;b--) {
//			System.out.print(b);
//		}System.out.println();
//	}
	
//	6.��ӡ�������Ρ�
//		    *		4	1	1
//		   * *		3	2	3
//		  *   *		2	3	5
//		 *     *	1	4	7
//		  *   * 
//		   * *
//		    *
//	for(int i = 0;i<5;i++){	
//		for(int j = 0;j < (5-1-i);j++){
//			System.out.print(" ");
//		}
//		for(int k = 0;k < (2*i+1);k++){	
//			if(i == 0){
//				System.out.print("*");
//			}else if(k == 0||k == (2*i)){
//				System.out.print("*");
//			}else{
//				System.out.print(" ");
//			}
//		}
//		System.out.println();
//	}
//	for(int i = 0;i < 4;i++){	
//		for(int j = 0;j < (i+1);j++){
//			System.out.print(" ");
//		}
//		for(int k = 0;k < 2*(4-i)-1;k++){	
//			if(i == 3){
//				System.out.print("*");
//			}else if(k == 0||k == 2*(3-i)){
//				System.out.print("*");
//			}else{
//				System.out.print(" ");
//			}
//		}
//		System.out.println();
//		}
	
//	7.��Ԫ�ټ���ĸ��5Ԫһֻ������3Ԫһֻ��С��1Ԫ3ֻ�������100Ԫ��100ֻ���ķ�����
//	int a,b,c;
//	for(a=1;a<=20;a++) {
//		for(b=1;b<=33;b++) {
//			if(a*5+b*3<=100) {
//				c=3*(100-(a*5+b*3));
//				if(a+b+c==100) {
//					System.out.println("ĸ��Ϊ"+a+"����Ϊ"+b+"С��Ϊ"+c);
//				}
//			}
//		}
//	}
}
}
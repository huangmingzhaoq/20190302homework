package lzp3.com.day3;

import java.util.Scanner;

public class Day3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ѭ��
//		Scanner scanner=new Scanner(System.in);
//		int sum=0;
//		for(int a=1;a<=3;a++) {
//			System.out.println("�������"+a+"��ĳɼ�");
//			for(int j=1;j<=4;j++) {
//				System.out.print("�������"+j+"��ѧ���ĳɼ�");
//				int score=scanner.nextInt();
//				sum+=score;
//			}
//			System.out.println("��"+a+"�����ƽ�����ǣ�"+String.format("%.2f", sum/4.0));
//			sum=0;
//		}
		
		
//		Scanner scanner=new Scanner(System.in);
//			for(int i=1;i<=5;i++) {
//				for(int j=1;j<=i;j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
		
//		Scanner scanner=new Scanner(System.in);
//		int row;
//		System.out.println("����������");
//		row=scanner.nextInt();
//			for(int i=1;i<=row;i++) {
//				for(int j=1;j<=2*i-1;j++) {
//					System.out.print("*");
//				}
//				System.out.println();
//			}
		
		
		
//		Scanner scanner=new Scanner(System.in);
//		int row;
//		System.out.print("�����������εĸ߶�");
//		row=scanner.nextInt();
//		for(int i=row;i>=1;i--) {
//			for(int j=1;j<=2*i-1;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//����������*********
//		Scanner scanner=new Scanner(System.in);
//		int row;
//		System.out.print("�����������ε�����");
//		row=scanner.nextInt();
//		for(int i=1;i<=row;i--) {
//			for(int j=1;j<=2*row-i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
	//��ҵ
		//�ڶ���
//		Scanner scanner =new Scanner(System.in);
//		for (int i=1;i<=5;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		
		//������
//		Scanner scanner =new Scanner(System.in);
//		System.out.println("��ӡ������Ϊ��");
//		for(int i=5;i>=1;i--) {
//			for(int j=i;j>=1;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		//������
//		Scanner scanner=new Scanner(System.in);
//		for(int i=5;i>=1;i--) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		//������
//		Scanner scanner=new Scanner(System.in);
//		for(int i=1;i<=5;i++) {
//			for(int j=i;j>=1;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		//������
//		Scanner scanner =new Scanner(System.in);
//		int i,j,k;
//		do {
//			System.out.println("������һ������");
//			i=scanner.nextInt();
//		}while(i%2==0) ;
//		for(int a=1;a<=i;a++) {
//				if(a<i/2+1) {
//					for(j=1;j<=i/2+1-a;j++) {
//						System.out.print(" ");
//					}
//					for(k=1;k<=2*a-1;k++) {
//						if(k==1 || k==2*a-1) {
//							System.out.print("*");
//						}else {
//							System.out.print(" ");
//						}
//					}
//				
//				}else {
//						for(j=1;j<=a-(i+1)/2;j++) {
//							System.out.print(" ");
//						}
//						for(k=1;k<=(i+1-a)*2-1;k++) {
//								if(k==1 || k==(i+1-a)*2-1) {
//									System.out.print("*");
//							}else {
//									System.out.print(" ");
//							}
//						}
//				}
//			System.out.println();
//		}
		
	//������
		
		Scanner scanner=new Scanner(System.in);
		int a,b,c;
		for(a=0;a<=20;a++) {
			for(b=0;b<=33;b++) {
				c=100-a-b;
				if(c%3==0) {
					if(a*5+b*3+c/3==100) {
						System.out.println("ĸ����"+a+"ֻ,������"+b+"ֻ,С����"+c+"ֻ");
					}
				}
			}
		}
	}
}



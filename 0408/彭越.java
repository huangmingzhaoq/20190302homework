//6.��1-100���ڵ������͡�
//Ҫ����while�ṹ��do...while\for�ṹ���ַ�����
//  ����һ
//package homework;
//public class Homework4 {   
//	public static void main(String[] args) {
//		int i=1;
//		int sum=0;
//		while(i%2!=0 && i<=100) {
//			sum=sum+i;
//			System.out.println(i);
//			i=i+2;
//			
//		}System.out.println("100���ڵ������ͣ�"+sum);
//	}
//	
//	}

//  ������
//package homework;
//
//public class Homework4 {
//	public static void main(String[] args) {
//		int i = 1;
//		int sum = 0;
//		do {
//			sum = sum + i;
//			i = i + 2;
//		} while (i < 100);
//		System.out.println("������" + sum);
//	}
//}

//������
//package homework;
//
//public class Homework4 {
//	public static void main(String[] args) {
//		int i = 1;
//		int sum = 0;
//		for (i = 1; i < 100; i = i + 2) {
//			sum = sum + i;
//		}
//		System.out.println("�������ǣ�"+sum);
//	}
//}

//
//7.�����û�����һ�������������1���������ĺͣ��磺����50�������1+2+3����50�ĺ͡�
//package homework;
//import java.util.Scanner;
//public class Homework4 {
//	public static void main(String[] args) {
//			Scanner input=new Scanner(System.in);
//			System.out.println("������һ������");
//			int a=input.nextInt();
//			
//			if(a>0) {
//			int sum=0;
//			sum=(1+a)*a/2;
//			System.out.println(sum);
//			}
//			else if(a<0) {
//				a=-a;
//				int sum=0;
//				sum=(1+a)*a/2;
//				System.out.println(-sum+1);
//			}
//	}
//}
//
//8.�����û�����һ������������������Ľ׳ˣ��磺���磺����5�������5*4*3*2*1=120��

//package homework;
//import java.util.Scanner;
//public class Homework4 {
//	public static void main(String[] args) {
//			Scanner input=new Scanner(System.in);
//			System.out.println("������һ��������");
//			int a=input.nextInt();
//			int x=1;
//			int i=1;
//			while(i>=0 && i<=a) {
//				x=x*i;
//				i++;
//			}System.out.println("��׳�Ϊ��"+x);
//			
//	}
//}

//
//9.���û�����һ�����֣�����ӡ�����û��Ƿ�Ҫ�������룿Ҫ��Ҫ������������䣬�����˳���
//Ҫ����do..while�ṹ��
//package homework;
//
//import java.util.Scanner;
//
//public class Homework4 {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("������һ������");
//		String a = "0";
//		do {
//			a = input.next();
//			System.out.println("�������Ϊ��" + a);
//			System.out.println("���롰N���˳�����");
//
//		} while (!"N".equals(a));
//		System.out.println("�˳��ɹ�");
//	}
//
//}

//
//10.��������Ϸ
//Ҫ���û�����һ��0-99֮�������.��ʾ���´��ˣ���С�ˣ�
//�ٴ���ʾ��������
//ֱ���������֣��˳�ѭ����
//�������5�����ڲ��У�6-10�β��С�10�����ϲ���
//package homework;
//
//import java.util.Scanner;
//import java.util.Random;
//
//public class Homework4 {
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		Random rd=new Random();
//		int rdnum=rd.nextInt(100);
//		System.out.println(rdnum);
//		System.out.println("������һ�������´�С��");
//		int num=0;
//		do {
//			 num=input.nextInt();
//			if(rdnum<num) {
//				System.out.println("����");
//			}
//			else if(rdnum>num) {
//				System.out.println("С��");
//			}
//			else if(rdnum==num) {
//				System.out.println("����");
//			}
//		
//		
//		}while(rdnum!=num);
//		System.out.println("�ݰݣ�");
//	}
//}

//11.��:1!+2!+3!+......+10!
//10!=1*2*3*4*5*6*7*8*9*10
//package homework;
//import java.util.Scanner;
//public class Homework4 {
//	public static void main(String[] args) {
//			Scanner input=new Scanner(System.in);
//			
//			int a=10;
//			int x=1;
//			int i=1;
//			int sum=0;
//			while(i>=0 &&a>0&&a<=10) {
//				x=x*i;
//				sum=sum+x;
//				System.out.println(x);
//				i++;
//				a--;
//				
//			}System.out.println("1!+2!+3!+......+10!="+sum);
//			
//	}
//}
//	


//12.���1000���ڵ�ˮ�ɻ���
//˵�������һ����λ����ÿλ���ֵ������͵��ڸ�������Ϊˮ�ɻ�������153=1*1*1+5*5*5+3*3*3

package homework;

public class Homework4 {
	public static void main(String[] args) {
			
			System.out.println("1000���ڵ�ˮ�ɻ����У�");
			int x=100;
			
			do {
				int bai=x/100%10;
				int shi=x/10%10;
				int ge=x%10;
				int bais=bai*bai*bai;
				int shis=shi*shi*shi;
				int ges=ge*ge*ge;
				
			if(x==bais+shis+ges) {
				System.out.print(x);
				System.out.println("\t��ˮ�ɻ�����");
				
				x++;
			}else if(x!=bais+shis+ges) {
				System.out.print(x);
				System.out.println("\t����ˮ�ɻ�����");
				x++;
			}
			
			}while(x<1000);
	}
}
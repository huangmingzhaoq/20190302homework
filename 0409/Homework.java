package newer.com.demo;
/**
 * ��ӡ�žų˷���
 * @author Administrator
 *��ȭ��Ϸ
 */
import java.util.Random;
import java.util.Scanner;
public class Homework {

	public static void main(String[] args) {
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+"*"+i+"="+(i*j)+"\t");
//			}
//			System.out.println();
//		}
		int num,i;
		double count=0;
		String ans;
		Scanner input=new Scanner(System.in);
		
		for( i=1;;i++) {
			System.out.println("���û���ȭ��1������ 2��ʯͷ 3���� ");
			num=input.nextInt();
			if(num==1) {
				System.out.println("��������:����");
			}
			if(num==2) {
				System.out.println("��������:ʯͷ");
			}
			if(num==3) {
				System.out.println("��������:��");
			}
			
			Random a=new Random();
			int r=a.nextInt(3)+1;
			if(r==1) {
				System.out.println("�����������:����");
			}
			if(r==2) {
				System.out.println("�����������:ʯͷ");
			}
			if(r==3) {
				System.out.println("�����������:��");
			}
		
		if(num==1&&r==1) {
			System.out.println("���ƽ��");
		}	
		if(num==1&&r==2) {
			System.out.println("�����Ӯ�ˣ�������");
		}	
		if(num==1&&r==3) {
			System.out.println("��Ӯ�ˣ����������");
			count++;
		}	
		if(num==2&&r==1) {
			System.out.println("��Ӯ�ˣ����������");
			count++;
		}
		if(num==2&&r==2) {
			System.out.println("���ƽ��");
		}
		if(num==2&&r==3) {
			System.out.println("�����Ӯ�ˣ�������");
		}
		if(num==3&&r==3) {
			System.out.println("���ƽ��");
		}
		if(num==3&&r==2) {
			System.out.println("��Ӯ�ˣ����������");
			count++;
		}
		if(num==3&&r==1) {
			System.out.println("�����Ӯ�ˣ�������");
		}
		System.out.println("�Ƿ����:��(y) ��(n)");
		ans=input.next();
		if("y".equals(ans)) {
			continue;
		}else {
			break;
		}
		
		
	}
		System.out.println("���ܹ�ʤ��"+(int)count+"��");
		System.out.println("ʤ����"+count/i*100+"%");
	}
}

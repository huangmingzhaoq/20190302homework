package lzp.com;

import java.util.Scanner;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner =new Scanner(System.in);
//		System.out.println("������һ������");
//		int num=scanner.nextInt();
//		for(int i=0;i<=num;i++) {
//			System.out.println(i+"+"+(num-i)+"="+num);
//		}
	
	
	

		
//		Scanner scanner =new Scanner(System.in);
//		int count=0;
//		for(int i=1;i<11;i++) {
//			System.out.print("�������"+i+"Ϊ�˿͵�����");
//			int age=scanner.nextInt();
//			if(age>30) {
//				count++;
//			}
//		}
//		System.out.println("30�����ϵı���"+count*10.0+"%");
		
		
//		Scanner scanner=new Scanner(System.in);
//		String username,pwd;
//		boolean login=false;
//		
//		for(int i=2;i>=0;i--) {
//			System.out.println("�������û���");
//			username=scanner.nextLine();
//			System.out.println("����������");
//			pwd=scanner.nextLine();
//			if("admin".equals(username) && "111111".equals(pwd)) {
//				login=true;
//				break;
//			}
//			System.out.println("�û������������������"+i+"�λ���");
//		}
//			if(login) {
//				System.out.println("��½�ɹ�");
//			}else {
//				System.out.println("�����ܾ�����");
//			}
	//��ҵ
/////////��һ��
//		Scanner scanner=new Scanner(System.in);
//		int me;
//		int diannao;
//		String a;
//		int sum=0,num=0;
//		do {
//			System.out.println("���ȭ1��������2��ʯͷ��3������");
//			me=scanner.nextInt();
//			diannao=(int)(Math.random()*3+1);
//			System.out.println("1��������2��ʯͷ��3����:\n��������ǣ�"+me+"����������ǣ�"+diannao);
//			if(me==diannao) {
//				System.out.println("ƽ��");
//			}else if(me==1 && diannao==3 || me==2 && diannao==1 || me==3 && diannao==2) {
//				System.out.println("��Ӯ��");
//				sum++;
//			}else {
//				System.out.println("����Ӯ��");
//			}
//			num++;
//			System.out.println("�Ƿ������(y\n)");
//			a=scanner.next();
//			
//		}while("y".equals(a));
//		System.out.println("��һ�����ˣ�"+num+"��,Ӯ��"+sum+"��"+"ʤ��Ϊ��"+sum*1.0/num*100+"%");
		
	//�ڶ���
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		
		
	}	
}


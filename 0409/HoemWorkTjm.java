package com.newer.deom;

import java.util.Scanner;
import java.util.Random;

public class HoemWorkTjm {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// ��ȭ��Ϸ
		String ans = "y";
		int num = 1;
		int cai = 0;
		int count = 0;

		for (cai = 0;; cai++) {
			Random next = new Random();
			num = next.nextInt(3);
			System.out.println("���ȭ:1ʯͷ,2����,3��,");
			cai = input.nextInt();
			if (cai == 1) {
				System.out.println("��������ʯͷ");
			} else if (cai == 2) {
				System.out.println("�������Ǽ���");
			} else if (cai == 3) {
				System.out.println("�������ǲ�");
			}

			if (num == 1) {
				System.out.println("���Գ�����ʯͷ");
			} else if (num == 2) {
				System.out.println("���Գ����Ǽ���");
			} else if (num == 3) {
				System.out.println("���Գ����ǲ�");
			}
			if ((cai == 1 && num == 2) || (cai == 2 && num == 3) || (cai == 3 && num == 1)) {
				System.out.println("��Ӯ��!!\n��������!!");
				count++;
			} else if ((cai == 1 && num == 1) || (cai == 2 && num == 2) || (cai == 3 && num == 3)) {
				System.out.println("˫��ƽ��!!");

			} else if ((cai == 1 && num == 3) || (cai == 2 && num == 1) || (cai == 3 && num == 2)) {
				System.out.println("������!!\n����Ӯ��!!");

			}

			System.out.print("�Ƿ����:(y/n)");
			ans = input.next();
			if ("y".equals(ans)) {
				continue;
			} else {
				break;
			}
		}

		double sheng = cai / count;
		System.out.println("�û�ʤ��" + sheng * 10.0 + "%");

		// �žų˷���
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i+"*"+j+"="+(i*j)+"\t");
//			}
//			System.out.print("\n");
//		}
		input.close();
	}
}

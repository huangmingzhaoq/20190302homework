package demo;

import java.util.*;

public class hm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 99�˷���
//		for (int i = 1; i < 10; i++) {
//			for (int j = 1; j <= i; j++) {
//
//				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
//
//			}
//			System.out.print("\n");
//		}

		// ��ȭ��Ϸ
		int a = (int) (Math.random() * 3);
		int pc = a + 1;
		String diannao = "���Գ�ȭ";
		switch (pc) {
		case 1:
			diannao = "����";
			break;
		case 2:
			diannao = "ʯͷ";
			break;
		case 3:
			diannao = "��";
			break;
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("=========��ȭ��Ϸ=========");
		System.out.println("������1��2��3��1���������2����ʯͷ��3����");
		int player = scanner.nextInt();
		String wanjia = "��ҳ�ȭ";
		switch (player) {
		case 1:
			wanjia = "����";
			break;
		case 2:
			wanjia = "ʯͷ";
			break;
		case 3:
			wanjia = "��";
			break;
		}
		if (pc == player) {
			System.out.println("���Գ�����" + diannao + "���������" + wanjia + "��ƽ��");
		}
		if (pc == 1 && player == 2 || pc == 2 && player == 3 || pc == 3 && player == 1) {
			System.out.println("���Գ�����" + diannao + "���������" + wanjia + "����Ӯ��");
		}
		if (pc == 1 && player == 3 || pc == 2 && player == 1 || pc == 3 && player == 2) {
			System.out.println("���Գ�����" + diannao + "���������" + wanjia + "������Ӯ��");
		}

		if (player != 1 && player != 2 && player != 3) {
			System.out.println("ֻ������1��2��3");
		}
	}

}

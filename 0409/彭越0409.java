Random rd = new Random();
		Scanner num = new Scanner(System.in);

		int b = 0;
		double i=0;
		double x=0;
		do { //��doѭ�� 
			int a = rd.nextInt(3);
			//System.out.println(a);
			System.out.print("���ȭ��1��ʯͷ��2��������3����");
			b = num.nextInt();
			int c=a+1;
			if (b==1) {
				System.out.println("�������ʯͷ" );
			}else if (b==2) {
				System.out.println("������Ǽ���" );
			}else if (b==3) {
				System.out.println("������ǲ�" );
			}
			if (b == 1 && c == 1) {
				System.out.println("���Գ���Ҳ��ʯͷ���ƽ�ֿ���");
				x++;
				System.out.println("�Ƿ������Y/N��");
			} else if (b ==2 && c == 2) {
				System.out.println("���Գ�����Ҳ�������ƽ�ֿ���");
				x++;
				System.out.println("�Ƿ������Y/N��");
			} else if (b == 3 && c == 3) {
				System.out.println("���Գ���Ҳ�ǲ����ƽ�ֿ���");
				x++;
				System.out.println("�Ƿ������Y/N��");
			} else if (b == 3 && c == 1) {
				System.out.println("���Գ�����ʯͷ��Ӯ����");
				x++;
				i++;
				System.out.println("�Ƿ������Y/N��");
			} else if (b == 2 && c == 3) {
				System.out.println("���Գ����ǲ���Ӯ����");
				x++;
				i++;
				System.out.println("�Ƿ������Y/N��");
			} else if (b == 1 && c == 2) {
				System.out.println("���Գ����Ǽ�����Ӯ����");
				x++;
				i++;
				System.out.println("�Ƿ������Y/N��");
			} else if (c == 3 && b == 1) {
				System.out.println("���Գ����ǲ����俩��");
				x++;
				System.out.println("�Ƿ������Y/N��");
			} else if (c == 2 && b == 3) {
				System.out.println("���Գ����Ǽ������俩��");
				x++;
				System.out.println("�Ƿ������Y/N��");
			} else if (c == 1 && b == 2) {
				System.out.println("���Գ�����ʯͷ���俩��");
				x++;
				System.out.println("�Ƿ������Y/N��");
			}String s=num.next();
			if (s.equals("Y")) {
				continue;
			}else if(s.equals("N")) {
				
				System.out.println("��Ϸ������");
//				System.out.println(i);
//				System.out.println(x);
				double rate=i/x;
//				System.out.println(rate);
				System.out.print("���ʤ���ǣ�");
				System.out.println(String.format("%.1f", rate*100)+"%");
				break;
			}
			
		}while (b <=2);

	}
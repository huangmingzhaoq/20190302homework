Random rd = new Random();
		Scanner num = new Scanner(System.in);

		int b = 0;
		double i=0;
		double x=0;
		do { //用do循环 
			int a = rd.nextInt(3);
			//System.out.println(a);
			System.out.print("请出拳：1：石头，2：剪刀，3：布");
			b = num.nextInt();
			int c=a+1;
			if (b==1) {
				System.out.println("你出的是石头" );
			}else if (b==2) {
				System.out.println("你出的是剪刀" );
			}else if (b==3) {
				System.out.println("你出的是布" );
			}
			if (b == 1 && c == 1) {
				System.out.println("电脑出的也是石头打成平局咯！");
				x++;
				System.out.println("是否继续（Y/N）");
			} else if (b ==2 && c == 2) {
				System.out.println("电脑出的是也剪刀打成平局咯！");
				x++;
				System.out.println("是否继续（Y/N）");
			} else if (b == 3 && c == 3) {
				System.out.println("电脑出的也是布打成平局咯！");
				x++;
				System.out.println("是否继续（Y/N）");
			} else if (b == 3 && c == 1) {
				System.out.println("电脑出的是石头你赢啦！");
				x++;
				i++;
				System.out.println("是否继续（Y/N）");
			} else if (b == 2 && c == 3) {
				System.out.println("电脑出的是布你赢啦！");
				x++;
				i++;
				System.out.println("是否继续（Y/N）");
			} else if (b == 1 && c == 2) {
				System.out.println("电脑出的是剪刀你赢啦！");
				x++;
				i++;
				System.out.println("是否继续（Y/N）");
			} else if (c == 3 && b == 1) {
				System.out.println("电脑出的是布你输咯！");
				x++;
				System.out.println("是否继续（Y/N）");
			} else if (c == 2 && b == 3) {
				System.out.println("电脑出的是剪刀你输咯！");
				x++;
				System.out.println("是否继续（Y/N）");
			} else if (c == 1 && b == 2) {
				System.out.println("电脑出的是石头你输咯！");
				x++;
				System.out.println("是否继续（Y/N）");
			}String s=num.next();
			if (s.equals("Y")) {
				continue;
			}else if(s.equals("N")) {
				
				System.out.println("游戏结束！");
//				System.out.println(i);
//				System.out.println(x);
				double rate=i/x;
//				System.out.println(rate);
				System.out.print("你的胜率是：");
				System.out.println(String.format("%.1f", rate*100)+"%");
				break;
			}
			
		}while (b <=2);

	}
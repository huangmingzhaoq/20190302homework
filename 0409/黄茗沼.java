import java.util.Scanner;

public class lianxi {

	public static void main(String[] args) {


		
		
		
		//1.打印九九乘法表
		//1*1=1
		//1*2=2 2*2=4
		//1*3=3 2*3=6 3*3=9
		//1*4=4 2*4=8 3*4=12 4*4=16
		//1*5=5       
		//......
		//1*9=9 2*9=18...............9*9=81
//				for(int i=1;i<=9;i++) {
//					for(int j=1;j<=i;j++) {
//						System.out.print(i+"*"+j+"="+i*j+" ");
//					}
//						
//						System.out.println("\n");
//			         }

		
		
		
//		1、用户选择出拳：1剪刀、2石头、3布
//		2、计算机随机出拳
//		3、判断胜负s
//		4、询问是否继续
//		5、退出循环后，统计用户的胜率。
//
//		System.out.println("选择出拳:1剪刀；2石头；3布");
//		int person = scan.nextInt();
//		System.out.println("用户" + person);
//		int ran1 = scan.nextInt(3);
//		System.out.println("计算机" + ran1);
//		if (person == ran1) {
//			System.out.println("用户" + person + "计算机" + ran1 + "平局");
//		}
//		if(person==3 && ran1==1) {
//			System.out.println("用户"+person+"计算机"+ran1+"用户赢");
//		}
//		if(person==1 && ran1==3) {
//			System.out.println("用户"+person+"计算机"+ran1+"用户赢");
//		}
//		if(person==1 && ran1==2) {
//			System.out.println("用户"+person+"计算机"+ran1+"用户赢");
//		}
//		if(person==2 && ran1==3) {
//			System.out.println("用户"+person+"计算机"+ran1+"用户赢");
//			}
//		if(person==3&& ran1==2) {
//			System.out.println("用户"+person+"计算机"+ran1+"计算机赢");}
		
		// 乘法表

		  int dn =0;
         Scanner sc=new Scanner(System.in);
         
		System.out.println("选择出拳:1剪刀；2石头；3布");
		int wj=sc.nextInt();
		if (dn==1 &&wj==2||dn==2&&wj==3||dn==3&&wj==1) {
			System.out.println("用户出拳"+wj);
			System.out.println("计算机出拳"+dn);
			System.out.println("计算器胜利");
			Scanner jx=new Scanner(System.in);
			System.out.println("是否继续？y/继续;n/退出;");
			int tcyx=jx.nextInt();
			if(tcyx==1) {
				System.out.println(wj+dn);
			}if(tcyx==2) {}
		}
		if(dn==1&&wj==2||dn==2&&wj==3||dn==3&&wj==1) {
			System.out.println("用户出拳"+wj);
			System.out.println("计算机出拳"+dn);
			System.out.println("用户胜利");
			Scanner cc=new Scanner(System.in);
			System.out.println("是否继续？y/继续;n/退出");
			int ads=cc.nextInt();
			if(ads==1) {
				System.out.println(wj);
			}if(ads==2);
		}if(dn==1&&wj==1||dn==2&&wj==2||dn==3&&wj==3) {
			System.out.println("用户出拳"+wj);
			System.out.println("计算机出拳"+dn);
			System.out.println("平局");
			Scanner cc=new Scanner(System.in);
			System.out.println("是否继续？y/继续;n/退出");
			int ad=cc.nextInt();
			if(ad==1) {
				System.out.println(wj);
			}if(ad==2);
		}
	}
        
	
	}



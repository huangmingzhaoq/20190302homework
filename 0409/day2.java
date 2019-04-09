package lzp.com;

import java.util.Scanner;

public class day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scanner =new Scanner(System.in);
//		System.out.println("请输入一个数字");
//		int num=scanner.nextInt();
//		for(int i=0;i<=num;i++) {
//			System.out.println(i+"+"+(num-i)+"="+num);
//		}
	
	
	

		
//		Scanner scanner =new Scanner(System.in);
//		int count=0;
//		for(int i=1;i<11;i++) {
//			System.out.print("请输入第"+i+"为顾客的年龄");
//			int age=scanner.nextInt();
//			if(age>30) {
//				count++;
//			}
//		}
//		System.out.println("30岁以上的比例"+count*10.0+"%");
		
		
//		Scanner scanner=new Scanner(System.in);
//		String username,pwd;
//		boolean login=false;
//		
//		for(int i=2;i>=0;i--) {
//			System.out.println("请输入用户名");
//			username=scanner.nextLine();
//			System.out.println("请输入密码");
//			pwd=scanner.nextLine();
//			if("admin".equals(username) && "111111".equals(pwd)) {
//				login=true;
//				break;
//			}
//			System.out.println("用户名或密码错误，您还有"+i+"次机会");
//		}
//			if(login) {
//				System.out.println("登陆成功");
//			}else {
//				System.out.println("您被拒绝访问");
//			}
	//作业
/////////第一题
//		Scanner scanner=new Scanner(System.in);
//		int me;
//		int diannao;
//		String a;
//		int sum=0,num=0;
//		do {
//			System.out.println("请出拳1、剪刀：2、石头：3、布：");
//			me=scanner.nextInt();
//			diannao=(int)(Math.random()*3+1);
//			System.out.println("1、剪刀：2、石头：3、布:\n你输入的是："+me+"电脑输入的是："+diannao);
//			if(me==diannao) {
//				System.out.println("平局");
//			}else if(me==1 && diannao==3 || me==2 && diannao==1 || me==3 && diannao==2) {
//				System.out.println("你赢了");
//				sum++;
//			}else {
//				System.out.println("电脑赢了");
//			}
//			num++;
//			System.out.println("是否继续：(y\n)");
//			a=scanner.next();
//			
//		}while("y".equals(a));
//		System.out.println("您一共玩了："+num+"次,赢了"+sum+"次"+"胜率为："+sum*1.0/num*100+"%");
		
	//第二题
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			System.out.println();
		}
		
		
	}	
}


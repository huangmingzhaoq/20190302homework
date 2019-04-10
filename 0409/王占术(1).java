package com.nwer.deamo;

import java.util.Scanner;

public class zuoye {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner   scanner=new Scanner(System.in);
		System.out.println("用户出拳(1剪刀2石头3布)");
		 int fist=scanner.nextInt();
		 int i,sum=0;
		 double shenglv=0;
		 int jiquan=(int)(Math.random()*3+1);
		 for( i=1;i<999;i++) {
			 if((fist==1&&jiquan==2)||(fist==2&&jiquan==3)||(fist==3&&jiquan==1)) {
				 System.out.println("计算机出拳"+jiquan+"用户出拳"+fist+"你输了");
			 }
			 if((fist==1&&jiquan==3)||(fist==2&&jiquan==1)||(fist==3&&jiquan==2)) {
				 System.out.println("计算机出拳"+jiquan+"用户出拳"+fist+"你赢了");
			 }
			 if((fist==1&&jiquan==1)||(fist==2&&jiquan==2)||(fist==3&&jiquan==3)) {
				 System.out.println("计算机出拳"+jiquan+"用户出拳"+fist+"打平了");
			 }
		 
			 System.out.println("是否继续y/n");
			 String jixu=scanner.nextLine();
			 if("y".equals(jixu)) {
				 System.out.println("用户出拳(1剪刀2石头3布)"); 
				 fist=scanner.nextInt();
			 }else {
				 break;
			 }
			 System.out.println("第"+i+"次继续猜拳");
			 System.out.println("胜利次数："+sum);
			 if(i==1) {
				 System.out.println("胜利百分百");
			 }
			 if(sum>=0&&sum<1) {
				 shenglv=shenglv+sum/i;
				 System.out.println("胜利是："+shenglv);
			 }
		 }
		
		
		
		
		
		
		scanner.close();
		
		
		
		
	}

}

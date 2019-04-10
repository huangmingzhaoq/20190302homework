package com.newer.demo;

import java.util.Random;
import java.util.Scanner;

public class Homework0409 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		d s,coun=0,z=0;
		String ans,tem;
		do {
			Random random=new Random();
			int x=random.nextInt(3);
			System.out.println("请输入一个数字 1代表剪刀2代表石头 3代表布");
			s=scanner.nextInt();
			if (s==x+1) {
				if (s==1) {
					System.out.println("你出的剪刀  电脑也出的剪刀  平局 ");
				}else if(s==2){
					System.out.println("你出的石头  电脑也出的石头  平局 ");
				
				}else {
					System.out.println("你出的布  电脑也出的布  平局 ");
				}
			}else if (s==1&&x+1==3||s==2&&x+1==1||s==3&&x+1==2) {
				if (s==1&&x+1==3) {
					System.out.println("你出的剪刀 电脑出的布 你赢了");
					coun++;
				}else if (s==2&&x+1==1) {
					System.out.println("你出的石头 电脑出的剪刀 你赢了 ");
					coun++;
				}else {
					System.out.println("你出的布  电脑出得石头  你赢了 ");
				}
				coun++;
			}else {
				if (s==1&&x+1==2) {
					System.out.println("你出的剪刀 电脑出的石头 你输了");
				}else if (s==2&&x+1==3) {
					System.out.println("你出的石头 电脑出的布 你输了 ");
				}else {
					System.out.println("你出的布 电脑出的剪刀 你输了");
					
				}
			}
			z++;
			tem=scanner.nextLine();
			System.out.println("请输入是否继续(y/n)");
			ans=scanner.nextLine();
			
		} while ("y".equals(ans));
	
		System.out.println("胜率为"+(coun/z)*100+"%");
		
		
		
		
		
		
		
//		乘法表？
//		for (int i = 1; i <=9; i++) {
//			for (int j = 1; j <=i; j++) {
//			System.out.print(j+"*"+i+"="+i*j+"\t");	
//			}System.out.println();
//		}

		}
	}

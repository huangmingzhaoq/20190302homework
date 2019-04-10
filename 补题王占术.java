package com.nwer.deamo;

import java.util.Scanner;

public class Zuoye1 {

	public static void main(String[] args) {
//		百元百鸡：母鸡5元一只，公鸡3元一只，小鸡1元3只，请输出100元买100只鸡的方案
	      
		
		int a,b,c;
		for(a=0;a<=100;a++) {
			for(b=0;b<=100;b++) {
				for(c=0;c<=100;c+=3) {
					if((a*5+b*3+c/3)==100&&a+b+c==100) {
						System.out.println("方案:"+"母鸡数为"+a+"公鸡数为"+b+"小鸡数为"+c);
					}
				}
			}
		}
	}

}

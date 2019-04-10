package zouye5;

import java.util.Scanner;

public class s1 {
 public static void main(String[] dsd){
	 /*for(int i=1;i<=6;i++){
		 for(int j=1;j<i;j++){
			 System.out.print(j);
		 }
		 System.out.println();
	 }
	 for(int i=0;i<=5;i++){
		 for(int j=5-i;j>0;j--){
			 System.out.print(j);
		 }
		 System.out.println();
 }
	 for(int i=1;i<=6;i++){
		 for(int j=1;j<=6-i;j++){
			 System.out.print(j);
		 }
		 System.out.println();
	 } 
	 for(int i=5;i>0;i--){
		 for(int j=6-i;j>0;j--){
			 System.out.print(j);
		 }
		 System.out.println();
 }
	 Scanner sc=new Scanner(System.in);
	 System.out.println("请输入数字");
	 int n=sc.nextInt();
	 for(int i=1;i<=n;i++){
		 for(int j=1;j<=n-i;j++){
			 System.out.print(" ");
		 } 
		 for(int k=1;k<=2*i-1;k++){
			 if(k==1||k==2*i-1){
				 System.out.print("*");
			 }else{
				 System.out.print(" ");
			 }
		 }
		 for(int j=1;j<=n-i;j++){
			 System.out.print(" ");
		 }
		 System.out.println();
	 }
	for(int i=n-1;i>=1;i--){
		for(int j=n-1;j>=i;j--){
			System.out.print(" ");
		}
		for(int k=1;k<=2*i-1;k++){
			if(k==1||k==2*i-1){
				System.out.print("*");
			}else{
				 System.out.print(" ");
			 }
		}
			for(int j=n-1;j>=i;j--){
				System.out.print(" ");
			}
			System.out.println();
		}*/
	 int n = 0;
	 for(int i=1;i<=20;i++){
		 for(int j=1;i<=33;i++){
			 for(int k=3;k<=100;k+=3){
				 if(i+j+k==100){
					 System.out.println("第"+n+"个方案母鸡"+i+"公鸡"+j+"小鸡"+k+"只");
					 n++;
				 }
				 
			 }
		 }
		 
		
	 }
	} 
}

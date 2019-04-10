package zuoye4;

import java.util.Random;
import java.util.Scanner;

public class s1 {
 public static void main(String[]ase){
	/* Scanner sc=new Scanner(System.in);
	Random ra=new Random();
	int b=ra.nextInt(3);
	 int count=0,wj=0;
	 System.out.println("1是石头，2是剪刀，3是布，0是退出");
		int a=sc.nextInt();
	while(a!=0&&a<4){
	switch(a){
	case 1:
		System.out.println("你出的是石头");
		break;
	case 2:
		System.out.println("你出的是剪刀");
		break;
	case 3:
		System.out.println("你出的是布");
		break;
		default:
	}
	switch(b){
	case 1:
		System.out.println("电脑出的是石头");
		break;
	case 2:
		System.out.println("电脑出的是剪刀");
		break;
	case 3:
		System.out.println("电脑的是布");
		break;
	default:
	}
	if(a==b){
		System.out.println("平");
	}else if(b-a==2||a-b==1||b-a==1){
		System.out.println("电脑赢了");
	}else if(a-b==2||b-a==1){
		System.out.println("你赢了");
		wj++;
	}
	System.out.println("1是石头，2是剪刀，3是布，0是退出");
	  a=sc.nextInt();
	 count++;
	}
	
	System.out.println("用户的胜率"+wj/count+"%");
	 for(int i=0;i<10;i++){
		 for(int j=1;j<=i;j++){
			 System.out.print(i+"*"+j+"="+j*i+"\t");
		 }
		 System.out.println();
	 }*/
	 for(int i=0;i<=5;i++){
		 for(int j=0;j<=i-1;j++){
			 System.out.print(i);
		 }
		 System.out.println();
	 }
	 
 }
}

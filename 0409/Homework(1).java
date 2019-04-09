package newer.com.demo;
/**
 * 打印九九乘法表
 * @author Administrator
 *猜拳游戏
 */
import java.util.Random;
import java.util.Scanner;
public class Homework {

	public static void main(String[] args) {
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+"*"+i+"="+(i*j)+"\t");
//			}
//			System.out.println();
//		}
		int num,i;
		double count=0;
		String ans;
		Scanner input=new Scanner(System.in);
		
		for( i=1;;i++) {
			System.out.println("请用户出拳：1，剪刀 2，石头 3，布 ");
			num=input.nextInt();
			if(num==1) {
				System.out.println("您出的是:剪刀");
			}
			if(num==2) {
				System.out.println("您出的是:石头");
			}
			if(num==3) {
				System.out.println("您出的是:布");
			}
			
			Random a=new Random();
			int r=a.nextInt(3)+1;
			if(r==1) {
				System.out.println("计算机出的是:剪刀");
			}
			if(r==2) {
				System.out.println("计算机出的是:石头");
			}
			if(r==3) {
				System.out.println("计算机出的是:布");
			}
		
		if(num==1&&r==1) {
			System.out.println("打成平手");
		}	
		if(num==1&&r==2) {
			System.out.println("计算机赢了，您输了");
		}	
		if(num==1&&r==3) {
			System.out.println("您赢了，计算机输了");
			count++;
		}	
		if(num==2&&r==1) {
			System.out.println("您赢了，计算机输了");
			count++;
		}
		if(num==2&&r==2) {
			System.out.println("打成平手");
		}
		if(num==2&&r==3) {
			System.out.println("计算机赢了，您输了");
		}
		if(num==3&&r==3) {
			System.out.println("打成平手");
		}
		if(num==3&&r==2) {
			System.out.println("您赢了，计算机输了");
			count++;
		}
		if(num==3&&r==1) {
			System.out.println("计算机赢了，您输了");
		}
		System.out.println("是否继续:是(y) 否(n)");
		ans=input.next();
		if("y".equals(ans)) {
			continue;
		}else {
			break;
		}
		
		
	}
		System.out.println("您总共胜了"+(int)count+"次");
		System.out.println("胜率是"+count/i*100+"%");
	}
}

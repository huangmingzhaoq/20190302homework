package newer.com.demo;
/**
 * ´òÓ¡¾Å¾Å³Ë·¨±í
 * @author Administrator
 *²ÂÈ­ÓÎÏ·
 */
import java.util.Random;
import java.util.Scanner;
public class Homework {

	public static void main(String[] args) {
<<<<<<< HEAD
//		for(int i=1;i<=9;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j+"*"+i+"="+(i*j)+"\t");
=======
		
		//ç”¨æˆ·é€‰æ‹©å‡ºæ‹³  1å‰ªåˆ€ 2çŸ³å¤´ 3å¸ƒï¼Œè®¡ç®—æœºéšæœºå‡ºæ‹³ï¼Œåˆ¤æ–­èƒœè´Ÿï¼Œè¯¢é—®æ˜¯å¦ç»§ç»­ï¼Œé€€å‡ºç¨‹åºï¼Œç»Ÿè®¡èƒœç‡
		
//		Scanner input=new Scanner(System.in);
//		int cq;
//		int jcq;
//		String answer;
//		int sum=0;
//		int num=0;
//		double i=0;
//		do {
//			System.out.print("è¯·å‡ºæ‹³ï¼ˆ 1å‰ªåˆ€ 2çŸ³å¤´ 3å¸ƒï¼‰ï¼š");
//			cq=input.nextInt();
//			if(cq!=1 && cq!=2 && cq!=3) {
//				System.out.println("è¾“å…¥æœ‰è¯¯");
//				break;
//			}
//			jcq=(int)(Math.random()*3+1);
//			System.out.println("1--å‰ªåˆ€  2--çŸ³å¤´  3--å¸ƒ\næ‚¨å‡ºçš„æ˜¯"+cq+"è®¡ç®—æœºå‡ºçš„æ˜¯"+jcq);	//å¯ä»¥åŠ ä¸€å¥switchè¯­å¥ï¼Œæˆ–è€…å†™æˆæ–¹æ³•
//			
//			if (cq==jcq) {
//				System.out.println("å¹³å±€");
//			}else if(jcq==1&&cq==3 || jcq==2&&cq==1 || jcq==3&&cq==2) {
//				System.out.println("è®¡ç®—æœºèµ¢äº†");
//			}else {
//				System.out.println("ä½ èµ¢äº†");
//				num++;
//			}
//			
//			sum++;
//			i=(num*1.0/sum*100);
//			System.out.print("æ˜¯å¦ç»§ç»­ï¼ˆy/nï¼‰:");
//			answer=input.next();
//			if(!"y".equals(answer)&&!"n".equals(answer)) {
//				System.out.println("è¾“å…¥æœ‰è¯¯");
//				break;
//			}
//			}while("y".equals(answer));
//		System.out.println("ä¸€å…±è¿›è¡Œäº†"+sum+"æ¬¡ï¼Œæ‚¨ä¸€å…±èµ¢äº†"+num+"æ¬¡"+"\næ‚¨çš„èƒœç‡ä¸º"+i+"%");

		
		
		
		
		//1.æ‰“å°ä¹ä¹ä¹˜æ³•è¡¨
		
//		for (int i=1;i<=9;i++) {
//			for (int j=1;j<=i;j++) {
//				System.out.print(j+"*"+i+"="+i*j+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		
		
		//--------------------------------------------------------------------------------
		
		//		2.æ‰“å°:
		//			1
		//			12 
		//			123
		//			1234
		//			12345
		
//		for (int i=1;i<=5;i++) {
//			for (int j=1;j<=i;j++) {
//				System.out.print(j);
>>>>>>> 8e570f696285452d8f2067c8ea39f5a45edc13c5
//			}
//			System.out.println();
//		}
		int num,i;
		double count=0;
		String ans;
		Scanner input=new Scanner(System.in);
		
		for( i=1;;i++) {
			System.out.println("ÇëÓÃ»§³öÈ­£º1£¬¼ôµ¶ 2£¬Ê¯Í· 3£¬²¼ ");
			num=input.nextInt();
			if(num==1) {
				System.out.println("Äú³öµÄÊÇ:¼ôµ¶");
			}
			if(num==2) {
				System.out.println("Äú³öµÄÊÇ:Ê¯Í·");
			}
			if(num==3) {
				System.out.println("Äú³öµÄÊÇ:²¼");
			}
			
			Random a=new Random();
			int r=a.nextInt(3)+1;
			if(r==1) {
				System.out.println("¼ÆËã»ú³öµÄÊÇ:¼ôµ¶");
			}
			if(r==2) {
				System.out.println("¼ÆËã»ú³öµÄÊÇ:Ê¯Í·");
			}
			if(r==3) {
				System.out.println("¼ÆËã»ú³öµÄÊÇ:²¼");
			}
		
		if(num==1&&r==1) {
			System.out.println("´ò³ÉÆ½ÊÖ");
		}	
		if(num==1&&r==2) {
			System.out.println("¼ÆËã»úÓ®ÁË£¬ÄúÊäÁË");
		}	
		if(num==1&&r==3) {
			System.out.println("ÄúÓ®ÁË£¬¼ÆËã»úÊäÁË");
			count++;
		}	
		if(num==2&&r==1) {
			System.out.println("ÄúÓ®ÁË£¬¼ÆËã»úÊäÁË");
			count++;
		}
		if(num==2&&r==2) {
			System.out.println("´ò³ÉÆ½ÊÖ");
		}
		if(num==2&&r==3) {
			System.out.println("¼ÆËã»úÓ®ÁË£¬ÄúÊäÁË");
		}
		if(num==3&&r==3) {
			System.out.println("´ò³ÉÆ½ÊÖ");
		}
		if(num==3&&r==2) {
			System.out.println("ÄúÓ®ÁË£¬¼ÆËã»úÊäÁË");
			count++;
		}
		if(num==3&&r==1) {
			System.out.println("¼ÆËã»úÓ®ÁË£¬ÄúÊäÁË");
		}
		System.out.println("ÊÇ·ñ¼ÌĞø:ÊÇ(y) ·ñ(n)");
		ans=input.next();
		if("y".equals(ans)) {
			continue;
		}else {
			break;
		}
		
		
<<<<<<< HEAD
=======
		
		//		3.æ‰“å°:
		//			54321
		//			4321
		//			321
		//			21
		//			1
		
//		for (int i=5;i>=1;i--) {
//			for (int j=i;j>=1;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		
		//		4.æ‰“å°:
		//			12345
		//			1234
		//			123
		//			12
		//			1
		
//		for (int i=5;i>=1;i--) {
//			for (int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		
		//		5.æ‰“å°:
		//			1
		//			21
		//			321
		//			4321
		//			54321
		
//		for (int i=1;i<=5;i++) {
//			for (int j=i;j>=1;j--) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
		
		
		//		6.æ‰“å°ç©ºå¿ƒè±å½¢ã€‚
		//					è¡Œ	       æ˜Ÿ	
		//	    *			1      1
		//	   * *			2      3
		//	  *   *			3      5
		//	 *     *		4	4  7	1
		//	  *   * 		5	3  5	2
		//	   * *			6	2  3	3
		//	    *			7	1  1	4
		
//		Scanner input=new Scanner(System.in);
//		int i,j,k;
//		do{
//			System.out.print("è¯·è¾“å…¥ä¸€ä¸ªå¥‡æ•°ï¼š");
//			i = input.nextInt();
//		}while(i%2==0);
//		
//		for (int h=1;h<=i;h++) {
//			if (h<=i/2+1) {
//				for(j=1;j<=i/2+1-h;j++) {
//					System.out.print(" ");
//				}
//				for(k=1;k<=2*h-1;k++) {
//					if(k==1||k==2*h-1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}else {
//				for(j=1;j<=h-(i+1)/2;j++) {
//					System.out.print(" ");
//				}
//				for(k=1;k<=(i+1-h)*2-1;k++) {
//					if(k==1||k==(i+1-h)*2-1) {
//						System.out.print("*");
//					}else {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}
	
	
		
		//7.ç™¾å…ƒç™¾é¸¡ï¼šæ¯é¸¡5å…ƒä¸€åªï¼Œå…¬é¸¡3å…ƒä¸€åªï¼Œå°é¸¡1å…ƒ3åªï¼Œè¯·è¾“å‡º100å…ƒä¹°100åªé¸¡çš„æ–¹æ¡ˆã€‚
		//æ¯é¸¡	0-20	å…¬é¸¡ 0-33
		
//		int num5;
//		int num3;
//		int num1;
//		for (num5=0;num5<=20;num5++) {
//			for(num3=0;num3<=33;num3++) {
//				num1=100-num5-num3;
//				if(num1%3==0) {
//					if(num5*5+num3*3+num1/3==100) {
//						System.out.println("æ¯é¸¡ä¹°"+num5+"åªï¼Œå…¬é¸¡ä¹°"+num3+"åªï¼Œå°é¸¡ä¹°"+num1+"åª");
//					}
//				}
//			}
//		}
		
>>>>>>> 8e570f696285452d8f2067c8ea39f5a45edc13c5
	}
		System.out.println("Äú×Ü¹²Ê¤ÁË"+(int)count+"´Î");
		System.out.println("Ê¤ÂÊÊÇ"+count/i*100+"%");
	}
}

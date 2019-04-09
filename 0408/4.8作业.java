package homework;
import java.util.Scanner;
public class Homeworkq {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
//		6.求1-100以内的奇数和。
//		要求：用while结构和do...while\for结构三种方法。
//        int i=0,sum=0;
//        while(i<=100) {
//        	if(i%2==0) {
//        		i++;
//        		}
//        	sum+=i;
//    		i+=2;
//            }
//        	System.out.println("1-100以内奇数和="+sum);
        	
//		  int i=0,sum=0;
//          do {
//        	  if(i%2==0) {
//        		  i++;
//        	  }
//        	  sum+=i;
//        	  i+=2;
//             }while(i<=100);
//          System.out.println("1-100以内奇数和="+sum);
		
//          int sum=0;
//          for(int i=1;i<=100;i++) {
//        	  if(i%2!=0) {
//        		  sum+=i;
//        	  }
//              }System.out.println("1-100以内奇数和="+sum);
		
//		7.接受用户输入一个整数，计算从1到该整数的和，如：输入50，则计算1+2+3……50的和。
//          int num,sum=0;
//          System.out.print("输入一个整数：");
//          num=scanner.nextInt();
//          while(num>=1) {
//        	  sum+=num;
//        	  num=num-1;
//          }
//          System.out.println("从1到该整数的和="+sum);
		
//		8.接受用户输入一个正整数，求出该数的阶乘，如：例如：输入5，则计算5*4*3*2*1=120。
//		  int num,sum=1;
//		  System.out.print("输入一个正整数:");
//		  num=scanner.nextInt();
//		  while(num>=1) {
//			  sum*=num;
//			  num=num-1;
//		  }
//		  System.out.println("该数的阶乘="+sum);
		
//		 9.请用户输入一个数字，并打印，问用户是否还要继续输入？要是要继续输入就再输，否则退出。
//		   要求：用do..while结构。
//		 int num;
//		 String ans="y";
//		 do {
//			System.out.println("请输入一个数字：");
//			num=scanner.nextInt();
//			System.out.println(num);
//			String temp=scanner.nextLine();
//			System.out.println("是否继续？(y/n)");
//			ans=scanner.nextLine();
//			}while("y".equals(ans));
				
//		10.猜数字游戏
//		要求用户输入一个0-99之间的数字.提示他猜大了，猜小了，
//		再次提示输入数字
//		直到猜中数字，退出循环，
//		给出评语，5次以内猜中，6-10次猜中。10次以上猜中
//         int num=(int)(Math.random()*100),a,count=0;
//         do {
//        	 System.out.println("请输入0~99之间的数字");
//        	 a=scanner.nextInt();
//        	 if(a>num) {
//        		 System.out.println("猜大了");
//        	 }else 
//        		 System.out.println("猜小了");
//        		 count++;
//        	 }while(a!=num);
//        		System.out.println("随机数为"+num); 
//                System.out.println(count+"次猜中");
		     
//		11.求:1!+2!+3!+......+10!
//		10!=1*2*3*4*5*6*7*8*9*10
//		int sum=0,b=1;
//		for(int i=1;i<=10;i++) {
//			for(int a=1;a<1;a++) {
//				b*=a;
//			}
//			sum+=b;
//			b=1;
//		}
//		System.out.println("10！="+sum);
		
//		12.输出1000以内的水仙花数
//		说明：如果一个三位数，每位数字的立方和等于该数，则为水仙花数。如153=1*1*1+5*5*5+3*3*3
//        for(int a=1;a<10;a++)
//        for(int b=1;b<10;b++)
//        for(int c=1;c<10;c++)
//        	if((a*100+b*10+c)==(a*a*a+b*b*b+c*c*c))
//        		System.out.println(a*100+b*10+c+"="+a+"*"+a+"*"+a+"+"+b+"*"+b+"*"+b+"+"+c+"*"+c+"*"+c);
        		       
		
		
	}

}

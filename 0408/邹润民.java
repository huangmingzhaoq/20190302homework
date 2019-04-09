package zuoye2;

import java.util.Scanner;

public class s1 {
 public static void main(String[]ser){
	 Scanner sc=new Scanner(System.in);
	/* System.out.println("请输入2位以上的整数");
	
	int a=sc.nextInt();
	 int sum=0;
	 int i=1;
	 while(a>0){
		 int d=a%10;
		 sum=sum*10+d;
		 a=a/10;
	 }
	 System.out.println(sum);
	 System.out.println("请输入n数");
	 int sum=0;
	 int count=0;
	int n=sc.nextInt();
	int[]b=new int[n];
	for(int i=0;i<b.length;i++){
		int s=sc.nextInt();
		if(s%2==0){
			sum++;
			count+=s;
		}
		System.out.println(sum);
		System.out.println(count);
		}
	 int max = 0,min = 0,sun=0;
	 System.out.println("请输入一个整数");
	 int num1=sc.nextInt();
	 System.out.println("请输入一个整数");
	 int num2=sc.nextInt();
		if(num1>num2){
			max=num1;
			min=num2;
		}else if(num1==num2){
			max=num1;
			min=num2;
		}else{
			max=num2;
			min=num1;
		}
		for(int i=min;i<=max;i++){
			if(i%2==1){
				sun+=i;
			}
		}
		System.out.println(sun);
	int a[]=new int[20];
	  a[0] = 0;
      a[1] = 1;
      System.out.println("斐波那契数列前20项的值如下：");
      System.out.print(a[0]+" "+a[1]+" ");
      for(int i = 2; i < 20; i++){
          a[i] = a[i - 1] + a[i - 2];
          System.out.print(a[i]+" ");
      }

for(int i=0;i<=100;i+=5){
	System.out.print(i); 	
}

	 int sum=0;
 for(int i=0;i<=100;i++){
	 if(i%2==1){
		sum+=i; 
	 }
 }
 System.out.println(sum);
 int i=0;
 int sum=0;
 do{
	if(i%2==1){
	sum+=i;
	i++;
	} 
 }
while(i<=100);

System.out.println(sum);*/
int i=0;
int sum=0; 
while(i<=100){
	if(i%2==1){
		sum+=sum;
		i++;
	}System.out.println(sum);
}

	/* System.out.println("请输入一个数"); 
	 int sum=0;
	 int n=sc.nextInt();
	 for(int i=0;i<=n;i++){
		 sum+=i;
	 }
	 System.out.println("数和为"+sum+"");
	 System.out.println("请输入一个数"); 
	 int n=sc.nextInt();
	 long sum = 1 ;  
     for(int i = 1;i <= n;i++){
       sum *= i;
     }
    
	 System.out.println("阶乘数为"+sum+"");
	 System.out.println("请输入一个数");
	 int a=sc.nextInt();
	 int count=0;
	 int sum=(int)(Math.random()*100);
	 do{
		 if(a<sum){
			 System.out.println("猜小了"); 
		 }else if(a>sum){
			 System.out.println("猜大了"); 
		 }
		 System.out.println("请继续猜一个数字");
		 a=sc.nextInt();
		 count++;
	 }while(sum!=a);
	 if(count <= 5){
		System.out.println("您在5次以内猜中");
		} else if(count> 6 && count <= 10){
			System.out.println("您在6-10次以内猜中");
	} else {
			System.out.println("您在10次以上猜中");
	}
	 int count=0;
	 int sum=1;
	 for(int i=1;i<=10;i++){
		 sum*=i;
		 count+=sum;
	 }
	 System.out.println(sum);
	 for(int a = 100; a <= 999 && a>= 100; a++){
	 		int x = a / 100;
	 		int y = a / 10%10;
	 		int z = a%10;
	 		int sum;
	 		sum = x * x * x + y * y * y + z * z * z;
	 			if(sum == a){
	 				System.out.println(sum);
	 			}
	 		}*/
sc.close();
 }
}

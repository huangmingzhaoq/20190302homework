import java.util.Scanner;
public class zuoye {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		// TODO Auto-generated method stub
//         long result=0;
//         for(int i=1; i<=100; i=i+2) {
//        	 result=result+i;
//         }
//         System.out.println("result="+result);
		
		
		//9.请用户输入一个数字，并打印，问用户是否还要继续输入？
		//要是要继续输入就再输，否则退出。
		int i;
		System.out.println("请输入一个数字");
		do {
			 
		    System.out.println("是否继续?(y/n)");
		    i=scanner.nextInt();
		   System.out.println("");
			
		}while(!"y".equals(scanner));
		 
	}

}

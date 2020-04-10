
 import java.util.Scanner;
 public class TestDemo {//一个文件中只能有一个public的类，类名必须和文件名一致
    public static void main(String[] args) {//分别输出一个数二进制序列的奇数位和偶数位
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i = 0;
		int ret =0;
		for(i=30;i>=0;i=i-2){
			ret=(num>>i)&1;
			System.out.printf("%d ", ret);//奇数
		}
		System.out.printf("\n");
		for(i=31;i>0;i=i-2){
			ret=(num>>i)&1;
			System.out.printf("%d ", ret);//偶数
		}
	}
 }
    // public static void main(String[] args) {//输出一个数二进制序列中1的个数
		// Scanner scan = new Scanner(System.in);
		// int num = scan.nextInt();
		// int i = 0;
		// int count = 0;
		// while(num!=0){
	    // num= num&(num-1);
		// count++;
		// }
		// System.out.println(count);
	// }
 // }	
    /* public static void main(String[] args) {//计算1/1-1/2+1/3-1/4+1/5......+1/99-1/100
		double i = 1.0;
		double sum = 0.0;
		double flag= 1.0;
		for(i=1;i<=100;i++){
			sum=sum+flag/i;
			flag=-flag;
		}
		System.out.println(sum);
	} */
    /* public static void main(String[] args) {//求两个整数的最大公约数
		int a = 24;
		int b = 18;
		int min = a>b?a:b;
		while(min>0){
			if(a%min==0 && b%min==0){
				System.out.println(min);
				break;
			}
			min--;
		}
	} */
 
    /* public static void main(String[] args) {//输出一个整数的每一位
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		while(num>0){
			System.out.printf("%d ", num%10);
			num = num/10;
			count++;
		}
		
	}
 } */
    /* public static void main(String[] args) {//1-100之间出现多少个9
		int i = 1;
		int count = 0;
		for(i=1;i<100;i++){
			if(i%10==9){
		        count++;
			}if(i/10==9){
				count++;
			 }
		}
		System.out.println(count);
	} */
    /* public static void main(String[] args) {//输出一个乘法口诀表
		int i = 1;
		for(i=1;i<=9;i++){
			int j = 1;
			for(j=1;j<=i;j++){
				System.out.printf("%d*%d=%-2d\t", i, j, i*j);
			}
			System.out.printf("\n");
		}
	} */
    /* public static void main(String[] args) {//判断一个数是否是素数
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i = 2;
		for(i=2;i<num;i++){
			if(num%i==0){
				System.out.println("不是素数");
				break;
			}
		}if(i==num){
		System.out.println("是素数");
		}
	} */
    /* public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
			if(a<=18){
				System.out.println("少年");
			}else if(a>18 && a<=28){
				System.out.println("青年");
			}else if(a>28 && a<=55){
				System.out.println("中年");
			}else{
				System.out.println("老年");
			}
		} */
	
    /* public static void main(String[] args) {//n的阶乘之和
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int i = 1;
		int ret = 1;
		int sum = 0;
		while(i<=num){
			ret *= i;
			sum += ret;
			i++;
		}
		System.out.println(sum);
	} */
    /* public static void main(String[] args) {
		int a = 1;
		switch(a){
			case 1:
			 System.out.println("1");
			 break;
			case 2:
			 System.out.println("2");
			 break;
			default:
			System.out.println("请输入正确数字");
			break;
		}
	} */
    /* public static void main(String[] args) {//ctrl+c 直接中断程序  ctrl+d  正常退出
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextInt()){
			int year = scan.nextInt();
		   if((year%4==0 && year%100!=0) || (year%400==0)){
			  System.out.println("闰年");
		   }else{
			  System.out.println("不是闰年");
		   }
		}
	} */
   /*  public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();//读入一个整型数据
		System.out.println(a);
		String str = scan.nextLine();//读入字符数据（一行）
	} */
     /* public static void main(String[] args) {//给定3个变量求最大值 */
	 /* int a = 1;
	 int b = 2;
	 int c = 3;
	 int max =0;
	 if(a>b && a>c){
		 max=a;
	 }else if(b>a&&b>c){
		 max=b;
	 }else{
		 max=c;
	 }
	 System.out.println(max);
	 
 } 
 } */
    //public static void main10(String[] args) {//交换两个变量的值
		/* int a = 10;
		int b = 20;
		int tmp = 0;
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("a="+a + "b="+b); */

	/* }
    p *///ublic static void main9(String[] args) {
	  /* int i = 10;
	  i = i++;
	  System.out.println(i);//注意：i=10 */
 //}
    /* public static void main8(String[] args){
	   int num = 5;
	   int i = 1;
	   int ret = 1;
	   int sum = 0;
	   while(i<=num){
		   ret *= i;
		   sum += ret;
		   i++;
	   }
	   System.out.println(sum);
   }
    public static void main7(String[] args) {
	 String str = "\"hello\"";
	 System.out.println(str);
 }
    public static void main6(String[] args) {
	 boolean flag = false;//boolean类型只有flase true两个取值
	 System.out.println(flag);
 }
    public static void main5(String[] args) {
	     byte a = 10;//-128-127  一个字节
		 byte b = 20; 
		 System.out.println(a +" " + b);//加号表示拼接
		 System.out.println(Byte.MAX_VALUE);//127
		 System.out.println(Byte.MIN_VALUE);//-128
		 System.out.println(Byte.MAX_VALUE+1);//println打印是以整型打印的  128（类型提升）
		 System.out.println();
 }
	 public static void main4(String[] args) {//string[] args的作用：代表运行命令行参数
		 for(int i = 0; i < args.length; i++){
			 System.out.println(args[i]);
		 }
		 System.out.println("hehe");
	 }
	 public static void main3(String[] args) {
		 long a = 10L;
		 float b = 1.0F;//浮点数默认为double类型
		 double c = 1.1;
		 System.out.println(c * c);//浮点数在内存中不能精确保存（小数点后 六位）
		 System.out.println(a);
		 System.out.println(b);
		 
	 }
	 public static void main2(String[] args) {
		 char ch = 'a';//字符类型0-2^16-1 没有负数
		 char ch1 = '高';//一个汉字占2个字节
		 System.out.println(ch);
		 System.out.println(ch1);
	 }
	 public static void main1(String[] args) {
		 double a = 1;
		 int b = 2;
		 double c = a / b;
		 System.out.println(c);
		 System.out.println(Integer.MAX_VALUE);
	 } */
 //}
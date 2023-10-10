//Day 1 : PS :-WAP to find smallest number among three given Numbers.
import java.util.Scanner;
public class SmallestNoAmongThree {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     Scanner sc=new Scanner(System.in);
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     int c=sc.nextInt();
	     int num,small;
	     num=a<b?a:b;
	     small=c<num?c:num;
	     System.out.println("Smallest No is:"+small);
		}
}

import java.util.Scanner;
import java.util.Arrays;
class LineComparisonUC2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first co-ordinates");
		int x1=scan.nextInt();
		int y1=scan.nextInt();
		System.out.println("Enter the second co-ordinates");
		int x2=scan.nextInt();
		int y2=scan.nextInt();
		int res1=(int)Math.sqrt(Math.pow((x2-x1),2));
		int res2=(int)Math.sqrt(Math.pow((y2-y1),2));
		String s1=""+res1;
		String s2=""+res2;
		System.out.println(s1.equals(s2));
		
	}
}

import java.util.Scanner;
import java.util.Arrays;
class LineComparisonUC3 
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
		Integer len1=new Integer(res1);
		Integer len2=new Integer(res2);
		
		if (len1.compareTo(len2)==0)
		{
			System.out.println("Two length are equals");
		}
		else if (len1.compareTo(len2)>0)
		{
			System.out.println("len1 is greater than len2");
		}
		else
		{
			System.out.println("len1 is lesser than len2");
		}
		
	}
}


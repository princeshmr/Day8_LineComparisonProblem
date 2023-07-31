import java.util.Scanner;
class LineComparisonUC1 
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
		int length=(int)Math.sqrt(Math.pow((x2-x2),2)+Math.pow((y2-y1),2));
		System.out.println("A length of two point is = "+length);
		//Math.pow((x2-x1),2);
	}
}

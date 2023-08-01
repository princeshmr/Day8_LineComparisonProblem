class LineComparisonUC4 
{
	int x1,x2,y1,y2;
	public void checkLength(int x1,int y1,int x2,int y2)
	{
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
	public static void main(String[] args) 
	{
		LineComparisonUC4 lineCompare=new LineComparisonUC4();
		
		lineCompare.checkLength(3,4,6,7);
		
	}
}



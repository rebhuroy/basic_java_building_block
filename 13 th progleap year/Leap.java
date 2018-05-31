class Date
{
		int dd,mm,yy;
		Date()
		{
			dd = 0;
			mm = 0;
			yy =  0;
			System.out.println("ffff");
		}
		Date(int d, int m, int y)
		{
			dd = d;
			mm =m;
			yy = y;
		}
		void display()
		{
			System.out.println("dd\t\tmm\t\tyyyy\t\tleap year");
			System.out.println(dd+"\t\t"+mm+"\t\t"+yy+"\t\t"+isLeap());
		}
		boolean isLeap()
		{
			boolean v;
			if((yy%4 == 0) && (yy%400 != 0) && (yy%100 != 0))
				v = true;
			else
				v =false;
			return v;
		}
}
public class Leap
{
	public static void main(String []args)
	{
		Date dt  = new Date();
		//dt.Date(16,11,1992);
		dt.display();
		System.out.println(dt.dd);
	}
}
	import java.io.*;
		class TaxiMeter
	{
		int taxiNo;
		String name;
		int km;
		TaxiMeter()
		  {
		taxiNo=0;
		name="";
		km=0;
		  }
		void input()throws IOException
		 {

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the Taxino");
		taxiNo=Integer.parseInt(br.readLine());
		System.out.println("Enter the NAME");
		name=br.readLine();
		System.out.println("Enter the kilometer");
		km=Integer.parseInt(br.readLine());
		 }

		int calculate()
		 {

		if(km<=1)
		return (5);
		else if(km<=6)
		return (10);
		else if(km<=12)
		return (15);
		else if(km<=18)
		return (20);
	    else
		return (25);
		 }

		void display()
		{

		System.out.println("Taxino\t"      +  "Name\t"    +    "Kilometers Travelled\t"   +   "Amt");
		System.out.println( taxiNo + "\t"      +       name + "\t"       +       km   + "\t\t\t"      +   calculate()   )	;

		}

	}
    class MainClass
		{
	public static void main(String []arg)throws IOException
	{
		TaxiMeter ob=new TaxiMeter();
		//ob.TaxiMeter();
		ob.input();
		ob.display();

	}
		}
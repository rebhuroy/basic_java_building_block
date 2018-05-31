import java.io.*;
class Mobike
{
	int bno;
	int phno;
	String name;
	int days;
	int charge;
	void input()throws Exception
	{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("enter bike number to be rented");
			bno = Integer.parseInt(br.readLine());
				System.out.println("enter phone number of customer");
			phno = Integer.parseInt(br.readLine());
				System.out.println("enter name of customer");
			name = br.readLine();
				System.out.println("how many days you want to hire");	
			days = 	Integer.parseInt(br.readLine());	
	}
	void compute()
	{
		if(days<=5)
			charge = 500 * days;
		else if((days >=6) && (days <= 10))
			charge =( (500 * 5) + (400 * (days-5)));
		else
			charge = (500*5)+(400*5)+(200*(days-10));
	}
	void display()
	{
		System.out.println("Bike No.\t\tPhone No.\t\tName\t\tNo of Days\t\tCharge");
		System.out.println(bno+"\t\t"+phno+"\t\t"+name+"\t\t"+days+"\t\t"+"\t\t"+charge);
	}
}

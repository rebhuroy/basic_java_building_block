import java.io.*;

class EmpSal
{
	
	String empName;
	float sal,da,hra,gross;
	
	void input()throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("name");
		
		empName=br.readLine();
		System.out.println("sal");
		sal=Float.parseFloat(br.readLine());
	}
	void cal()
	{
	da=	(float)(sal*.15);
	
	hra	=(float)(sal*.1);
	}
	void dis()
	{
		System.out.println("name\t\t sal \t\thra\t\t da\t\ttda\t\t");
		System.out.println(empName+"\t\t" +sal+"\tda\t\t"+ hra+"\t\t"+ da);
		
	}
	
	
	
	
}
public class EmpSalMain
{

	public static void main(String s[])throws Exception
	
	{
		EmpSal ob=new EmpSal();
		ob.input();
		ob.cal();
		ob.dis();
		
	}
}
import java.io.*;
class ArrOfObj
{
	String  name;
	int id;
ArrOfObj()
{
name="null";
id=0;	
	
}	
void input()throws IOException
{
BufferedReader br=new BufferedReader((new InputStreamReader(System.in)));
System.out.println("ENTER ID");	
id=Integer.parseInt(br.readLine());	
System.out.println("AND NAME");
name=br.readLine();
}
void dis()
{
	
System.out.println(id +"\t\t"+ name);	
}	
}
public class MainContain
{
public static void main(String arg[])throws IOException	
{
	ArrOfObj obj[]=new ArrOfObj[5];
	for(int i=0;i<3;i++)
	{
	
		obj[i]=new ArrOfObj();
	}
	for(int i=0;i<3;i++)
	{
		 
		obj[i].input();
	}
	System.out.println("AFTER INSERT\n");
	System.out.println("ID\t\t"+"NAME");
	for(int i=0;i<3;i++)
	{
		
		obj[i].dis();
	}
	
	
}	
	
}
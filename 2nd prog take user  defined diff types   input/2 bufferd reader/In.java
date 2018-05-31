import java.io.*;


 class Put
{
	
	void Inp()throws IOException
	
	{
		
		int var=0;
		for(int i=0;i<5;i++)
		{
			System.out.print("give inputs");
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			var+=Integer.parseInt(br.readLine());
			System.out.print(var);
		
		}
		
		
	}
	
}


class In
{
	
public static void main(String []args)throws IOException
	
	{
		
		Put ob=new Put();
		ob.Inp();
		
	}
	
}
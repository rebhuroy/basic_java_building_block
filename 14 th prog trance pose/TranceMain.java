
import java.io.*;

class Transepose
{
	
	
	int ma[][],t[][],n;
	
	Transepose()throws Exception
	{
		
		//System.out.println("ENTER THE VALUE OF ROW");
		System.out.println("ENTER THE VALUE OF row*column");
		InputStreamReader isr=new  InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		
		n=Integer.parseInt(br.readLine());
		ma=new int[n][n];
		t=new int[n][n];
		
	}
	
	void input()throws Exception
	{
		
		InputStreamReader isr=new  InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		
					for(int i=0;i<n;i++)
					for(int j=0;j<n;j++)
					{
						System.out.print("Enter the elements");
						ma[i][j]=Integer.parseInt(br.readLine());
						t[i][j]=ma[i][j];
						
						
					}
		
	}
	
	void trans()
	{
					
					for(int i=0;i<n;i++)
					for(int j=0;j<n;j++)
					t[i][j]=ma[j][i];	
					
		
	}
	
	void dis()
	{
		 
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
		System.out.print(t[i][j]+"\t");
	
	}
	System.out.println();
	}
		
	}
	
	
}


class TranceMain
{
	public static void main(String arg[])throws Exception
	{
	Transepose ob=new Transepose();
	
	ob.input();
	System.out.print("\n\n");
	System.out.println("BEFORE THE TRANCEPOSE");
	ob.dis();
	ob.trans();
	
	System.out.print("\n\n");
	System.out.println("After THE TRANCEPOSE");
	ob.dis();
	}
	
}
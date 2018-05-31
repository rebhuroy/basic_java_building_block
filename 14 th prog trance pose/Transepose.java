
import java.io.*;

class Transepose
{
	
	
	int m[][],t[][],n=3;
	
	Transepose()
	{
		m[][]=new m[n][n];
		t[][]=new m[n][n];
		
	}
	
	void input()throw Exception
	{
		
		InputStreamReader isr=new  InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		
		
					for(int i=0;i<n;i++)
					for(int j=0;j<n;j++)
					{
						
						m[i][j]=Integer.parseInt(br.readLine());
						
						
						
					}
		
	}
	
	void trans()
	{
					
					for(int i=0;i<n;i++)
					for(int j=0;j<n;j++)
					t[i][j]=m[j][i];	
					
		
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
	Transepose ob=new Transepose();
	
	ob.input();
	ob.trans();
	ob.dis();
	
}
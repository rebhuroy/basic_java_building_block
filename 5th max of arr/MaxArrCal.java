import java.io.*;


 class MaxArr
{
int[] arr=new int[10];
int i,max=0;	
	void Inp()throws IOException
	
	{
		
		
		for( i=0;i<10;i++)
		{
			System.out.print("give inputs");
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			arr[i]=Integer.parseInt(br.readLine());
			
		
		}
		
findMax();
	}
	void findMax()
	{
	for(i=0;i<10;i++)
	{
	if(arr[i]>max)
	max=arr[i];	
    }
	dis();
	}
void dis()
{
	
 System.out.println("maxval is"+max);
}
}


class MaxArrCal
{
	
public static void main(String []args)throws IOException
	
	{
		
		MaxArr ob=new MaxArr();
		ob.Inp();
		
	}
	
}
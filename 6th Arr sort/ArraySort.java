import java.io.*;


 class Sort
{
int[] arr=new int[10];
int i,temp,j;	
	void Inp()throws IOException
	
	{
		
		
		for( i=0;i<5;i++)
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
	for(i=0;i<5;i++)
	{
	for( j=i;j<5-i;j++)
	{	
if(arr[j]>arr[j+1])
{
temp=arr[j];
	arr[j]=arr[j+1];
	arr[j+1]=temp;
}
  }
	}
outPutData();
	}
void outPutData()
{
for(i=0;i<5;i++)	
 System.out.println(arr[i]);
}
}


class ArraySort
{
	
public static void main(String []args)throws IOException
	
	{
		
		Sort ob=new Sort();
		ob.Inp();
		
	}
	
}
import java.io.*;
import java.util.*;
public class Garbage_collection_Block
{
	
	int val;
	
	Garbage_collection_Block(int x)
	
	{
		val=x;
		System.out.println("This is constructor block and val is"+val);
		
		
	}
	void dis()
	{
		System.out.println("DIS PLAY FUNCTION"+val);
		
	}
	
	
	public static void main(String arg[])
	{
		try
		{
		Garbage_collection_Block ob=new Garbage_collection_Block(10);
		ob.dis();
		//ob.finalize();
		ob.dis();
		}
	catch(Throwable ex){}
	//ex.printStackTrace();
		

		}
	
	
}
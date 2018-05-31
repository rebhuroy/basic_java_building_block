public class Instance_Init_Block
{
	
	int val;
	
	Instance_Init_Block()
	{
		val=40;
		System.out.println("This is constructor block and val is"+val);
		
		
	}
	void dis()
	{
		System.out.println("this is ths the val of val variable"+val);
		
	}
	
	{
		
		
		val=35;
		System.out.println("This is instance initialiser block"+val);
		
	}
	public static void main(String arg[])
	{
		Instance_Init_Block ob=new Instance_Init_Block();
		ob.dis();
		
	}
	
	
}
class This_Use


	{
		int id;
		String name;
		void input(int id,String name)
		{
			id=id;
			name=name;
			//display();
			
		}
		
			void input1(int id,String name)
		{
			this.id=id;
			this.name=name;
			//display();
			
		}
		void display()
		{
			
	System.out.println("id="+id+"\tname="+ name);
			
		}
		
		
		
		
	}
	public class This_Use_Main
	{
		public static void main(String arg[])
		{
		This_Use obj;
		obj =new This_Use();
		System.out.println("BEFORE USE OF THIS CONTENT");
		obj.input(10,"rebhu");
		obj.display();
		System.out.println("AFTER USE OF THIS CONTENT");
		obj.input1(10,"rebhu");
		obj.display();
	}
	}
import java.io.*;
class PolyCal
{
int n;
double val;
void input()throws IOException
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("GIVE THE INPUT]");
n=Integer.parseInt(br.readLine());
cal();
}
void cal()
{
val=((Math.pow(n,6)+Math.pow(n,4)+Math.pow(n,2)+10)/(Math.pow(n,5)+Math.pow(n,3)+n));	
dis();	
}	
void dis()
{
	System.out.println(val);
}
	
	
}


class MainContain{
public static void main(String a[])throws IOException
{
	PolyCal ob=new PolyCal();
	ob.input();
	
}	
	
	
	
}
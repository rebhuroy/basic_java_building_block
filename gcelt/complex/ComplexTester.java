import java.util.Scanner;
class Complex
{
	 float real;
	 float img;
	Complex()
	{
		real = 0;
		img = 0;
	}
	Complex(float r, float i )
	{
		real = r;
		img = i;
	}
	Complex get_input(Complex a)
	{
		Scanner input = new Scanner(System.in);
		Complex n= new Complex();
		System.out.println("Enter the real no. : ");
		real = input.nextFloat();
		System.out.println("Enter the img no. : ");
		img = input.nextFloat();
		return (n);
	}
	void display()
	{
		System.out.println("\n\tThe number is "+real +"+i"+img);
	}
	Complex mult( Complex c1,Complex c2)
	{
		Complex c3 = new Complex();
		c3.real = c1.real*c2.real-c1.img*c2.img;
		c3.img = c1.img*c2.real + c1.real*c2.img;
		return (c3);
	}
	Complex add( Complex c1,Complex c2)
	{
		Complex c3 = new Complex();
		c3.real = c1.real+c2.real;
		c3.img = c1.img+c2.img;
		return (c3);
	}
	public static void main(String []args)
	{   Complex n1 = new Complex();
		Complex n2= new Complex();
		Complex n3= new Complex();
		n1.get_input(n1);
		n2.get_input(n2);
		n1.display();
		n2.display();
		System.out.println("\n\tAddition ");
		n3 = n3.add(n1, n2);
                n3.display();
		System.out.println("\n\tMultiplication ");
		n3 = n3.mult(n1, n2);
                n3.display();
	}
}

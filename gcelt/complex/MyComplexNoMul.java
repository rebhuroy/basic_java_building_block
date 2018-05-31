import java.util.Scanner; 

public class MyComplexNoMulMyComplexNoMul{ 

public static void main(String[] args) { 
Scanner sc = new Scanner( System.in ); 
System.out.println("This program calculates a doughnut"); 
System.out.print("Please enter the outer radius -> "); 
String aVal = sc.nextLine(); 
System.out.println("Please enter the value b -> "); 
String bVal = sc.nextLine(); 
System.out.print("Please enter Plant's constant -> "); 
String iVal = sc.nextLine(); 
System.out.print("Please enter the c variable -> " ); 
String cVal = sc.nextLine(); 
System.out.println("Lastly, please enter the d variable -> "); 
String dVal = sc.nextLine(); 

double a = Double.parseDouble( aVal); 
double b = Double.parseDouble( bVal); 
double c = Double.parseDouble( cVal); 
double i = Doublle.parseDouble( iVal); 
double d = Double.parseDouble(dVal); 
/* else if ( choice == 3 )
    {
      c.real = a.real*b.real - a.img*b.img;
      c.img = a.img*b.real + a.real*b.img;
 
      if ( c.img >= 0 )
        printf("Multiplication of two complex numbers = %d + %di",c.real,c.img);
      else
        printf("Multiplication of two complex numbers = %d %di",c.real,c.img);
    }
    */
System.out.println("The doughnut, calcuated, is worth: " + 
(a + (b*i) ) * (c + (d*i)) ); 
} 
}
class complex_mul

{
  int real, img;

 
public static void main(String ar[]) 
{
  int choice, temp1, temp2, temp3;
 complex_mul a, b, c;
 
  while(1)
  {
    System.out.printf("Press 1 to add two complex numbers.\n");
    System.out.printf("Press 2 to subtract two complex numbers.\n");
    System.out.printf("Press 3 to multiply two complex numbers.\n");
     System.out.printf("Press 4 to divide two complex numbers.\n");
     System.out.printf("Press 5 to exit.\n");
     System.out.printf("Enter your choice\n");
    scanf("%d",&choice);
 
    if( choice == 5)
      exit(0);
 
    if(choice >= 1 && choice <= 4)
    {
       System.out.printf("Enter a and b where a + ib is the first complex number.");
       System.out.printf("\na = ");
      scanf("%d", &a.real);
       System.out.printf("b = ");
      scanf("%d", &a.img);
       System.out.printf("Enter c and d where c + id is the second complex number.");
      printf("\nc = ");
      scanf("%d", &b.real);
       System.out.printf("d = ");
      scanf("%d", &b.img);
    }
   
    
     
    else if ( choice == 3 )
    {
      c.real = a.real*b.real - a.img*b.img;
      c.img = a.img*b.real + a.real*b.img;
 
      if ( c.img >= 0 )
        printf("Multiplication of two complex numbers = %d + %di",c.real,c.img);
      else
        printf("Multiplication of two complex numbers = %d %di",c.real,c.img);
    }
    
      }
    }
    else
      printf("Invalid choice.");
 
    printf("\nPress any key to enter choice again...\n");
  }
}
}
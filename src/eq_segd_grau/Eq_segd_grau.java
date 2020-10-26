package eq_segd_grau;

import java.util.Scanner;

public class Eq_segd_grau {

    public static void main(String[] args)
    {
    Scanner leia = new Scanner(System.in);
    double a, b, c, delta, x1, x2;
     
    System.out.println("Informe o 1° n°(A):");
    a = leia.nextDouble();
    System.out.println("Informe o 2² n°(B):");
    b = leia.nextDouble();
    System.out.println("Informe o 3° n°(C):");
    c = leia.nextDouble();
    
   if(a!=0)
   {
    delta = Math.pow(b, 2)-(4*a*c); 
     if(delta < 0)
     { 
     System.out.print("A equação não possuí resultados reais.");
     }
      else if(delta == 0)
      {
      x1 = (((-b)+Math.sqrt(delta))/(2*a));
      System.out.println("O valor de x1 = "+x1);
      } 
       else if (delta > 0)
       { 
       x1 = (((-b)+Math.sqrt(delta))/(2*a));
       x2 = (((-b)-Math.sqrt(delta))/(2*a));
       System.out.println("O valor de x1 = "+x1);
       System.out.println("O valor de x2 = "+x2);
       }
    }
    else
    {
    System.out.println("Essa equação não existe.");
    }
   
  } 
}    
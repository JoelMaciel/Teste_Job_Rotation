import java.util.Scanner;
 
public class Fibonacci 
{    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Entre com um número positivo. :");
         
        int numeroDigitado = sc.nextInt();
         
        int primeiroNumero = 0;
         
        int segundoNumero = 1;
         
        int terceiroNumero = 0;
         
        while ( terceiroNumero  < numeroDigitado )
        {
            terceiroNumero = primeiroNumero + segundoNumero ;
             
            primeiroNumero = segundoNumero ;
             
            segundoNumero = terceiroNumero ;

	   System.out.println(terceiroNumero);
        }
         
        if( terceiroNumero == numeroDigitado )
        {
            System.out.println("O número pertence a série de Fibonacci");
        }
        else
        {
            System.out.println("O número não pertence a série de Fibonacci");
        }
    }   
}
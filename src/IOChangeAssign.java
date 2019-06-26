import java.util.Scanner;

public class IOChangeAssign
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print( "Enter first value:  " );
        double num1 = keyboard.nextDouble();

        System.out.print( "Enter second value:  " );
       double num2 = keyboard.nextDouble();

       double avgNum = (num1 + num2)/2;

        System.out.println("The average of the two values is : " + avgNum);
    }
}
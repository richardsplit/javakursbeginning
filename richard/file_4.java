package richard;
import java.util.Scanner;

public class file_4
{

    public static void main (String [] args)
    /*
    Периметър и лице на правоъгълник
    a-страна
    b-страна
    S-лице
    P-периметър
     */

    {
        double a,b,S,P;

        Scanner input= new Scanner(System.in);
        System.out.print ("Въведете страна 1:");
        a =input.nextInt();

        System.out.print ("Въведете страна 2:");
        b=input.nextInt();

        S=a*b;
        System.out.println("Лицето на правоъгълника е:" +S);

        P=2*(a+b);
        System.out.print("Периметъра на правоъгълника е:" +P);


    }
}

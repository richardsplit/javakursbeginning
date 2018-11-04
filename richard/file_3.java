package richard;
import java.util.Scanner;



public class file_3
{

    public static void main (String []args )
        {


            /*oznacheniq:
            окръжност
            S-lice na okrujnost
            P-obikolka
            r-radius
            d-diametur
            d1-диаметъра на окръжност
            S1-centur
            */

            double S,P,r,d;
            double pi= Math.PI;

            Scanner input = new Scanner (System.in);
            System.out.print("Въведете стойност за рaдиуса:");
            r=input.nextInt ();


            d=2*r;
            System.out.println("Диаметъра на окръжноста е:"+d);

            S = pi *(r*r) ;
            System.out.println("Лицето на окръжноста:"+S);

            P =2*pi*r ;
            System.out.println("Обиколката на окръжноста е:" +P);




        }
}

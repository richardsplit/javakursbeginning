
package richard;
import java.util.Scanner ;

public class file_5
{
    public static void main (String [] args)
    {
        double S, P, a, b, c;

        Scanner input = new Scanner(System.in);
        System.out.print("Въведете страна а:");
        a=input.nextInt();
        System.out.print("Въведете страна б:");
        b=input.nextInt();
        System.out.print("Въведете страна c:");
        c=input.nextInt();

        P = ((a + b + c) / 2);
        S= Math.sqrt (P * (P - a)*(P - b)*(P - c));

        if (a<=0)
        {


            if (b <= 0)
            {
                if (c <= 0)
                {
                    System.out.println("Няма въведена страна c");
                }

                    System.out.println("Няма въведена страна б");
            }

            System.out.println("Няма въведена страна a");
        }

                    else {

            System.out.print("Полупериметърът е:" + P);
            System.out.print("Лицето на триъгълника с зададени 3-те страни е:" + S);

                      }


    }

}

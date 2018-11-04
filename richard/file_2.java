package richard;

import java.util.Scanner ;


public class file_2
{

    public static void main (String [] args)
    {
        //Purvata programa
        // Scanner input = new Scanner(System.in);

        // System.out.println("Na kolko si godini?  ");
        // int age = input.nextInt();

        //System.out.println("Ti si na "+age);
        int a,b;
        double number ;

        Scanner input = new Scanner(System.in);
        System.out.println("Vyvedete chislo a: ");
        a=input.nextInt();
        System.out.println("Vyvedete chislo b: ");
        b=input.nextInt();

        number =a%b;

       if (a<b)
       {
           System.out.println("Da, a e po malko ot b");

       }
          else  if (a==b)
            {
            System.out.println("a i b sa ravni");
            }

        else
        {
            System.out.println("a,ne e po malko ot b i");
            System.out.println("Resultata ot a:b e:"+number);
         }

    }
}


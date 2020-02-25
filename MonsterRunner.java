//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
    public static void main( String args[] )
    {
        Scanner input = new Scanner(System.in);

        //ask for name and size
        System.out.println("Enter 1st monster's name : ");
        String name = input.next();
        System.out.println("Enter 1st monster's size : ");
        int size = input.nextInt();
        //instantiate monster one
        Monster one = new Monster(name,size);

        //ask for name and size
        System.out.println("Enter 2nd monster's name : ");
        name = input.next();
        System.out.println("Enter 2nd monster's size : ");
        size = input.nextInt();
        //instantiate monster two
        Monster two = new Monster(name,size);

        System.out.println("Monster 1 - " + one.getName() + " " + one.getHowBig());
        System.out.println("Monster 2 - " + two.getName() + " " + two.getHowBig());

        if(one.getHowBig() > two.getHowBig()) {
            System.out.println("Monter one is bigger than Monster two.");
        }else{
            System.out.println("Monter one is smaller than Monster two.");
        }
        if(one.getName().equals(two.getName())){
            System.out.println("Monter one has the same name as Monster two.");
        }else{
            System.out.println("Monter one does not have the same name as Monster two.");
        }
    }
}
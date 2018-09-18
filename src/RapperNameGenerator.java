import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class RapperNameGenerator {
    public static void main(String[]args){

        Scanner input;
        String personsName;
        String[] firstName;
        String[] Adjective;
        Random random = new Random();
        int otherNumber = random.nextInt(5);
        int number2 = random.nextInt(5);
        int randomNumber =(int) ((Math.random()*100)%4)-1;

        input = new Scanner(System.in);
        System.out.println("What is your pre-rappin career name that yo parents gave ya?");
        personsName = input.nextLine();

        Adjective = new String[5];
        Adjective[0] = "Lil" ;
        Adjective[1] = "Ugly";
        Adjective[2] = "Gucci";
        Adjective[3] = "Crystal";
        Adjective[4] = "Shiny";

        firstName = new String[5];
        firstName[0] = "Shelf" ;
        firstName[1] = "Mountain";
        firstName[2] = "Sharktooth";
        firstName[3] = "Silver";
        firstName[4] = "Oompa";



        System.out.println("Ok "+personsName+", are you ready to be a rapper? You first need a rapper name which I " +
                "can help you with.\nYour rapper name will be "+Adjective[number2] +" "+ firstName[otherNumber]);

        //System.out.println(firstName[0]);
    }
}

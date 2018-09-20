import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;

public class RapperNameGenerator {
    public static void main(String[]args){

        Scanner input;
        String personsName;
        String[] Adjective;
        String[] Object;
        String rapperName;
        String[] albumFirstPart;
        String[] albumSecondPart;
        String albumName;
        String[] songFirstPart;
        String[] songSecondPart;
        String songName;

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

        Object = new String[5];
        Object[0] = "Shelf" ;
        Object[1] = "Mountain";
        Object[2] = "Sharktooth";
        Object[3] = "Silver";
        Object[4] = "Oompa";

        rapperName = Adjective[number2]+" "+Object[number2];

        albumFirstPart = new String[5];
        albumFirstPart[0] = "Never Ending";
        albumFirstPart[1] = "Undying";
        albumFirstPart[2] = "Weird";
        albumFirstPart[3] = "Sharp";
        albumFirstPart[4] = "Creepy";

        albumSecondPart = new String[5];
        albumSecondPart[0] = "Love";
        albumSecondPart[1] = "Money";
        albumSecondPart[2] = "Skills";
        albumSecondPart[3] = "Personality";
        albumSecondPart[4] = "Heart";

        songFirstPart = new String[5];
        songFirstPart[0] = "Quick";
        songFirstPart[1] = "Smelly";
        songFirstPart[2] = "Bright";
        songFirstPart[3] = "Inside";
        songFirstPart[4] = "Pringle";

        songSecondPart = new String[5];
        songSecondPart[0] = "Reflexes";
        songSecondPart[1] = "Heartbeat";
        songSecondPart[2] = "Greetings";
        songSecondPart[3] = "Queue";
        songSecondPart[4] = "Man";

        //Displays Rapper Name
        System.out.println("Ok "+personsName+", are yo ready to be a rapper? Yo first need a rapper name which I " +
                "can help yo with.\nYour rapper name will be "+Adjective[number2] +" "+ Object[otherNumber]);

        //Displays Rapper's Albums Name
        System.out.println("Now we need to make your first album name.\nDon't worry I'll name if for yo.");
        System.out.print("Yo album name is "+rapperName+".");

        //Displays Rapper's First Song Name
        System.out.println(" Great! Now that we've figured out the Album's name, let's figure out yo first songs' " +
                "name.");
        System.out.println("Aha it'll be named "+songFirstPart[number2]+" "+songSecondPart[number2]+"!");

        //Displaying Information of The First Song
        System.out.println("Now that we've figure out all of yo wants and needs to start yo rappa career, lets see what" +
                "it looks like. ");
        System.out.println("Rapper Name: "+rapperName);
    }
}

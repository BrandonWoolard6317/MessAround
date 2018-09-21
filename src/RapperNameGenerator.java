import java.util.Random;
import java.util.Scanner;

public class RapperNameGenerator {
    public static void main(String[]args){

        Scanner input;
        String personsName;
        String yesOrNo;
        String[] Adjective;
        String[] Object;
        String rapperName;
        String rapperName2;
        String[] albumFirstPart;
        String[] albumSecondPart;
        String albumName;
        String albumName2;
        String[] songFirstPart;
        String[] songSecondPart;
        String songName;
        int usersAnswer;

        input = new Scanner(System.in);
        Random random = new Random();
        int otherNumber = random.nextInt(5);
        int number2 = random.nextInt(5);
        int randomNumber =(int) ((Math.random()*100)%4)-1;

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

        rapperName = (Adjective[number2]+" "+Object[number2]);
        rapperName2 = (Adjective[otherNumber]+" "+Object[otherNumber]);

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

        albumName = (albumFirstPart[number2]+" "+albumSecondPart[number2]);
        albumName2 = (albumFirstPart[otherNumber]+" "+albumSecondPart[otherNumber]);

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

        songName = (songFirstPart[number2]+" "+songSecondPart[number2]);

        //Displays Rapper Name
        System.out.println("Ok "+personsName+", are yo ready to be a rapper? Yo first need a rapper name which I " +
                "can help yo with.\n\nYour rapper name will be "+rapperName+". If you don't like it I can give you" +
                "another one but that'll be your last choice because I'm low on options my man.");
        System.out.println("\n1 if you want to keep it the same\n2 if you want a different rapper name");
        yesOrNo = input.nextLine();
        usersAnswer = Integer.parseInt(String.valueOf(yesOrNo));
        if(usersAnswer == 2){
            System.out.println("Ok you will go by the name "+rapperName2+" so get used to it homie.");
            rapperName = rapperName2;
        }

        //Displays Rapper's Albums Name
        System.out.println("\nNow we need to make your first album name.\n\nDon't worry I'll name if for yo.");
        System.out.print("\nYo album name will be "+albumName+". Sounds good to me! Do you like it dog? If not I can" +
                " pick another one. But no more taksey backseys!");
        System.out.println("\n1 if you want to keep it the same\n2 if you want a different album name");
        yesOrNo = input.nextLine();
        usersAnswer = Integer.parseInt(String.valueOf(yesOrNo));
        if(usersAnswer == 2){
            System.out.println("Ok your album will officially be named "+albumName2+"!");
            albumName = albumName2;
        }

        //Displays Rapper's First Song Name
        System.out.println("\nGreat! Now that we've figured out the Album's name, let's figure out yo first songs' " +
                "name.");
        System.out.println("\nAha it'll be named "+songName+"! That's the only option you get because you'll have " +
                "more than one song so you can figure out the name of rest of your album.");

        //Displaying Information of The First Song
        System.out.println("\nNow that we've figure out all of yo wants and needs to start yo rappa career, lets see what" +
                "it looks like. For yo first song!");
        System.out.println("\nRapper Name: "+rapperName+"\nAlbum Name: "+albumName+"\nSong Name: "+songName);
    }
}
import java.util.Scanner;

public class Class1 {
    public static void main(String[]args){
        
        Scanner keyboard;
        int numberOne;
        int numberTwo;
        int numberThree;
        int numberFour;
        int numberFive;
        int numberSix;
        int numberSeven;
        int numberEight;
        int numberNine;
        int numberTen;
        int numberEleven;
        int numberTwelve;

        keyboard = new Scanner(System.in);
        numberOne = (int) (Math.random() * 9);
        numberTwo = (int) (Math.random() * 9);
        numberThree = (int) (Math.random() * 9);
        numberFour = (int) (Math.random() * 9);
        numberFive = (int) (Math.random() * 9);
        numberSix = (int) (Math.random() * 9);
        numberSeven = (int) (Math.random() * 9);
        numberEight = (int) (Math.random() * 9);
        numberNine = (int) (Math.random() * 9);
        numberTen = (int) (Math.random() * 9);
        numberEleven = (int) (Math.random() * 9);
        numberTwelve = (int) (Math.random() * 9);

        System.out.println(numberOne+""+numberTwo+""+numberThree+""+numberFour+"-"+numberFive+""+numberSix+""+numberSeven
                +""+numberEight+"-"+numberNine+""+numberTen+""+numberEleven+""+numberTwelve);
    }
}
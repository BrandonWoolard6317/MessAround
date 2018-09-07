import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
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

        Scanner keyboard = new Scanner(System.in);

        numberOne = 1;
        numberTwo = 2;
        numberThree = 3;
        numberFour = 4;
        numberFive = 5;
        numberSix = 6;
        numberSeven = 7;
        numberEight = 8;
        numberNine = 9;
        numberTen = 10;
        
        System.out.println("");

    }
}

import java.util.Scanner;

public class CheckFromWeek {
    public static void main(String[] args) {
        String Hours;
        int weekBonus;
        int unionFees;
        int Cash;
        int Tax;
        int beforeTax;
        int afterTax;

        Scanner keyboard = new Scanner(System.in);
        
        weekBonus = 116;
        unionFees = 30;
	    
        System.out.println("Hours worked this week?")
        Hours = keyboard.nextLine();
        
        Cash = (Hours * 10.35);
        Tax = (Cash * 0.0575);
        beforeTax = Cash + weekBonus
        afterTax = (beforeTax - Tax) - unionFees;
        
        System.out.println("Name: Brandon Woolard")
        System.out.println("Hours Worked: " + Hours)
        System.out.println("Before Tax: " + beforeTax)
        System.out.println("Tax: " + Tax)
        System.out.println("Union Fees: " + unionFees)
        System.out.println("After Taxes: " + afterTax)
    }   
}

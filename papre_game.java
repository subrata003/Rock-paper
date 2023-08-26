package java1;
import java.util.Random;
import java.util.Scanner;

public class papre_game {
    public static void main(String []arg){
        int  computerchoice,userchoice,rock,paper,scissors;
        Scanner re=new Scanner(System.in);
        Random sc=new Random();

        rock=0;
        paper=1;
        scissors=2;


            System.out.println("Rock - Paper - Scussors Game");
            System.out.println("Enter your choice (rock=0_paper=1_scissors=2 :");
            userchoice = re.nextInt();
            while (userchoice > 2) {
                System.out.println("Enter number (0-2)");
                userchoice = re.nextInt();
            }
            if (userchoice == 0) {
                System.out.println("User choice = Rock");
            } else if (userchoice == 1) {
                System.out.println("User choice = Paper");

            } else {
                System.out.println("User choice = Scissors");

            }
            computerchoice = sc.nextInt(3);
            if (computerchoice == 0) {
                System.out.println("Computer choice = Rock");
            } else if (computerchoice == 1) {

                System.out.println("Computer choice = Paper");
            } else {
                System.out.println("Computer choice = Scissors ");

            }
            while (userchoice == computerchoice)
            {
                System.out.println("Draw try Again !!");
                System.out.println("Enter your choice (rock=0_paper=1_scissors=2 :");
                userchoice = re.nextInt();
                while (userchoice > 2)
                {
                    System.out.println("Enter number (0-2)");
                    userchoice = re.nextInt();
                }



                     computerchoice = sc.nextInt(3);


         if (userchoice == rock)
        {
            System.out.println("User chose ROCK");
        }
        else
        {
            if(userchoice== paper)
            {
                System.out.println("User chose PAPER");
            }
            else
            {
                System.out.println("User chose SCISSORS");
            }
        }
                if(computerchoice == rock)
                {
                    System.out.println("Computer chose ROCK");
                }
                else
                {
                    if(computerchoice == paper)
                    {
                        System.out.println("Computer chose PAPER");
                    }
                    else
                    {
                        System.out.println("Computer chose SCISSORS");
                    }
                }
            }
            if (userchoice==paper){
                if (computerchoice==rock)
                {
                    System.out.println("User wins!!");
                }
                else {
                    System.out.println("Computer wins!!");
                }
            } else if (userchoice==rock) {
                if (computerchoice==scissors){
                    System.out.println("User wins!!");
                }
                else {
                    System.out.println("Computer wins!!");
                }
                
                
            } else if (userchoice==scissors) {
                if (computerchoice==paper) {
                    System.out.println("User wins!!");
                }
                else {
                    System.out.println("Computer wins!!");
                }
                
            }


    }
}

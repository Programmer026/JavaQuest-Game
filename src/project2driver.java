
import java.util.*;

public class project2driver {



    public static void main(String[] args) {
        // Ceate new scanner and random object
        Scanner input = new Scanner(System.in);
        Random numb = new Random();
        // Print introductory message
        System.out.println(" Welcome to JavaQuest");
        System.out.println("Stay alive and increase your score!");
        System.out.println("");
        System.out.println("choose a character...");
        System.out.print("{k}Knight || {h}Healer || {w}Wizard || {t}Thief \n>>");
        // Variable t colleck user choice of player
        String cho = input.next();
        Player g1 = new Knight();
        //To seleck which class the user is calling
        if(cho.equals("k")){
            g1 = new Knight();
            System.out.println("");
            System.out.println("Welcome Knight!");
        }

        else if(cho.equals("h")){
            g1 = new Healer();
            System.out.println("");
            System.out.println("Welcome Healer!");
        }
        else if(cho.equals("t")){
            g1 = new Thief();
            System.out.println("");
            System.out.println("Welcome Thief!");
        }
        else if(cho.equals("w")){
            g1 = new Wizard();
            System.out.println("");
            System.out.println("Welcome Wizard!");
        }
        // To prompt user and collect input
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.print("{?}Status Report || {n}{s}{e}{w} Move 1 space North, South, East, or West || {q} Quit \n>> ");
        String cho2 = input.next().toLowerCase();
        // Loop to keep program going tilluser is ready to quit
        while(! (cho2.equals("q"))) {
            // if user wshes to see status
            if(cho2.equals("?")){
                System.out.println(g1);
                System.out.println();
            }
            // if user wishes to move to a particular direction
            else if (cho2.equals("n") || cho2.equals("s") || cho2.equals("e") || cho2.equals("w")){
                int attack = numb.nextInt(10) + 1;
                switch (attack){
                    // case ro determine whether user is safe or bein attacked by a foe
                    case 1:
                    case 2:
                        // if user is being attacked by a foe, random number to chose wich foe is attacking
                        int foe = numb.nextInt(2);
                        if (foe == 0){
                            System.out.println("Oh no! You are being attacked by a zombie");
                        }
                        else if (foe == 1){
                            System.out.println("Oh no! You are being attacked by a bandit");
                        }
                        else if (foe == 2){
                            System.out.println("Oh no! You are being attacked by a lobbyist");
                        }
                        // prompt user for option
                        System.out.print("How would you like to handle this? \n{s}Special Move || {r}Run! \n>>");
                        String cho3 = input.next();
                        // if user wishes to use special move
                        if(cho3.equals("s")){
                            System.out.println("Prepare for battle");
                            System.out.println("Press any letter then Enter to continue.... ");
                            String x = input.next().toLowerCase();
                            System.out.println("****************************************");
                            g1.useSpecialMove();
                            int win = numb.nextInt(10) + 1;
                            // to determin is user wins or losses
                            if(win < 7){
                                System.out.println("Player wins! Increase score by 2 points!");
                                g1.playerWins();
                            }
                            else if (win > 6){
                                System.out.println("Player Loses! Decrease health by one point");
                                g1.playerLoses();
                            }
                            // Print out user staus
                            System.out.println(g1);

                        }
                        // if user chooses to run
                        else if (cho3.equals("r")){
                            int run = numb.nextInt(10) + 1;
                            //To determine if payer wins or losses
                            if (run < 6){
                                System.out.println("Run is successful! Increase score by 1");
                                g1.runSuccess();
                                System.out.println(g1);
                            }
                            else if (run > 5){
                                System.out.println("Run is not successful!");
                                // if Player losses, use secial move
                                System.out.println("Prepare for battle");
                                System.out.println("Press any letter then Enter to continue....");
                                String x = input.next();
                                System.out.println("**************************************");
                                g1.useSpecialMove();
                                int win = numb.nextInt(10) + 1;
                                if (win < 7){
                                    System.out.println("Player wins! Increase score by 2 points!");
                                    g1.playerWins();
                                }
                                else if (win > 6){
                                    System.out.println("Player Loses! Decrease health by one point");
                                    g1.playerLoses();

                                }
                                System.out.println(g1);
                                System.out.println();

                            }
                        }
                        break;
                    // if player is not attcked by a foe
                    default:
                        int place = numb.nextInt(3);
                        System.out.println("**************************************");
                        // if statements to determine what the player encounters
                        if (place == 0){
                            System.out.println("Nothing here....");
                        }
                        else if (place == 1){
                            System.out.println("Nice trees around here....");
                        }
                        else if (place == 2){
                            System.out.println("Interesting cottage there.....");
                        }
                        else if(place == 3){
                            System.out.println("Potty break....");
                        }
                        System.out.println("*****************************************");
                        System.out.println();
                        g1.playerSafe();
                        break;
                }
            }
            else if(!(cho2.equals("n")&&cho2.equals("s")&&cho2.equals("e")&&cho2.equals("w"))){
                System.out.println("Invalid option \nplease choose again!");
            }
            // if health is 0, break out of loop
            if (g1.getHealth() == 0) {
                System.out.println("You have run out of Health!");
                break;
            }
            // statment to keep loop ging
            System.out.println("What would you like to do? ");
            System.out.print("{?} Status Report || {n} {s} {e} {w} Move 1 space North, South, East, or West || {q} Quit \n>>");
            cho2 = input.next();
        }
        // ending statment of program
        System.out.println("**************************************************\n********************************************");
        System.out.println("The game has come to an end! Final stats: ");
        System.out.println( );
        System.out.println(g1.toString());
        System.out.println("Thanks For Playing!");
    }

}

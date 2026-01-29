/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

import java.util.Scanner;

class starter {
    public static String getObject(){
        int x = (int)(Math.random() * 3) + 1;
        if(x == 1){
            return "scissors";
        }
        else if(x == 2){
            return "rock";
        }
        else{
            return "paper";
        }9
    }

    public static int compare2(String player1, String player2){
        if(player1.equals("scissors") && player2.equals("rock")){
            return 2;
        }
        else if(player1.equals("scissors") && player2.equals("paper")){
            return 1;
        }
        else if(player1.equals("scissors") && player2.equals("scissors")){
            return 0;
        }
        else if(player1.equals("rock") && player2.equals("rock")){
            return 0;
        }
        else if(player1.equals("rock") && player2.equals("paper")){
            return 2;
        }
        else if(player1.equals("rock") && player2.equals("scissors")){
            return 1;
        }
        else if(player1.equals("paper") && player2.equals("paper")){
            return 0;
        }
        else if(player1.equals("paper") && player2.equals("rock")){
            return 1;
        }
        else if(player1.equals("paper") && player2.equals("scissors")){
            return 2;
        }
        return -1; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean playing = true;

        while (playing) {
            System.out.print("Would you like to play? (yes/no/done): ");
            String response = sc.nextLine();

            if (response.equals("yes")) {
                String userChoice = "";
                while (true) {
                    System.out.print("Enter rock, paper, or scissors: ");
                    userChoice = sc.nextLine().toLowerCase();
                    if (userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")) {
                        break;
                    } else {
                        System.out.println("Invalid input. Try again.");
                    }
                }

                String computerChoice = getObject();
                System.out.println("Computer chose: " + computerChoice);

                int result = compare2(userChoice, computerChoice);
                if (result == 0) {
                    System.out.println("It's a tie!");
                } else if (result == 1) {
                    System.out.println("You win!");
                } else if (result == 2) {
                    System.out.println("Computer wins!");
                } else {
                    System.out.println("Error in determining result.");
                }

            } else if (response.equals("no")) {
                System.out.print("How many times should the computer play itself? ");
                int rounds = sc.nextInt();
                sc.nextLine(); 

                int p1Wins = 0;
                int p2Wins = 0;
                int ties = 0;

                for (int i = 0; i < rounds; i++) {
                    String p1 = getObject();
                    String p2 = getObject();
                    int result = compare2(p1, p2);

                    if (result == 0) ties++;
                    else if (result == 1) p1Wins++;
                    else if (result == 2) p2Wins++;

                }

                System.out.println("Summary:");
                System.out.println("Player 1 Wins: " + p1Wins);
                System.out.println("Player 2 Wins: " + p2Wins);
                System.out.println("Ties: " + ties);

            } else if (response.equals("done")) {
                playing = false;
                System.out.println("Thanks for playing!");
            } else {
                System.out.println("Please type 'yes', 'no', or 'done'.");
            }
        }

    }
}
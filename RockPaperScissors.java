import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        int user = 0;
        int computer = 0;
        int tie = 0;


        Scanner sc = new Scanner(System.in);
        System.out.println("How many rounds between 1 and 10 you want to play: ");
        int numberRounds = sc.nextInt();

        if (numberRounds < 1 || numberRounds > 10) {
            System.out.println("Error! Rounds out of range!");
            System.exit(0);
        }

        for (int i = 0; i < numberRounds; i++) {

            Scanner game = new Scanner(System.in);
            System.out.println("Choose: 1=paper, 2=scissor, 3=rock ");
            int userchoice = game.nextInt();

            Scanner comp = new Scanner(System.in);
            int compchoice = getRandomInteger(3, 1);
            System.out.println("Computer's choice: " + compchoice);

            if (userchoice == compchoice) {
                tie++;
                System.out.println("Number of ties: " + tie);

            } else if (userchoice == 3 && compchoice == 2) {
                user++;
                System.out.println("User wins! Total wins for user: " + user);

            } else if (userchoice == 3 && compchoice == 1) {
                computer++;
                System.out.println("Computer wins! Total wins for computer: " + computer);

            } else if (userchoice == 2 && compchoice == 3) {
                computer++;
                System.out.println("Computer wins! Total wins for computer: " + computer);

            } else if (userchoice == 2 && compchoice == 1) {
                user++;
                System.out.println("User wins! Total wins for user: " + user);

            } else if (userchoice == 1 && compchoice == 3){
                user++;
                System.out.println("User wins! Total wins for user: " + user);

            } else if(userchoice == 1 && compchoice == 2){
                computer++;
                System.out.println("Computer wins! Total wins for computer: " + computer);
            }

        }
        System.out.println("Final score for user: " + user);
        System.out.println("Final score for computer: " + computer);
        System.out.println("Number of ties: " + tie);
        if(user > computer){
            System.out.println("The user is the winner!");
        }
        else if(computer > user){
            System.out.println("The computer is the winner");
        }
        else if (user == computer){
            System.out.println("There is tie!");
        }

        Scanner playAgain = new Scanner(System.in);
        System.out.println("Do you want to play again? 1=Yes, 2=No");
        int response =  playAgain.nextInt();
        if(response == 2){
            System.out.println("Thanks for playing|!");
            System.exit(0);
        }else{
            main(args);
        }
    }

    public static int getRandomInteger(int maximum, int minimum) {
        return ((int) (Math.random() * (maximum - minimum))) + minimum;
    }

}

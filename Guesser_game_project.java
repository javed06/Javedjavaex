package javaproject;
import java.util.Scanner;

class Guesser {
    int guessNum;

    int guessingNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! guess the number");

        guessNum = sc.nextInt();
        return guessNum;
    }
}
class Player{
    int guessNum;
    int guessingNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Player  ! guess the number");
        guessNum=sc.nextInt();
        return guessNum;
    }
}

class Umpire {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesser G_obj = new Guesser();
        numFromGuesser = G_obj.guessingNum();
    }

    void collectNumFromPlayers() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();
        numFromPlayer1 = p1.guessingNum();
        numFromPlayer2 = p2.guessingNum();
        numFromPlayer3 = p3.guessingNum();
    }

    void compare() {
        if (numFromGuesser == numFromPlayer1) {
            if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
                System.out.println("all are won!");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("player 1 and player 2 won game");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("player 1 and player 3 won");
            } else {
                System.out.println("Player 1 won the Game");
            }
        }
        else if (numFromGuesser == numFromPlayer2)
        {
            if (numFromGuesser == numFromPlayer1) {
                System.out.println("Player 1 and 2 won the Game");
            } else if (numFromGuesser == numFromPlayer3) {
                System.out.println("player 2 and player 3 won");
            } else
            {
                System.out.println("player 2 won the game");
            }
        }
            else if (numFromGuesser == numFromPlayer3) {
            if (numFromGuesser == numFromPlayer1) {
                System.out.println("player 1 and player 3 won game");
            } else if (numFromGuesser == numFromPlayer2) {
                System.out.println("player 2 and player 3 won game");
            } else {
                System.out.println("Player 3 won the Game");
            }
        }
            else
            {
                System.out.println("Everyone lost the game");
            }
        }
    }




public class Guesser_game_project {
    public static void main(String[] args)
    {
        System.out.println("Game started");
        Umpire U_obj=new Umpire();
        U_obj.collectNumFromGuesser();
        U_obj.collectNumFromPlayers();
        U_obj.compare();

        System.out.println("second round");


    }
}

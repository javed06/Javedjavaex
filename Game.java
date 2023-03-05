package javaproject;
import java.util.Scanner;

class Guesserr {
    int guessNum;

    int guessingNum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser! guess the number");
        if (sc.nextInt() > 10 || sc.nextInt() < 1) {
            System.out.println("plz display in the range of 1 to 10");
        } else {
            guessNum = sc.nextInt();}
            return guessNum;
        }

}
class Playerr{
    int guessNum;
    int guessingNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Player  ! guess the number");
        guessNum=sc.nextInt();
        return guessNum;
    }
}

class Umpirer {
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser() {
        Guesserr G_obj = new Guesserr();
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

    void comparee() {
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

class Decider{
    int trophy;
    void winner(){
        Umpirer u=new Umpirer();
       u.comparee();
    }
}




public class Game {
    public static void main(String[] args)
    {
        System.out.println("Game started");
        Umpirer U_obj=new Umpirer();
        U_obj.collectNumFromGuesser();
        U_obj.collectNumFromPlayers();
        U_obj.comparee();

        System.out.println("second round");
        U_obj.collectNumFromGuesser();
        U_obj.collectNumFromPlayers();
        U_obj.comparee();

        System.out.println("final round");
        U_obj.collectNumFromGuesser();
        U_obj.collectNumFromPlayers();
        U_obj.comparee();

        Decider D=new Decider();
        D.winner();

    }
}
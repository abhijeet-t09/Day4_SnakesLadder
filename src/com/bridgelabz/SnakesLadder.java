package com.bridgelabz;
import java.util.*;

public class SnakesLadder {

    static final int START_POSITION=0;
    static final int WIN_POSITION=100;
    static final int NO_PLAY=0;
    static final int MOVE_FORWARD=1;
    static final int MOVE_BACKWARDS=2;


    static int rollDice() {
        int n = 0;
        Random r = new Random();
        n=1+r.nextInt(6);
        return (n==0?1:n);
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Player No.: ");
        int playerNum=sc.nextInt();
        System.out.println("Player "+playerNum+" statring from "+START_POSITION);

        System.out.println("\nRoll Dice !!");

        int position=0;
        int finalPosition=0;
        int count=0;

        while(position < WIN_POSITION){
            int r1=rollDice();
            System.out.println("You Rolled "+r1);
            int newPosition=0;

            int roll = (int) Math.floor(Math.random() * 10) % 3;
            switch (roll) {
                case NO_PLAY:
                    System.out.println("NO Play !!\n");
                    break;

                case MOVE_FORWARD:
                    System.out.println("Move Forward " +r1+ " Places !!\n");
                    newPosition=START_POSITION+r1;
                    break;

                case MOVE_BACKWARDS:
                    System.out.println("Go Back " +r1+ " Places !!\n");
                    newPosition=START_POSITION-r1;
                    break;

                default:
                    System.out.println("\nInvalid Roll!!");
            }
            finalPosition+=newPosition;
            count+=1;
            position++;
        }
        System.out.println("You Reached Position "+position);
        System.out.println("CONGRATULATIONS !! YOU WON !!");
        System.out.println("Total Iterations = "+count);
    }
}
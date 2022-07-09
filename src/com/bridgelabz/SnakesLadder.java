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

    //static int rollOption(){
        //int roll = (int) Math.floor(Math.random() * 10) % 3;
       // return roll;
    //}
    public static void main(String[] args) {
        //System.out.println("SNAKES n LADDER");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Player No.: ");
        int playerNum=sc.nextInt();
        System.out.println("Player "+playerNum+" statring from "+START_POSITION);

        System.out.println("\nRoll Dice !!");

        int position=0;
        int finalPosition=0;

        while(position < WIN_POSITION){
            int r1=rollDice();
            System.out.println("You Rolled "+r1);
            int newPosition=0;

            int roll = (int) Math.floor(Math.random() * 10) % 3;
            switch (roll) {
                case NO_PLAY:
                    System.out.println("\nNO Play !!");
                    break;

                case MOVE_FORWARD:
                    System.out.println("\nMove Forward " +r1+ " Places !!");
                    newPosition=START_POSITION+r1;
                    break;

                case MOVE_BACKWARDS:
                    System.out.println("\nGo Back " +r1+ " Places !!");
                    newPosition=START_POSITION-r1;
                    break;

                default:
                    System.out.println("\nInvalid Roll!!");
            }
            finalPosition+=newPosition;
            position++;
        }
    }
}
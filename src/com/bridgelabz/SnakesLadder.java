package com.bridgelabz;
import java.util.*;

public class SnakesLadder {

    static final int START_POSITION=0;
    static final int WIN_POSITION=100;

    public static void main(String[] args) {
        //System.out.println("SNAKES n LADDER");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Player No.: ");
        int playerNum=sc.nextInt();
        System.out.println("Player "+playerNum+" statring from "+START_POSITION);
    }
}
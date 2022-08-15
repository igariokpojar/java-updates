package com.cydeo;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) { // ArrayList only accept Objects belongs to Integer class

        ArrayList<Integer> items = new ArrayList<Integer>();
        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
       // items.add("Apple"); // here we have String Object

        printDoubled(items);


        System.out.println("*****************************************");


        FootballPlayer joe = new FootballPlayer("Joe");  // Joe is register as football player
        BaseballPlayer pat = new BaseballPlayer("Pat"); //is register as football player
        SoccerPlayer beckham = new SoccerPlayer("Beckham");//is register as football player

        Team<SoccerPlayer> liverpool = new Team("Liverpool"); // Team accepting any objects
      //  liverpool.addPlayer(joe); // use the method to add the player in the Team
     //   liverpool.addPlayer(pat); // name are use like an Objects
        liverpool.addPlayer(beckham);










    }

    private static void printDoubled(ArrayList<Integer> items){
        for (Integer i : items){
            System.out.println(i*2);

        }
    }
}

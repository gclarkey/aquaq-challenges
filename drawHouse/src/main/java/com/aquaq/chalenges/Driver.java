package com.aquaq.chalenges;

public class Driver {

    public static void main(String args[]){
        for(int i =1; i<=50; i++){
            final House house = new House(i);
            house.drawHouse();
        }

        CompactHouse.drawHouse(10);
    }
}

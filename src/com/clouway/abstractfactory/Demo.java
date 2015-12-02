package com.clouway.abstractfactory;

import java.util.Scanner;

/**
 * @author Slavi Dichkov (slavidichkof@gmail.com)
 */
public class Demo {
    public static void main(String[] args) {
        House house=null;

        Scanner scanner=new Scanner(System.in);
        String chose=scanner.nextLine();

        if (chose.equals("forest house")){
            house=new ForestHouse();
        }else if(chose.equals("city house")){
            house=new CityHouse();
        }

        if (house!=null){
            Door door=house.getDoor();
            Floor floor=house.getFloor();
            Window window=house.getWindow();
            door.howHealthyIsDoor();
            floor.howHealthyIsFloor();
            window.howHealthyIsWindow();
        }else {
            System.out.println("there is not such house");
        }

    }
}

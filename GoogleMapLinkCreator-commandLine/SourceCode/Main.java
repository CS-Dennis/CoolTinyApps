package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Double latitude=null;
        Double longitude = null;
        Integer zoom = null;
        Scanner sc = new Scanner(System.in);

        Boolean check;
        do {
            try {
                System.out.println("Please enter your latitude (or enter E to close):");
                String temp = sc.nextLine();
                if(temp.equals("E")){
                    check = false;
                    System.exit(0);
                } else{
                    latitude = Double.valueOf(temp);
                    check = false;
                }

            } catch (Exception e){
                check = true;
            }
        } while(check);




        check = true;
        do {
            try {
                System.out.println("Please enter your longitude (or enter E to close):");
                String temp = sc.nextLine();
                if(temp.equals("E")){
                    check = false;
                    System.exit(0);
                } else{
                    longitude = Double.valueOf(temp);
                    check = false;
                }

            } catch (Exception e){
                check = true;
            }
        } while(check);


        check = true;
        do {
            try {
                System.out.println("Please enter your zoom level (1-20) (or enter E to close):");
                String temp = sc.nextLine();
                if(temp.equals("E")){
                    check = false;
                    System.exit(0);
                } else{
                    zoom = Integer.valueOf(temp);
                    check = false;
                }

            } catch (Exception e){
                check = true;
            }
        } while(check);

        Geolocation place1 = new Geolocation(latitude,longitude);
        System.out.println(place1.showMap(zoom));
    }
}

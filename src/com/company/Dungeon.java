package com.company;

import java.util.Scanner;

public class Dungeon {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("|---------------------------------|");
        System.out.println("|Welcome to the Dungeon Adventure!|");
        System.out.println("|---------------------------------|");
        while(true){

            System.out.println("Type \"next\" to continue");
            System.out.println(" ");
            String scan = scanner.nextLine();
            if (scan.equals("next")) {
                Room room = new Room();
                room.Show(1, 2);
            }
            else {
                System.out.println("ce n'est pas valide");
            }
        }
    }
}

package com.company;

import com.company.Characters.Monsters.Barbarian;
import com.company.Characters.Monsters.Witcher;
import com.company.Characters.Player;

import java.util.Scanner;

public class Room extends Dungeon {

    public void Room() {
    }

    public void Show(int Min, int Max) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player();

        int Monster = Min + (int) (Math.random() * ((Max - Min) + 1));
        if (Monster == Min) {
            Witcher witcher = new Witcher();
            while (true) {
                String scan = scanner.nextLine();
                if (scan.equals("attaque")) {
                    witcher.takeDomages(10);
                    player.takeDomages(10);
                } else {
                    System.out.println("this command doesn't exist");
                }
            }

        }
        else {
            Barbarian barbarian = new Barbarian();
            while (true) {
                String scan = scanner.nextLine();
                if (scan.equals("attaque")) {
                    barbarian.takeDomages(10);
                    player.takeDomages(10);
                } else {
                    System.out.println("this command dosn't exist");
                }
            }
        }
    }
}


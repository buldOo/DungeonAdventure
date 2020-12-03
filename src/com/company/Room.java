package com.company;

import com.company.Characters.Monsters.Barbarian;
import com.company.Characters.Monsters.Witcher;

public class Room extends Dungeon {
    public void step() {
        System.out.println("je suis la Room");
    }

    public Room() {
    }

    public void Show(int Min, int Max) {

        int Monster = Min + (int) (Math.random() * ((Max - Min) + 1));
        if (Monster == Min) {
            Witcher witcher = new Witcher();
        } else {
            Barbarian barbarian = new Barbarian();
        }
    }
}


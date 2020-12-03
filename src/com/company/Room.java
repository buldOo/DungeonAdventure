package com.company;

import com.company.Characters.Monsters.Barbarian;
import com.company.Characters.Monsters.Witcher;
import com.company.Characters.Player;

public class Room extends Dungeon {

    public Room() {
    }

    public void Show(int Min, int Max) {
        Player player = new Player();
        int Monster = Min + (int) (Math.random() * ((Max - Min) + 1));
        if (Monster == Min) {
            Witcher witcher = new Witcher();
        } else {
            Barbarian barbarian = new Barbarian();
        }

        for(int i = 0; i < 5; ++i) {
            player.takeDomages(10);
            //witcher.takeDomages(10);
        }

    }
}


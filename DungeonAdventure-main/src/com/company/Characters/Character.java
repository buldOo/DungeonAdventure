package com.company.Characters;

import com.company.Dungeon;
import com.company.Room;

import java.util.Scanner;

public class Character extends Room {
    protected int m_iLifePoint;
    protected int m_iDomage;

    public Character() {
    }

    public void takeDomages(int p_domage) {
        int lifePoint = getLifePoint();
        setLifePoint(lifePoint - p_domage);
        System.out.println("health points" + getLifePoint());
        if (getLifePoint() <= 0){
            System.out.println("you have defeated the monster!!");
            System.exit(1);
        }
    }

    public int getLifePoint() {
        return m_iLifePoint;
    }

    public void setLifePoint(int p_iLifePoint) {
        m_iLifePoint = p_iLifePoint;
    }
}


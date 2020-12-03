
package com.company.Characters;

public class Player extends Character {
    public Player() {
        System.out.println("you enter a room");
        m_iLifePoint = 200;
        m_iDomage = 10;
        System.out.println("your health points:" + m_iLifePoint);
    }
}
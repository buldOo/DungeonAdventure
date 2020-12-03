
package com.company.Characters;

public class Player extends Character {
    public Player() {
        System.out.println("J'invoque un Player");
        m_iLifePoint = 200;
        m_iDomage = 10;
        System.out.println("point de vie " + m_iLifePoint);
    }
}
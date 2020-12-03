package com.company.Characters.Monsters;

public class Barbarian extends Monster {
    public Barbarian() {
        System.out.println("a Barbarian appears");
        m_iLifePoint = 20;
        m_iDomage = 15;
        System.out.println("Barbarian health point:" + m_iLifePoint);
    }

    public void step() {
    }
}

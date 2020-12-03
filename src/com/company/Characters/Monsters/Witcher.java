
package com.company.Characters.Monsters;

public class Witcher extends Monster {
    public Witcher() {
        System.out.println("J'invoque un Witcher");
        m_iLifePoint = 20;
        m_iDomage = 15;
        System.out.println("point de vie " + m_iLifePoint);
    }

    public int getLifePoint() {
        return m_iLifePoint;
    }

    public void setLifePoint(int p_iLifePoint) {
        m_iLifePoint = p_iLifePoint;
    }
}





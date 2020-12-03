package com.company.Characters;

public class Character {
    protected int m_iLifePoint;
    protected int m_iDomage;

    public Character() {
    }

    public void takeDomages(int p_domage) {
        int lifePoint = getLifePoint();
        setLifePoint(lifePoint - p_domage);
        System.out.println(lifePoint);
    }

    public int getLifePoint() {
        return m_iLifePoint;
    }

    public void setLifePoint(int p_iLifePoint) {
        m_iLifePoint = p_iLifePoint;
    }
}


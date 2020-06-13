package com.csc422.zombiewar;

/**
 *y
 * @authors Roger, Adrian, Patrick, & Caitlin Course: CSC422 Software
 * Engineering Week: 5 Assignment: ZombieWar Coding from UML Diagram
 */
public abstract class Character
{

    private int health;
    private int attack;

    /**
     * Constructor
     *
     * @param health
     * @param attack
     */
    public Character(int health, int attack)
    {
        this.health = health;
        this.attack = attack;
    }

    /**
     * Sets the health of the character
     *
     * @param health
     */
    public void setHealth(int health)
    {
        this.health = health;
    }

    /**
     * Sets the attack value of the character
     *
     * @param attack
     */
    public void setAttack(int attack)
    {
        this.attack = attack;
    }

    /**
     * @return the health value of the character
     */
    public int getHealth()
    {
        return health;
    }

    /**
     * @return the attack value of the character
     */
    public int getAttack()
    {
        return attack;
    }

    /**
     * Simulates this.character attacking another character It reduces the
     * attacked characters health by the attack value of the attacker and sets
     * the new health to the difference, or if sets the health to 0 if the
     * health would be less than 0.
     *
     * @param c - the other character
     */
    public void attack(Character c)
    {
        c.setHealth((c.getHealth()) - (this.attack));
    }

    /* @return true if this character is dead, otherwise return false */
    public boolean isDead(Character c)
    {
        if (c.getHealth() <= 0)
        {
            return true;
        }
        return false;
    }
}

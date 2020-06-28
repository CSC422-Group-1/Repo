package com.csc422.zombiewar.characters;

public class Tank extends Zombie
{
    private int objID = 0;

    public Tank(int ID)
    {
        super(/*health*/150,/*attack*/ 20);
        this.objID = ID;
    }
    /*
    @Override
    public String toString()
    {
        return "Tank " + objID;
    }
    */
}


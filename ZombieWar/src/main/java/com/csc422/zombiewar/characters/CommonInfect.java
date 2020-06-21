package com.csc422.zombiewar.characters;

public class CommonInfect extends Zombie
{
    private int objID = 0;

    public CommonInfect(int ID)
    {
        super(/*health*/30,/*attack*/ 5);
        this.objID = ID;
    }

    @Override
    public String toString()
    {
        return "Common Infected " + objID;
    }

}

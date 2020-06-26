package com.csc422.zombiewar.characters;

import com.csc422.zombiewar.weapons.Weapon;

public class Teacher extends Survivor
{
    private int objID = 0;
    private Weapon weapon;
    
    public Teacher(int ID, Weapon weapon)
    {
        super(/*health*/50,/*attack*/5);
        this.objID = ID;
        this.weapon = weapon;
    }

    public Teacher(int ID)
    {
        super(/*health*/50,/*attack*/5);
        this.objID = ID;
    }

    @Override
    public String toString()
    {
        return "Teacher " + objID;
    }

}

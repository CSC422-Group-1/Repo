package com.csc422.zombiewar.characters;

import com.csc422.zombiewar.weapons.Weapon;

public class Soldier extends Survivor
{
    private int objID = 0;
    
    public Soldier(int ID, Weapon weapon)
    {
        super(/*health*/100,/*attack*/10, weapon);
        this.objID = ID;
    }
    
    public Soldier(int ID)
    {
        super(/*health*/100,/*attack*/10);
        this.objID = ID;
    }

}


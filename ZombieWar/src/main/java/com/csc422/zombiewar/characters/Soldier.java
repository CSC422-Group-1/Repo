package com.csc422.zombiewar.characters;

import com.csc422.zombiewar.weapons.Weapon;

public class Soldier extends Survivor
{    
    public Soldier(int ID, Weapon weapon)
    {
        super(/*health*/100,/*attack*/10, weapon, ID);
    }
    
    public Soldier(int ID)
    {
        super(/*health*/100,/*attack*/10, ID);
    }

}


package com.csc422.zombiewar.characters;

import com.csc422.zombiewar.weapons.Weapon;

public class Child extends Survivor
{
    private int objID = 0;
    private Weapon weapon;
    
    public Child(int ID, Weapon weapon)
    {
        super(/*health*/20,/*attack*/2);
        this.objID = ID;
        this.weapon = weapon;
    }
    
    public Child(int ID)
    {
        super(/*health*/ 20,/*attack*/2);
        this.objID = ID;
    }
    
    @Override
    public String toString()
    {
        return "Child " + objID;
    }

}

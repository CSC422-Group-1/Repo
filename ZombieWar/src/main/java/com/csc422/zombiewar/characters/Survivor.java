package com.csc422.zombiewar.characters;

import com.csc422.zombiewar.weapons.Weapon;

public class Survivor extends Character {
    
    public Survivor(int health, int attack, Weapon weapon, int ID)
    {
        super(health, attack, weapon, ID);
    }

    public Survivor(int health, int attack, int ID) {
        super(health, attack, ID);
    }

}

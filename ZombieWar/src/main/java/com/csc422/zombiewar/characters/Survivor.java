package com.csc422.zombiewar.characters;

import com.csc422.zombiewar.weapons.Weapon;

public class Survivor extends Character {
    
    public Survivor(int health, int attack, Weapon weapon)
    {
        super(health, attack, weapon);
    }

    public Survivor(int health, int attack) {
        super(health, attack);
    }

}

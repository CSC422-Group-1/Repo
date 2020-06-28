package com.csc422.zombiewar.characters;

import com.csc422.zombiewar.weapons.Weapon;

public class Child extends Survivor {

    public Child(int ID, Weapon weapon) {
        super(/*health*/20,/*attack*/ 2, weapon, ID);
    }

    public Child(int ID) {
        super(/*health*/20,/*attack*/ 2, ID);
    }

}

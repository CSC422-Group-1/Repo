package com.csc422.zombiewar.characters;

import com.csc422.zombiewar.weapons.Weapon;

public class Teacher extends Survivor {

    public Teacher(int ID, Weapon weapon) {
        super(/*health*/50,/*attack*/ 5, weapon, ID);
    }

    public Teacher(int ID) {
        super(/*health*/50,/*attack*/ 5, ID);
    }

}

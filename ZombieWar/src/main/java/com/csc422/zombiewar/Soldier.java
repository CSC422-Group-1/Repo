package com.csc422.zombiewar;

public class Soldier extends Survivor {

    public Soldier(int id ) {
        super(/*health*/ 100,/*attack*/ 10);
        setId(id);
    }

}

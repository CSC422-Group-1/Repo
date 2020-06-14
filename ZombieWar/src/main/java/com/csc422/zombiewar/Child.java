package com.csc422.zombiewar;

public class Child extends Survivor {

    public Child(int id) {
        super(/*health*/ 20,/*attack*/ 2);
        this.id =id;
        setId(id);
    }

}

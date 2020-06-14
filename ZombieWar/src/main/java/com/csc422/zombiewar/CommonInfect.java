package com.csc422.zombiewar;

public class CommonInfect extends Zombie {

    public CommonInfect(int id) {
        super(/*health*/ 30,/*attack*/ 5);
        this.id =id;
        setId(id);

    }

}

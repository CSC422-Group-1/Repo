package com.csc422.zombiewar;

public class Child extends Survivor
{
    private int objID = 0;
    
    public Child(int ID)
    {
        super(/*health*/ 20,/*attack*/ 2);
        this.objID = ID;
    }
    
    @Override
    public String toString()
    {
        return "Child " + objID;
    }

}

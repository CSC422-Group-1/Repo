package com.csc422.zombiewar;

public class Teacher extends Survivor
{
    private int objID = 0;

    public Teacher(int ID)
    {
        super(/*health*/50,/*attack*/ 5);
        this.objID = ID;
    }

    @Override
    public String toString()
    {
        return "Teacher " + objID;
    }

}

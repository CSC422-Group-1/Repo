package com.csc422.zombiewar;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author caitl
 */
public class SurvivorArrayFactory {

    Random rand;
    private int totalChild = 0;
    private int totalTeacher = 0;
    private int totalSoldier = 0;

    /**
     * Generates a random sized array list of random survivors
     * (Child/Teacher/Soldier).
     *
     * @return an ArrayList of Survivors.
     */
    public ArrayList<Survivor> makeSurvivorArray() {
        ArrayList<Survivor> survivor = new ArrayList<>();
        return survivor;
    }

    /**
     * @return the total number of child survivors
     */
    public int getTotalChildren() {
        return 0;
    }

    /**
     * @return the total number of teacher survivors
     */
    public int getTotalTeachers() {
        return 0;
    }

    /**
     * @return the total number of soldier survivors
     */
    public int getTotalSoldiers() {
        return 0;
    }

}

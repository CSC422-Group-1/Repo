package com.csc422.zombiewar;

import java.util.ArrayList;
import java.util.Random;


public class SurvivorArrayFactory {

    Random rand;
    private int totalChildren = 0;
    private int totalTeacher = 0;
    private int totalSoldier = 0;

    /**
     * Generates a random sized array list of random survivors
     * (Children/Teacher/Soldier).
     *
     * @return an ArrayList of Survivors.
     */
    public ArrayList<Survivor> makeSurvivorArray() {
        ArrayList<Survivor> survivor = new ArrayList<>();
    }
    
    //Creates random number 1-20 Survivors 
    int randomNumber = rand.NextInt(20) + 1;
    //
    for (int i = 0; i < randomNumber; i++) {

        // Creates a random number (0 or 1)
        int randNumber = rand.nextInt(2);

        // Create random # of Survivors and increment total
        if (randomNumber == 0) {
            survivor.add(new Children());
            totalChildren++;
        } else if{
            survivor.add(new Teacher());
            totalTeacher++;
        } else {
        	survivor.add(new Soldier());
        	totalSoldier++
    }
    
    return Survivors;
}
    
    /**
     * @return the total number of child survivors
     */
    public int getTotalChildren() {
        return totalChildren;
    }

    /**
     * @return the total number of teacher survivors
     */
    public int getTotalTeachers() {
        return totalTeacher;
    }

    /**
     * @return the total number of soldier survivors
     */
    public int getTotalSoldiers() {
        return totalSoldier;
    }

}

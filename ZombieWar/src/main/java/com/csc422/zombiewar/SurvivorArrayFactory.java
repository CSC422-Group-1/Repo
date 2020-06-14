package com.csc422.zombiewar;

import java.util.ArrayList;
import java.util.Random;


public class SurvivorArrayFactory {

    Random rand = new Random();
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
    
    
    //Creates random number 1-20 Survivors 
    int randNumb = rand.nextInt(20) + 1;
    //
    for (int i = 0; i < randNumb; i++) {

        // Creates a random number (0, 1 & 2)
        int randNumber = rand.nextInt(3);

        // Create random # of Survivors and increment total
        if (randNumber == 0) {
            survivor.add(new Child());
            totalChild++;
        } else if(randNumber == 1){
            survivor.add(new Teacher());
            totalTeacher++;
        } else{
        	survivor.add(new Soldier());
        	totalSoldier++;
        }
        
    }
    
    return survivor;
}
    
    /**
     * @return the total number of child survivors
     */
    public int getTotalChildren() {
        return totalChild;
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

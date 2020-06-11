package com.csc422.zombiewar;

import java.util.ArrayList;
import java.util.Random;

public class ZombieArrayFactory {

    Random rand = new Random();
    private int totalCommonInfect = 0;
    private int totalTank = 0;

    /**
     * Generates a random sized array list of random zombies
     * (Tank/CommonInfect).
     *
     * @return an ArrayList of Zombies.
     */
    public ArrayList<Zombie> makeZombieArray() {
        ArrayList<Zombie> zombies = new ArrayList<>();

        // Create 1-20 Zombies 
        int randomNumber = rand.nextInt(20) + 1;

        // Creates a random sized array of random zombies or survivors 
        for (int i = 0; i < randomNumber; i++) {

            // create a random number (0 or 1)
            int randNum = rand.nextInt(2);

            // Create random zombie and increment total
            if (randNum == 0) {
                zombies.add(new CommonInfect());
                totalCommonInfect++;
            } else {
                zombies.add(new Tank());
                totalTank++;
            }
        }

        return zombies;
    }

    /**
     * @return the total number of common infect zombies
     */
    public int getTotalCommonInfects() {
        return totalCommonInfect;
    }

    /**
     * @return the total number of tank zombies
     */
    public int getTotalTanks() {
        return totalTank;
    }

}

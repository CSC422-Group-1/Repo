package com.csc422.zombiewar;

import java.util.ArrayList;
import java.util.Random;

public class ZombieArrayFactory {

    Random rand;
    private int totalCommonInfect = 0;
    private int totalTank = 0;

    /**
     * Generates a random sized array list of random zombies
     * (Tank/CommonInfect).
     *
     * @return an ArrayList of Zombies.
     */
    public ArrayList<Zombie> makeZombieArray() {
        ArrayList<Zombie> zombie = new ArrayList<>();
        return zombie;
    }

    /**
     *
     * @return the total number of common infect zombies
     */
    public int getTotalCommonInfects() {
        return 0;
    }

    /**
     * @return the total number of tank zombies
     */
    public int getTotalTanks() {
        return 0;
    }

}

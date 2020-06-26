package com.csc422.zombiewar.factories;

import com.csc422.zombiewar.weapons.*;
import java.util.ArrayList;
import java.util.Random;

public class WeaponFactory {

    private final ArrayList<Weapon> cache = new ArrayList<>();
    private final Random rand = new Random();

    /**
     * Constructor populates the cache with random weapons
     */
    public WeaponFactory() {
        makeRandomCache();
    }

    /**
     * Generates 25 random weapons (there is a max of 20 survivors being
     * created) We are allowing for null entries in the cache because we want to
     * support a Survivor not being able to find a weapon in the cache.
     *
     * Thus the user may or may not find a weapon.
     */
    private void makeRandomCache() {
        for (int i = 0; i < 25; i++) {
            /*
            * 0 - 6 correspond to the weapons 
            * If 7 is randomly picked, a NULL value is stored
             */
            int weaponType = rand.nextInt(8);

            // Create weapons based on random numer selection
            switch (weaponType) {
                case 0:
                    cache.add(new Shotgun());
                    break;
                case 1:
                    cache.add(new SubMachineGun());
                    break;
                case 2:
                    cache.add(new AssaultRifle());
                    break;
                case 3:
                    cache.add(new Pistol());
                    break;
                case 4:
                    cache.add(new Axe());
                    break;
                case 5:
                    cache.add(new Crowbar());
                    break;
                case 6:
                    cache.add(new FryingPan());
                    break;
                default:
                    //empty cache slot
                    cache.add(null);
                    break;
            }
        }
    }//end make cache

    /**
     * Randomly selects a weapon from the cache. The selected weapon is removed
     * from the cache.
     *
     * @return a random weapon
     */
    public Weapon getWeapon() {
        int weapon = rand.nextInt(cache.size());
        Weapon returnWeapon = cache.get(weapon);
        cache.remove(weapon);
        return returnWeapon;
    }

}

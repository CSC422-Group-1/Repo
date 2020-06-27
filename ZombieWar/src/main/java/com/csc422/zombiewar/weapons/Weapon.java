package com.csc422.zombiewar.weapons;

//Create Weapon class
public class Weapon {
    private int damage;
    private int accuracy;
    
    
    public Weapon(int damage, int accuracy) {
    	this.damage = damage;
    	this.accuracy = accuracy;
    	
    }
    
    public int getDamage()
    {
        return damage;
    }
    
    public int getAccuracy()
    {
        return accuracy;
    }
    
    @Override
    public String toString() {
    	return this.getClass().getSimpleName();
    }
}
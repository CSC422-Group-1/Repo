package com.csc422.zombiewar.characters;

import com.csc422.zombiewar.weapons.Weapon;

/**
 *y
 * @authors Roger, Adrian, Patrick, & Caitlin Course: CSC422 Software
 * Engineering Week: 5 Assignment: ZombieWar Coding from UML Diagram
 */
public abstract class Character
{

    private int health;
    private int attack;
    private Weapon weapon;
    private int objID;

    /**
     * Constructor
     *
     * @param health
     * @param attack
     */
    
    public Character(int health, int attack){
        this.health=health;
        this.attack=attack;
    } 
    /**
     * Constructor
     * 
     * @param health
     * @param attack
     * @param weapon
     */
    public Character(int health, int attack, Weapon weapon)
    {
        this.health = health;
        this.attack=attack;
        this.weapon = weapon;
        if((weapon.getClass().getSimpleName().equals("FryingPan")|weapon.getClass().getSimpleName().equals("CrowBar")|weapon.getClass().getSimpleName().equals("Axe"))){
              this.attack+=weapon.getDamage();
          }else{
              this.attack=weapon.getDamage();
          }
    }

    /**
     * Sets the health of the character
     *
     * @param health
     */
    public void setHealth(int health)
    {
        this.health = health;
    }

    /**
     * Sets the attack value of the character
     *
     * @param attack
     */
    public void setAttack(int attack)
    {
        this.attack = attack;
    }

    /**
     * @return the health value of the character
     */
    public int getHealth()
    {
        return health;
    }

    /**
     * @return the attack value of the character
     */
    public int getAttack()
    {
        return attack;
    }

    public Weapon getWeapon(){
      return weapon;
    }
    public int getID(){
        return this.objID;
    }
    /**
     * Simulates this.character attacking another character It reduces the
     * attacked characters health by the attack value of the attacker and sets
     * the new health to the difference.
     *
     * @param c - the other character
     */
    public void attacks(Character c)
    {
      if(weapon!=null){
        if(landedHit()==true){
            c.setHealth((c.getHealth()) - (this.attack));
        }else{
        }
       }else{
      c.setHealth((c.getHealth()) - (this.attack));
      }
    }

    /* @return true if this character is dead, otherwise return false */
    public boolean isDead()
    {
        return this.getHealth() <= 0;
    }

    public boolean landedHit(){
      int modifier =0; //accuracy modifier
      switch(this.getClass().getSimpleName()){
        case "Soldier": modifier = 10;
        break;
        case "Teacher": modifier = 45;
        break;
        case "Child": modifier = 85;
        break;
      }
      int rand = (int)(Math.round(java.lang.Math.random()*weapon.getAccuracy()/(double)modifier*10));
      return rand!=0;
    }

    /**
     *
     * @return
     */
    @Override
  public String toString(){
    String j = this.getClass().getSimpleName()+" "+this.objID;
    j+=this.getWeapon()!=null?" with ":" ";
    j+=this.getWeapon()!=null?this.getWeapon().getClass().getSimpleName().startsWith("A")?"an ":"a ":"";
    j+=this.getWeapon()!=null?this.getWeapon().getClass().getSimpleName():"";
    return j;
  }
}

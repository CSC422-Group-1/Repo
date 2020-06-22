package com.csc422.zombiewar.weapons;

public abstract class Weapon implements Comparable<Weapon>{
    private Integer damage;
    private Integer accuracy;
    private int id;

    public Weapon(Integer damage, Integer accuracy){
      setDamage(damage);
      setAccuracy(accuracy);
    }

    public void setDamage(Integer damage){
      this.damage = damage;
    }

    public void setAccuracy(Integer accuracy){
      this.accuracy = accuracy;
    }

    public Integer getDamage(){
      return damage;
    }

    public Integer getAccuracy(){
      return accuracy;
    }

    @Override
    public String toString() {
      return Weapon.Class.getSimpleName()+" "+Weapon.getDamage();
    }
    
    @Override
    public int compareTo(Weapon w) {
      return this.getDamage().compareTo(w.getDamage());
    }
}

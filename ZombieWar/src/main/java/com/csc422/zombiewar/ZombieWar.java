package com.csc422.zombiewar;
import java.util.*;
//Vers. 2.0
public class ZombieWar{
  static int aL;
  static int dL;

  public static void main(String[] args){
    start();
  }
  
  public static void start(){
    ZombieArrayFactory zFactory = new ZombieArrayFactory();
    ArrayList<Zombie> zombies= zFactory.makeZombieArray(); 
    //zombies.forEach(zombie->System.out.println(zombie.getClass()+" "+zombie.getHealth()));
  
    SurvivorArrayFactory sFactory = new SurvivorArrayFactory();
    ArrayList<Survivor> survivors= sFactory.makeSurvivorArray(); 
    //survivors.forEach(survivor->System.out.println(survivor.getClass()+" "+survivor.getHealth()));
    int gCh = sFactory.getTotalChildren();
    int gTe = sFactory.getTotalTeachers();
    int gSo = sFactory.getTotalSoldiers();
    int gCi = zFactory.getTotalCommonInfects();
    int gTa = zFactory.getTotalTanks();
    String sSorP = survivors.size()==1?" survivor":" survivors";
    System.out.print("We have "+survivors.size()+sSorP+" trying to make it to safety (");
    String child = gCh==1 ? " child," : " children,";
    System.out.print(gCh+child+" ");
    String teacher = gTe==1?" teacher,":" teachers,";
    System.out.print(gTe+teacher+" ");
    String soldier = gSo==1?" soldier,":" soldiers,";
    System.out.print(gSo+soldier+")");
    String zSorP = zombies.size()==1?" zombie":" zombies";
    String areORis = zombies.size()==1?"is ":"are "; 
    System.out.print("\n\nBut there "+areORis+zombies.size()+zSorP+" waiting for them (");
    System.out.print(gCi+" common infected, ");
    String tank = gTa==1 ? " tank" : " tanks";
    System.out.print(gTa+tank+")\n\n");
    setSize(survivors,zombies);
    battle(survivors,zombies);
    setSize(zombies,survivors);
    battle(zombies,survivors);
    String left = survivors.size()==0?"None":Integer.toString(survivors.size());
    System.out.println("\n"+left+" of the survivors made it.");
    
    }

  @SuppressWarnings("unchecked")
  static void battle(ArrayList<? extends Character> attacker, ArrayList<? extends Character> defender){
  for(int a =0; a<aL;a++){
    for(int d=0;d<dL;d++){
      Character A = attacker.get(a);
      String Attacker=A.getClass().getName()+" "+A.getId();
      Character D = defender.get(d);
      String Defender = D.getClass().getName()+" "+D.getId();
      A.attacks(D);
      //System.out.println("d= "+d+" "+Attacker+" attacks "+Defender+" defender size ="+defender.size());
      boolean check = checkPulse(attacker,defender,a,d);
      if(check==true){d--;}
    }
  }
  }
  
  static boolean checkPulse(ArrayList<? extends Character> attacker, ArrayList<? extends Character> defender,int a,int d){ 
    boolean isDead = defender.get(d).isDead();
      if(isDead==true){
          System.out.println(attacker.get(a).getClass().getName()+" "+attacker.get(a).getId()+" killed "+defender.get(d).getClass().getName()+" "+defender.get(d).getId());

          defender.remove(d);
          setSize(attacker,defender);
          //System.out.println("defender size NOW = "+defender.size());     
    }
    return isDead;
  }
  static void  setSize(ArrayList<? extends Character> attacker, ArrayList<? extends Character> defender){
    aL = attacker.size();
    dL = defender.size();
  }
//end of class
}

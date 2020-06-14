import java.util.*;
{
   
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
  
    System.out.print("We have "+survivors.size()+" survivors trying to make it to safety.\n"+
    "\nBut there are "+zombies.size()+" zombies waiting for them.\n"
    );
    
    setSize(survivors,zombies);
    battle(survivors,zombies);
    setSize(zombies,survivors);
    battle(zombies,survivors);
    System.out.println("It seems "+survivors.size()+" have made it to safety.");
    
    }

  @SuppressWarnings("unchecked")
  static void battle(ArrayList<? extends Character> attacker, ArrayList<? extends Character> defender){
  for(int a =0; a<aL;a++){
    for(int d=0;d<dL;d++){
      if(defender.get(d).getHealth()<attacker.get(a).getAttack()){
        defender.remove(d);
        setSize(attacker,defender);
      }else{
        defender.get(d).setHealth(defender.get(d).getHealth()-attacker.get(a).getAttack());
        if(defender.get(d).getHealth()==0){
          defender.remove(d);
          setSize(attacker,defender);
        }
      }
    }
  }
  }

  static void  setSize(ArrayList<? extends Character> attacker, ArrayList<? extends Character> defender){
    aL = attacker.size();
    dL = defender.size();
  }
//end of class
}

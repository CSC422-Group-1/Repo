import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
 
public class JavaSort 
{
    public static void main(String[] args) 
    {
        ArrayList<Weapon> weapons = getUnsortedEmployeeList();
    
        //1. Employee ids in ascending order
        Collections.sort(weapons);
         
        System.out.println(weapons);
         
        System.out.println(weapons);
    }
 
    //Returns an unordered list of employees
    private static ArrayList<Weapon> getUnsortedEmployeeList() 
    {
        ArrayList<Weapon> list = new ArrayList<>();
        Random rand = new Random(10);
         
        for(int i = 0; i < 5; i++) 
        {
            Weapon w = new Weapon();
            e.setDamage(rand.nextInt(100));
            list.add(e);
        }
        return list;
    }
}
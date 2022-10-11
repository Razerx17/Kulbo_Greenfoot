import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Npc here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Npc extends Actor
{
    /**
     * Act - do whatever the Npc wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Npc(){
        getImage().scale(100,100);
        setImage(getImage());
    }
    public void act()
    {
       plCheck();
    }
    public boolean showOnce = false;
    public boolean delOnce = false;
    public static boolean canHit = true;
    DialogText dialog = new DialogText();
    public void plCheck(){
        
        List<Player> l = getObjectsInRange(100, Player.class);
        List<Player> a = getObjectsInRange(300, Player.class);

        if(!l.isEmpty() && !showOnce){ 
           getWorld().addObject(dialog,getX(),getY()-75);
           showOnce = true;
           canHit = false;
        }
        if(l.isEmpty() && !a.isEmpty()){
            
            getWorld().removeObject(dialog);
            showOnce = false;
            canHit = true;
        }
        
        
        
        
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Key extends Actor
{
    /**
     * Act - do whatever the Key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Key(){
        getImage().scale(20,30);
        setImage(getImage());
    }
    public void act()
    {
        plCheck();
    }
    public void plCheck(){
        List<Player> l = getObjectsInRange(30, Player.class);
        if(!l.isEmpty()){
            for(Player a: l){
                Player.keys++;
                Greenfoot.playSound("pickup.wav");
                KeyCollected key = new KeyCollected();
                getWorld().addObject(key,getX(), getY() - 20);
                getWorld().removeObject(this);
               
            }
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends Actor
{
    /**
     * Act - do whatever the Portal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Portal(){
        getImage().scale(100,100);
        setImage(getImage());
    }
    public void act()
    {
      List<Player> l = getObjectsInRange(20, Player.class);
      if(!l.isEmpty()){
          Greenfoot.playSound("VictorySound.mp3");
          Greenfoot.setWorld(new Won());
      }
    }
}

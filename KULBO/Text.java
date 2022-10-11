import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;

/**
 * Write a description of class Text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Text extends Actor
{
    /**
     * Act - do whatever the Text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound SelectNormal = new GreenfootSound("selectNormal.wav");
    GreenfootSound SelectBlock = new GreenfootSound("selectBlock.wav");
    
    public Text(){
      SelectNormal.setVolume(80);
      SelectBlock.setVolume(80);
    }
    
    public void act()
    {
        // Add your action code here.
    }
    public void SelectSound(){
      SelectNormal.play();
      
    }
    public void BlockSound(){
      SelectBlock.play();
    }
}

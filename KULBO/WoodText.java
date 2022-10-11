import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WoodText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WoodText extends Actor
{
    /**
     * Act - do whatever the WoodText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public WoodText(){
        setImage(new GreenfootImage("Wood: " + (int)Player.wood, 24, Color.WHITE, Color.BLACK));
    }
    public void act()
    {
       getImage().clear(); 
       setImage(new GreenfootImage("Wood: " + (int)Player.wood, 24, Color.WHITE, Color.BLACK));
    }
}

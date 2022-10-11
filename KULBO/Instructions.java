import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Instructions here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Instructions extends Buttons
{
    /**
     * Act - do whatever the Instructions wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Instructions(){
        setImage("instructions.png");
        getImage().scale(200,30);
        setImage(getImage());
    }
    public void act()
    {
        checkMouse();
        if(Greenfoot.mousePressed(this)){
          Greenfoot.setWorld(new IntructionWorld());    
        
        }
    }
}

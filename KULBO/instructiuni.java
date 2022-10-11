import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class instructiuni here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class instructiuni extends Buttons
{
    /**
     * Act - do whatever the instructiuni wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public instructiuni(){
        getImage().scale(400,50);
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

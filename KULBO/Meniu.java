import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Meniu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Meniu extends Buttons
{
    /**
     * Act - do whatever the Meniu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Meniu(){
        getImage().scale(getImage().getWidth() + 30, getImage().getHeight());
    }
    public void act()
    {
        checkMouse();
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("menu.wav");
            Greenfoot.setWorld(new MyWorld());
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Back here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Back extends Buttons
{
    /**
     * Act - do whatever the Back wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Back(){
        setImage("back.png");
    }
    public void act()
    {
        checkMouse();
        if(Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(MyWorld.TitleScreen);
        }
    }
}

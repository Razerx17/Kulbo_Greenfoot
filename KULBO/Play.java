import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Buttons
{
    /**
     * Act - do whatever the Play wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Play(){
        setImage("play.png");
        getImage().scale(140,60);
        setImage(getImage());
        
    }
    
    public void act()
    {
     checkMouse();
     if(Greenfoot.mousePressed(this)){
         MyWorld.map1.addObject(MyWorld.player2, getWorld().getWidth()/2, 360);
         Greenfoot.setWorld(MyWorld.map1);
         Greenfoot.playSound("play.wav");
     }
    }
}

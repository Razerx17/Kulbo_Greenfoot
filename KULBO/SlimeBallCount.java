import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SlimBallCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SlimeBallCount extends HUD
{
    /**
     * Act - do whatever the SlimBallCount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public SlimeBallCount(){
        getImage().scale(45,45);
        setImage(getImage());
        count = new ItemCount();   
    }
    public void addedToWorld(World lol){
        getWorld().addObject(count, getX()+30, getY()+10);
        
    }
    ItemCount count;
    public void act()
    {
       count.update(Player.slimeBalls);   
    }
}

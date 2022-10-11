import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BombCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BombCount extends HUD
{
    /**
     * Act - do whatever the BombCount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public BombCount(){
        getImage().scale(40,40);
        setImage(getImage());
        count = new ItemCount();   
    }
    public void addedToWorld(World lol){
        getWorld().addObject(count, getX()+30, getY()+10);
    }
    ItemCount count;
    public void act()
    {
       count.update(Player.bombs);   
    }
    
    
}

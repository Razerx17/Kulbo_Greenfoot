import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyCount extends HUD
{
    /**
     * Act - do whatever the KeyCount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public KeyCount(){
        getImage().scale(25,38);
        setImage(getImage());
            count = new ItemCount();   
    }
    ItemCount count;
    public boolean putinTheWordl = false;
    public void act()
    {
       if(!putinTheWordl){
           getWorld().addObject(count, getX()+40, getY()+10);
           putinTheWordl = true;
       }
       count.update(Player.keys);   
    }
 }
    

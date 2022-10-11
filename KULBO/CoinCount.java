import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CoinCount here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CoinCount extends HUD
{
    /**
     * Act - do whatever the CoinCount wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CoinCount(){
        getImage().scale(40,40);
        setImage(getImage());
            count = new ItemCount();   
    }
    ItemCount count;
    public boolean putinTheWordl = false;
    public void act()
    {
       if(!putinTheWordl){
           getWorld().addObject(count, getX()+30, getY()+10);
           putinTheWordl = true;
       }
       count.update(Player.coins);   
    }
}

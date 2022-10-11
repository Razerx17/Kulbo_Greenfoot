import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class KeyCollected here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class KeyCollected extends Key
{
    /**
     * Act - do whatever the KeyCollected wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public KeyCollected(){
        getImage().scale(60,50);
        setImage(getImage());
        time = 100;
    }
    public void act()
    {
        remove();
    }
    
    public int time  = 0;
    public void remove(){
        if(time > 0){
            time--;
        }
        else{
            getWorld().removeObject(this);
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BigPath here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BigPath extends Paths
{
    /**
     * Act - do whatever the BigPath wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BigPath(){
        getImage().scale(200,200);
        setImage(getImage());
    }
    public void addedToWorld(World world){

        horizontal_path h2 = new horizontal_path();
       
        h2.getImage().scale(120,100);
        h2.setImage(h2.getImage());
        
        
        getWorld().addObject(h2, getX()-145  , getY());
    }
    public void act()
    {
        // Add your action code here.
    }
}

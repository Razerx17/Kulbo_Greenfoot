import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sign here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sign extends Text
{
    /**
     * Act - do whatever the Sign wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Sign(String img){
        GreenfootImage image = new GreenfootImage(img);
        image.scale(100,100);
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
}
